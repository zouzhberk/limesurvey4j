package com.limesurvey.remotecontrol.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by berk on 6/5/16.
 */
public class SuerveySummaryEntity {


    /**
     * completed_responses : 0
     * incomplete_responses : 0
     * full_responses : 0
     */

    @SerializedName("completed_responses")
    private String completedResponses;
    @SerializedName("incomplete_responses")
    private String incompleteResponses;
    @SerializedName("full_responses")
    private String fullResponses;

    @Override
    public String toString() {
        return "SuerveySummaryEntity{" +
                "completedResponses='" + completedResponses + '\'' +
                ", incompleteResponses='" + incompleteResponses + '\'' +
                ", fullResponses='" + fullResponses + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    private String status;

    public String getCompletedResponses() {
        return completedResponses;
    }

    public void setCompletedResponses(String completedResponses) {
        this.completedResponses = completedResponses;
    }

    public String getIncompleteResponses() {
        return incompleteResponses;
    }

    public void setIncompleteResponses(String incompleteResponses) {
        this.incompleteResponses = incompleteResponses;
    }

    public String getFullResponses() {
        return fullResponses;
    }

    public void setFullResponses(String fullResponses) {
        this.fullResponses = fullResponses;
    }

    public SuerveySummaryEntity setStatus(String status) {
        this.status = status;
        return this;
    }
}
