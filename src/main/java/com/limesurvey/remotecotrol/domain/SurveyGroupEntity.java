package com.limesurvey.remotecotrol.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by berk on 6/5/16.
 */
public class SurveyGroupEntity {

    /**
     * gid : 2
     * language : zh-Hans
     */

    private GroupIdEntity id;


    private String gid;
    private String sid;
    @SerializedName("group_name")
    private String groupName;
    @SerializedName("group_order")
    private String groupOrder;
    private String description;
    private String language;
    @SerializedName("randomization_group")
    private String randomizationGroup;
    private String grelevance;

    public GroupIdEntity getId() {
        return id;
    }

    public void setId(GroupIdEntity id) {
        this.id = id;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(String groupOrder) {
        this.groupOrder = groupOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRandomizationGroup() {
        return randomizationGroup;
    }

    public void setRandomizationGroup(String randomizationGroup) {
        this.randomizationGroup = randomizationGroup;
    }

    public String getGrelevance() {
        return grelevance;
    }

    public void setGrelevance(String grelevance) {
        this.grelevance = grelevance;
    }

    public static class GroupIdEntity {
        private String gid;
        private String language;

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        @Override
        public String toString() {
            return "GroupIdEntity{" +
                    "gid='" + gid + '\'' +
                    ", language='" + language + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SurveyGroupEntity{" +
                "id=" + id +
                ", gid='" + gid + '\'' +
                ", sid='" + sid + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupOrder='" + groupOrder + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", randomizationGroup='" + randomizationGroup + '\'' +
                ", grelevance='" + grelevance + '\'' +
                '}';
    }
}
