
package com.limesurvey.remotecotrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class AddLanguageOptions
    implements Serializable
{

    private String sSessionKey;
    private String iSurveyID;
    private String sLanguage;

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

    public void setLanguage(String language) {
        sLanguage = language;
    }

    public String getLanguage() {
        return sLanguage;
    }

}
