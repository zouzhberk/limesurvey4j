
package com.limesurvey.remotecotrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class ActivateTokensOptions
    implements Serializable
{

    private String sSessionKey;
    private String iSurveyID;
    private Object aAttributeFields;

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

    public void setAttributeFields(Object attributeFields) {
        aAttributeFields = attributeFields;
    }

    public Object getAttributeFields() {
        return aAttributeFields;
    }

}
