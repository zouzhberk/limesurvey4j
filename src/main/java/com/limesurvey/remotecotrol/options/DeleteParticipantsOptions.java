
package com.limesurvey.remotecotrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class DeleteParticipantsOptions
    implements Serializable
{

    private String sSessionKey;
    private Integer iSurveyID;
    private Object aTokenIDs;

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

    public void setTokenIDs(Object tokenIDs) {
        aTokenIDs = tokenIDs;
    }

    public Object getTokenIDs() {
        return aTokenIDs;
    }

}
