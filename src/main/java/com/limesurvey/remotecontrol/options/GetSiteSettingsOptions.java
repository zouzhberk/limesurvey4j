
package com.limesurvey.remotecontrol.options;

import java.io.Serializable;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 * 
 */
public class GetSiteSettingsOptions
    implements Serializable
{

    private String sSessionKey;
    private String sSetttingName;

    public void setSessionKey(String sessionKey) {
        sSessionKey = sessionKey;
    }

    public String getSessionKey() {
        return sSessionKey;
    }

    public void setSetttingName(String setttingName) {
        sSetttingName = setttingName;
    }

    public String getSetttingName() {
        return sSetttingName;
    }

}
