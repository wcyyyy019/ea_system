package com.example.ea_system.bean;

import java.io.Serializable;
import java.util.Date;

public class Work_Experience implements Serializable {
    private Integer graduateid;

    private Date starttime;

    private Date endtime;

    private String workcompany;

    private String department;

    private String post;

    private String grade;

    private static final long serialVersionUID = 1L;

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
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

    public String getWorkcompany() {
        return workcompany;
    }

    public void setWorkcompany(String workcompany) {
        this.workcompany = workcompany == null ? null : workcompany.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", graduateid=").append(graduateid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", workcompany=").append(workcompany);
        sb.append(", department=").append(department);
        sb.append(", post=").append(post);
        sb.append(", grade=").append(grade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}