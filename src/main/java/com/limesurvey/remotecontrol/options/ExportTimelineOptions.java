
package com.limesurvey.remotecontrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class ExportTimelineOptions
    implements Serializable
{

    private String sSessionKey;
    private Integer iSurveyID;
    private String sType;
    private String dStart;
    private String dEnd;

    public void setSessionKey(String sessionKey) {
        sSessionKey = sessionKey;
    }

    public String getSessionKey() {
        return sSessionKey;
    }

    public void setSurveyID(Integer surveyID) {
        iSurveyID = surveyID;
    }

    public Integer getSurveyID() {
        return iSurveyID;
    }

    public void setType(String type) {
        sType = type;
    }

    public String getType() {
        return sType;
    }

    public void setStart(String start) {
        dStart = start;
    }

    public String getStart() {
        return dStart;
    }

    public void setEnd(String end) {
        dEnd = end;
    }

    public String getEnd() {
        return dEnd;
    }

}
