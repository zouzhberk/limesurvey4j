package com.limesurvey.remotecotrol.internel;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class JsonRPCConverterFactory extends Converter.Factory {
    private JsonRPCConverterFactory() {
        // Private constructor.
    }

    public static JsonRPCConverterFactory create() {
        return new JsonRPCConverterFactory();
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (!Utils.isAnnotationPresent(annotations, JsonRPC.class)) {
            return null;
        }

        Type rpcType = Types.newParameterizedType(JsonRPCResponse.class, type);
        System.out.println(rpcType);
        Converter<ResponseBody, JsonRPCResponse> delegate =

                retrofit.nextResponseBodyConverter(this, rpcType, annotations);
        //noinspection unchecked
        return new JsonRPCResponseBodyConverter(delegate);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotations, Annotation[]
            methodAnnotations, Retrofit retrofit) {
        JsonRPC methodAnnotation = Utils.findAnnotation(methodAnnotations, JsonRPC.class);
        if (methodAnnotation == null) {
            return null;
        }
        String method = methodAnnotation.value();

        Converter<JsonRPCRequest, RequestBody> delegate = retrofit.nextRequestBodyConverter(this, JsonRPCRequest
                .class, annotations, methodAnnotations);
        //noinspection unchecked
        return new JsonRPCRequestBodyConverter(method, delegate);
    }

    static class JsonRPCResponseBodyConverter<T> implements Converter<ResponseBody, T> {
        final Converter<ResponseBody, JsonRPCResponse<T>> delegate;

        JsonRPCResponseBodyConverter(Converter<ResponseBody, JsonRPCResponse<T>> delegate) {
            this.delegate = delegate;
        }

        @Override
        public T convert(ResponseBody responseBody) throws IOException {
            Gson gson = new Gson();
//          System.out.println(responseBody.string());

            byte[] a = responseBody.bytes();

            try {
                JsonRPCResponse<T> response = delegate.convert(ResponseBody.create(responseBody.contentType(), a));
                return response.result;
            } catch (Exception e) {
                ErrorRPCResponse response = gson.fromJson(new String(a), ErrorRPCResponse.class);

                throw new IOException(response.getResult().getStatus());
            } finally {
                responseBody.close();
            }

        }
    }

    static class JsonRPCRequestBodyConverter<T> implements Converter<T, RequestBody> {
        private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        final String method;
        final Converter<JsonRPCRequest, RequestBody> delegate;

        JsonRPCRequestBodyConverter(String method, Converter<JsonRPCRequest, RequestBody> delegate) {
            this.method = method;
            this.delegate = delegate;
        }

        @Override
        public RequestBody convert(T value) throws IOException {
            Gson gson = new Gson();
            System.out.println(gson.toJson(value));
            JsonRPCRequest request = JsonRPCRequest.create(method, value);

            return RequestBody.create(JSON, gson.toJson(request));
        }
    }
}
