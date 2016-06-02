
package com.limesurvey.remotecotrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class ExportStatisticsOptions
    implements Serializable
{

    private String sSessionKey;
    private Integer iSurveyID;
    private String docType;
    private String sLanguage;
    private String graph;
    private String groupIDs;

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

    public void setDocType(String docType) {
        docType = docType;
    }

    public String getDocType() {
        return docType;
    }

    public void setLanguage(String language) {
        sLanguage = language;
    }

    public String getLanguage() {
        return sLanguage;
    }

    public void setGraph(String graph) {
        graph = graph;
    }

    public String getGraph() {
        return graph;
    }

    public void setGroupIDs(String groupIDs) {
        groupIDs = groupIDs;
    }

    public String getGroupIDs() {
        return groupIDs;
    }

}