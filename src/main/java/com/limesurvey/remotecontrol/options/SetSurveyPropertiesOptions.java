
package com.limesurvey.remotecontrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class SetSurveyPropertiesOptions
    implements Serializable
{

    private String sSessionKey;
    private String iSurveyID;
    private String aSurveyData;

    public void setSessionKey(String sessionKey) {
        sSessionKey = sessionKey;
    }

    public String getSessionKey() {
        return sSessionKey;
    }

    public void setSurveyID(String surveyID) {
        iSurveyID = surveyID;
    }

    public String getSurveyID() {
        return iSurveyID;
    }

    public void setSurveyData(String surveyData) {
        aSurveyData = surveyData;
    }

    public String getSurveyData() {
        return aSurveyData;
    }

}
