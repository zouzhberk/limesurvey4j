package com.limesurvey.remotecotrol.domain;

/**
 * Created by berk on 6/5/16.
 */
public class ErrorEntity {
    public String getStatus() {
        return status;
    }

    public ErrorEntity setStatus(String status) {
        this.status = status;
        return this;
    }

    private String status;

    @Override
    public String toString() {
        return "ErrorEntity{" +
                "status='" + status + '\'' +
                '}';
    }
}
