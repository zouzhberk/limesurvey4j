
package com.limesurvey.remotecontrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class GetLanguagePropertiesOptions
    implements Serializable
{

    private String sSessionKey;
    private Integer iSurveyID;
    private Object aSurveyLocaleSettings;
    private String sLang;

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

    public void setSurveyLocaleSettings(Object surveyLocaleSettings) {
        aSurveyLocaleSettings = surveyLocaleSettings;
    }

    public Object getSurveyLocaleSettings() {
        return aSurveyLocaleSettings;
    }

    public void setLang(String lang) {
        sLang = lang;
    }

    public String getLang() {
        return sLang;
    }

}
