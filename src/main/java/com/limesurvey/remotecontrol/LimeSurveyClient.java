package com.limesurvey.remotecontrol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.limesurvey.remotecontrol.feature.SessionService;
import com.limesurvey.remotecontrol.internel.JsonRPCConverterFactory;
import com.limesurvey.remotecontrol.options.GetSessionKeyOptions;
import com.limesurvey.remotecontrol.options.ReleaseSessionKeyOptions;
import okhttp3.MediaType;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * Created by berk on 5/31/16.
 */
public class LimeSurveyClient {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String WEIXIN_API_SERVER_URL = "http://localhost/index.php/admin/";
    private final Retrofit retrofit;

    private LimeSurveyClient(String baseUrl) {
        Gson gson = new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        retrofit = new Retrofit.Builder().addConverterFactory(JsonRPCConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(baseUrl)
                .build();
    }

    public static void main(String[] args) throws IOException {
        LimeSurveyClient client = LimeSurveyClient.Builder.builder().baseUrl(WEIXIN_API_SERVER_URL).build();
        SessionService session = client.create(SessionService.class);
        GetSessionKeyOptions options = new GetSessionKeyOptions();
        options.setPassword("");
        options.setUsername("");
        session.getSessionKey(options).subscribe(System.out::println);
        ReleaseSessionKeyOptions options1 = new ReleaseSessionKeyOptions();
        options1.setSessionKey("e2sidhwv252iiwpkfaib8ffwb3xzmxzd");
        session.releaseSessionKey(options1).subscribe(System.out::println);
    }

    public <T> T create(Class<T> featureApi) {
        return retrofit.create(featureApi);
    }

    public static class Builder {
        private String baseUrl;

        public static Builder builder() {
            return new Builder();
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public LimeSurveyClient build() {
            return new LimeSurveyClient(baseUrl);
        }
    }
}
