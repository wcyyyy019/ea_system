package com.example.ea_system.bean;

import java.io.Serializable;
import java.util.Date;

public class Tutorial implements Serializable {
    private Integer tutorialid;

    private String title;

    private String content;

    private Date addtime;

    private Integer companyid;

    private static final long serialVersionUID = 1L;

    public Integer getTutorialid() {
        return tutorialid;
    }

    public void setTutorialid(Integer tutorialid) {
        this.tutorialid = tutorialid;
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

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tutorialid=").append(tutorialid);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", addtime=").append(addtime);
        sb.append(", companyid=").append(companyid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}