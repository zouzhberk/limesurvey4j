package com.limesurvey.remotecontrol.feature;

import com.limesurvey.remotecontrol.internel.JsonRPC;
import com.limesurvey.remotecontrol.options.GetSessionKeyOptions;
import com.limesurvey.remotecontrol.options.ReleaseSessionKeyOptions;
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

