package com.limesurvey.remotecotrol;

import com.limesurvey.remotecotrol.feature.SessionService;
import com.limesurvey.remotecotrol.internel.JsonRPCConverterFactory;
import com.limesurvey.remotecotrol.options.GetSessionKeyOptions;
import com.limesurvey.remotecotrol.options.ReleaseSessionKeyOptions;
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

    public LimeSurveyClient(String baseUrl) {
        retrofit = new Retrofit.Builder().addConverterFactory(JsonRPCConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
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
