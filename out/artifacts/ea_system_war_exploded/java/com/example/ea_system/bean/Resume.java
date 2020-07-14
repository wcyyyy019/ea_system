package com.example.ea_system.bean;

import java.io.Serializable;

public class Resume implements Serializable {
    private Integer resumeid;

    private Integer graduateid;

    private String title;

    private String content;

    private String adjunct;

    private static final long serialVersionUID = 1L;

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAdjunct() {
        return adjunct;
    }

    public void setAdjunct(String adjunct) {
        this.adjunct = adjunct == null ? null : adjunct.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resumeid=").append(resumeid);
        sb.append(", graduateid=").append(graduateid);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", adjunct=").append(adjunct);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}