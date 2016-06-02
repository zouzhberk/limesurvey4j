package com.limesurvey.remotecotrol.feature;

import com.limesurvey.remotecotrol.internel.JsonRPC;
import com.limesurvey.remotecotrol.options.GetSessionKeyOptions;
import com.limesurvey.remotecotrol.options.ReleaseSessionKeyOptions;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by berk on 5/31/16.
 */
public interface SessionService
{
    @JsonRPC("get_session_key")
    @POST("remotecontrol")
    Observable<Object> getSessionKey(@Body GetSessionKeyOptions options);

    @JsonRPC("release_session_key")
    @POST("remotecontrol")
    Observable<String> releaseSessionKey(@Body ReleaseSessionKeyOptions options);
}

