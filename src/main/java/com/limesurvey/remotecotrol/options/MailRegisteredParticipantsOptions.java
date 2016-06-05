
package com.limesurvey.remotecotrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class MailRegisteredParticipantsOptions
    implements Serializable
{

    private String sSessionKey;
    private Integer iSurveyID;
    private Object overrideAllConditions;

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

    public void setOverrideAllConditions(Object overrideAllConditions) {
        overrideAllConditions = overrideAllConditions;
    }

    public Object getOverrideAllConditions() {
        return overrideAllConditions;
    }

}
