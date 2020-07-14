package com.example.ea_system.bean;

import java.io.Serializable;

public class Favourite implements Serializable {
    private Integer favouriteid;

    private Integer graduateid;

    private Integer companyid;

    private Byte check;

    private static final long serialVersionUID = 1L;

    public Integer getFavouriteid() {
        return favouriteid;
    }

    public void setFavouriteid(Integer favouriteid) {
        this.favouriteid = favouriteid;
    }

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Byte getCheck() {
        return check;
    }

    public void setCheck(Byte check) {
        this.check = check;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", favouriteid=").append(favouriteid);
        sb.append(", graduateid=").append(graduateid);
        sb.append(", companyid=").append(companyid);
        sb.append(", check=").append(check);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}