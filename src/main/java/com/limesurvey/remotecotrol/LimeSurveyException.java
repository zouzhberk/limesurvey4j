package com.limesurvey.remotecotrol;

/**
 * Created by berk on 6/5/16.
 */
public class LimeSurveyException extends Exception {

    public LimeSurveyException() {
    }

    public LimeSurveyException(String message) {
        super(message);
    }

    public LimeSurveyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LimeSurveyException(Throwable cause) {
        super(cause);
    }

    public LimeSurveyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
