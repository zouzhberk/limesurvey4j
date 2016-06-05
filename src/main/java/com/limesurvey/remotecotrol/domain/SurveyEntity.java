package com.limesurvey.remotecotrol.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by berk on 6/5/16.
 */
public class SurveyEntity {

    /**
     * sid : 699185
     * surveyls_title : 测试
     * startdate : 2016-05-02 00:00:00
     * expires : 2016-05-17 00:00:00
     * active : Y
     */

    private int sid;
    @SerializedName("surveyls_title")
    private String surveylsTitle;
    private Date startdate;
    private Date expires;
    private String active;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSurveylsTitle() {
        return surveylsTitle;
    }

    public void setSurveylsTitle(String surveylsTitle) {
        this.surveylsTitle = surveylsTitle;
    }

    public Date getStartdate() {
        return startdate;
    }

    public SurveyEntity setStartdate(Date startdate) {
        this.startdate = startdate;
        return this;
    }

    public Date getExpires() {
        return expires;
    }

    public SurveyEntity setExpires(Date expires) {
        this.expires = expires;
        return this;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
