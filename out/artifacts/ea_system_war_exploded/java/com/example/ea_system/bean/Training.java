package com.example.ea_system.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Training implements Serializable {
    private Integer graduateid;

    private String trainingtype;

    private Date starttime;

    private Date endtime;

    private String timelimit;

    private String major;

    private String organization;

    private String content;

    private BigDecimal cost;

    private String result;

    private static final long serialVersionUID = 1L;

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
    }

    public String getTrainingtype() {
        return trainingtype;
    }

    public void setTrainingtype(String trainingtype) {
        this.trainingtype = trainingtype == null ? null : trainingtype.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(String timelimit) {
        this.timelimit = timelimit == null ? null : timelimit.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", graduateid=").append(graduateid);
        sb.append(", trainingtype=").append(trainingtype);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", timelimit=").append(timelimit);
        sb.append(", major=").append(major);
        sb.append(", organization=").append(organization);
        sb.append(", content=").append(content);
        sb.append(", cost=").append(cost);
        sb.append(", result=").append(result);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}