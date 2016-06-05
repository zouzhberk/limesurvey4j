package com.limesurvey.remotecotrol.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by berk on 6/5/16.
 */
public class UserEntity {


    private String uid;
    @SerializedName("users_name")
    private String username;
    @SerializedName("full_name")
    private String fullname;
    @SerializedName("parent_id")
    private String parentId;
    private String email;
    private String htmleditormode;
    private String templateeditormode;
    private String questionselectormode;
    private String dateformat;
    private String created;
    private String modified;
    private String lang;
    /**
     * id : 1
     * entity : global
     * entity_id : 0
     * uid : 1
     * permission : superadmin
     * create_p : 0
     * read_p : 1
     * update_p : 0
     * delete_p : 0
     * import_p : 0
     * export_p : 0
     */

    private List<PermissionsEntity> permissions;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHtmleditormode() {
        return htmleditormode;
    }

    public void setHtmleditormode(String htmleditormode) {
        this.htmleditormode = htmleditormode;
    }

    public String getTemplateeditormode() {
        return templateeditormode;
    }

    public void setTemplateeditormode(String templateeditormode) {
        this.templateeditormode = templateeditormode;
    }

    public String getQuestionselectormode() {
        return questionselectormode;
    }

    public void setQuestionselectormode(String questionselectormode) {
        this.questionselectormode = questionselectormode;
    }

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<PermissionsEntity> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionsEntity> permissions) {
        this.permissions = permissions;
    }

    public static class PermissionsEntity {
        private String id;
        private String entity;
        @SerializedName("entity_id")
        private String entityId;
        private String uid;
        private String permission;
        @SerializedName("create_p")
        private String createp;
        @SerializedName("read_p")
        private String readp;
        @SerializedName("update_p")
        private String updatep;
        @SerializedName("delete_p")
        private String deletep;
        @SerializedName("import_p")
        private String importp;
        @SerializedName("export_p")
        private String exportp;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEntity() {
            return entity;
        }

        public void setEntity(String entity) {
            this.entity = entity;
        }

        public String getEntityId() {
            return entityId;
        }

        public void setEntityId(String entityId) {
            this.entityId = entityId;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getPermission() {
            return permission;
        }

        public void setPermission(String permission) {
            this.permission = permission;
        }

        public String getCreatep() {
            return createp;
        }

        public void setCreatep(String createp) {
            this.createp = createp;
        }

        public String getReadp() {
            return readp;
        }

        public void setReadp(String readp) {
            this.readp = readp;
        }

        public String getUpdatep() {
            return updatep;
        }

        public void setUpdatep(String updatep) {
            this.updatep = updatep;
        }

        public String getDeletep() {
            return deletep;
        }

        public void setDeletep(String deletep) {
            this.deletep = deletep;
        }

        public String getImportp() {
            return importp;
        }

        public void setImportp(String importp) {
            this.importp = importp;
        }

        public String getExportp() {
            return exportp;
        }

        public void setExportp(String exportp) {
            this.exportp = exportp;
        }
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", parentId='" + parentId + '\'' +
                ", email='" + email + '\'' +
                ", htmleditormode='" + htmleditormode + '\'' +
                ", templateeditormode='" + templateeditormode + '\'' +
                ", questionselectormode='" + questionselectormode + '\'' +
                ", dateformat='" + dateformat + '\'' +
                ", created='" + created + '\'' +
                ", modified='" + modified + '\'' +
                ", lang='" + lang + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
