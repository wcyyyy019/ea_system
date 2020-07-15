package com.example.ea_system.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@ApiModel
public class Graduate implements Serializable {
    private Integer graduateid;

    private Integer userid;

    private String name;

    private String sex;

    private String nationality;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String maritalstatus;

    private Double height;

    private Double weight;

    private String idcardno;

    private String nativeplace;

    private Integer phonenumber;

    private Integer qqnumber;

    private String email;

    private String postalcode;

    private String address;

    private String selfAssessment;

    private String school;

    private String major;

    private String degree;

    private String computerrank;

    private String firstforeignlanguage;

    private String firstlevel;

    private String secondforeignlanguage;

    private String secondlevel;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus == null ? null : maritalstatus.trim();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(Integer qqnumber) {
        this.qqnumber = qqnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSelfAssessment() {
        return selfAssessment;
    }

    public void setSelfAssessment(String selfAssessment) {
        this.selfAssessment = selfAssessment == null ? null : selfAssessment.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getComputerrank() {
        return computerrank;
    }

    public void setComputerrank(String computerrank) {
        this.computerrank = computerrank == null ? null : computerrank.trim();
    }

    public String getFirstforeignlanguage() {
        return firstforeignlanguage;
    }

    public void setFirstforeignlanguage(String firstforeignlanguage) {
        this.firstforeignlanguage = firstforeignlanguage == null ? null : firstforeignlanguage.trim();
    }

    public String getFirstlevel() {
        return firstlevel;
    }

    public void setFirstlevel(String firstlevel) {
        this.firstlevel = firstlevel == null ? null : firstlevel.trim();
    }

    public String getSecondforeignlanguage() {
        return secondforeignlanguage;
    }

    public void setSecondforeignlanguage(String secondforeignlanguage) {
        this.secondforeignlanguage = secondforeignlanguage == null ? null : secondforeignlanguage.trim();
    }

    public String getSecondlevel() {
        return secondlevel;
    }

    public void setSecondlevel(String secondlevel) {
        this.secondlevel = secondlevel == null ? null : secondlevel.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", graduateid=").append(graduateid);
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", nationality=").append(nationality);
        sb.append(", birthday=").append(birthday);
        sb.append(", maritalstatus=").append(maritalstatus);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", idcardno=").append(idcardno);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", qqnumber=").append(qqnumber);
        sb.append(", email=").append(email);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", address=").append(address);
        sb.append(", selfAssessment=").append(selfAssessment);
        sb.append(", school=").append(school);
        sb.append(", major=").append(major);
        sb.append(", degree=").append(degree);
        sb.append(", computerrank=").append(computerrank);
        sb.append(", firstforeignlanguage=").append(firstforeignlanguage);
        sb.append(", firstlevel=").append(firstlevel);
        sb.append(", secondforeignlanguage=").append(secondforeignlanguage);
        sb.append(", secondlevel=").append(secondlevel);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}