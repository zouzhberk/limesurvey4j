package com.limesurvey.remotecontrol.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by berk on 6/11/16.
 */
public class QuestionEntity {

    /**
     * qid : 47
     * language : zh-Hans
     */

    private QuestionIdEntity id;


    private String qid;
    @SerializedName("parent_qid")
    private String parentQid;
    private String sid;
    private String gid;
    private String type;
    private String title;
    private String question;
    private String preg;
    private String help;
    private String other;
    private String mandatory;
    @SerializedName("question_order")
    private String questionOrder;
    private String language;
    @SerializedName("scale_id")
    private String scaleId;
    @SerializedName("same_default")
    private String sameDefault;
    private String relevance;

    public QuestionIdEntity getId() {
        return id;
    }

    public void setId(QuestionIdEntity id) {
        this.id = id;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getParentQid() {
        return parentQid;
    }

    public void setParentQid(String parentQid) {
        this.parentQid = parentQid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPreg() {
        return preg;
    }

    public void setPreg(String preg) {
        this.preg = preg;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    public String getQuestionOrder() {
        return questionOrder;
    }

    public void setQuestionOrder(String questionOrder) {
        this.questionOrder = questionOrder;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getScaleId() {
        return scaleId;
    }

    public void setScaleId(String scaleId) {
        this.scaleId = scaleId;
    }

    public String getSameDefault() {
        return sameDefault;
    }

    public void setSameDefault(String sameDefault) {
        this.sameDefault = sameDefault;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public static class QuestionIdEntity {
        private String qid;
        private String language;

        public String getQid() {
            return qid;
        }

        public void setQid(String qid) {
            this.qid = qid;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }
}
