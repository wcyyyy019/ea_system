package com.example.ea_system.bean;

import java.io.Serializable;
import java.util.Date;

public class Job implements Serializable {
    private Integer jobid;

    private Integer companyid;

    private String jobname;

    private String requirement;

    private String address;

    private Integer number;

    private Double salary;

    private String otherpay;

    private Date closedate;

    private String described;

    private static final long serialVersionUID = 1L;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getOtherpay() {
        return otherpay;
    }

    public void setOtherpay(String otherpay) {
        this.otherpay = otherpay == null ? null : otherpay.trim();
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described == null ? null : described.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobid=").append(jobid);
        sb.append(", companyid=").append(companyid);
        sb.append(", jobname=").append(jobname);
        sb.append(", requirement=").append(requirement);
        sb.append(", address=").append(address);
        sb.append(", number=").append(number);
        sb.append(", salary=").append(salary);
        sb.append(", otherpay=").append(otherpay);
        sb.append(", closedate=").append(closedate);
        sb.append(", described=").append(described);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}