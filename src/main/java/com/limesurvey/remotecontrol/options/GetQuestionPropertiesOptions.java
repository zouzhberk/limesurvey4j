
package com.limesurvey.remotecontrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class GetQuestionPropertiesOptions
    implements Serializable
{

    private String sSessionKey;
    private Integer iQuestionID;
    private Object aQuestionSettings;
    private String sLanguage;

    public void setSessionKey(String sessionKey) {
        sSessionKey = sessionKey;
    }

    public String getSessionKey() {
        return sSessionKey;
    }

    public void setQuestionID(Integer questionID) {
        iQuestionID = questionID;
    }

    public Integer getQuestionID() {
        return iQuestionID;
    }

    public void setQuestionSettings(Object questionSettings) {
        aQuestionSettings = questionSettings;
    }

    public Object getQuestionSettings() {
        return aQuestionSettings;
    }

    public void setLanguage(String language) {
        sLanguage = language;
    }

    public String getLanguage() {
        return sLanguage;
    }

}
