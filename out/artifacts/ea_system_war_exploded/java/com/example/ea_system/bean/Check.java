package com.example.ea_system.bean;

import java.io.Serializable;

public class Check implements Serializable {
    private Integer userid;

    private Byte personalinformation;

    private Byte ban;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getPersonalinformation() {
        return personalinformation;
    }

    public void setPersonalinformation(Byte personalinformation) {
        this.personalinformation = personalinformation;
    }

    public Byte getBan() {
        return ban;
    }

    public void setBan(Byte ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", personalinformation=").append(personalinformation);
        sb.append(", ban=").append(ban);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}