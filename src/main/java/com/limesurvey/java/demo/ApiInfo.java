package com.limesurvey.java.demo;


import java.util.Arrays;
import java.util.Set;

/**
 * Created by berk on 6/1/16.
 */
public class ApiInfo {

    private String functionName;

    //@access
    private boolean isPublic;

    private String[] comments;

    private Set<ParamInfo> params;

    private ReturnInfo returnInfo;

    public String getFunctionName() {
        return functionName;
    }

    public ApiInfo setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public ApiInfo setPublic(boolean aPublic) {
        isPublic = aPublic;
        return this;
    }

    public String[] getComments() {
        return comments;
    }

    public ApiInfo setComments(String[] comments) {
        this.comments = comments;
        return this;
    }

    public Set<ParamInfo> getParams() {
        return params;
    }

    public ApiInfo setParams(Set<ParamInfo> params) {
        this.params = params;
        return this;
    }

    public ReturnInfo getReturnInfo() {
        return returnInfo;
    }

    public ApiInfo setReturnInfo(ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    public static class ReturnInfo {
        private String type;
        private String comment;

        public String getType() {
            return type;
        }

        public ReturnInfo setType(String type) {
            this.type = type;
            return this;
        }

        public String getComment() {
            return comment;
        }

        public ReturnInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }

        @Override
        public String toString() {
            return "ReturnInfo{" +
                    "type='" + type + '\'' +
                    ", comment='" + comment + '\'' +
                    '}';
        }
    }


    public static class ParamInfo {
        private String type;
        private String name;
        private String comment;

        public String getType() {
            return type;
        }

        public ParamInfo setType(String type) {
            this.type = type;
            return this;
        }

        public String getName() {
            return name;
        }

        public ParamInfo setName(String name) {
            this.name = name;
            return this;
        }

        public String getComment() {
            return comment;
        }

        public ParamInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }

        @Override
        public String toString() {
            return "ParamInfo{" +
                    "type='" + type + '\'' +
                    ", name='" + name + '\'' +
                    ", comment='" + comment + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ApiInfo{" +
                "functionName='" + functionName + '\'' +
                ", isPublic=" + isPublic +
                ", comments=" + Arrays.toString(comments) +
                ", params=" + params +
                ", returnInfo=" + returnInfo +
                '}';
    }
}
