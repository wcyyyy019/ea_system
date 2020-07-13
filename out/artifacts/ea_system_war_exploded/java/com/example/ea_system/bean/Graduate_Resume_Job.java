package com.example.ea_system.bean;

import java.io.Serializable;

public class Graduate_Resume_Job implements Serializable {
    private Integer resumeid;

    private Integer graduateid;

    private Integer jobid;

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

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resumeid=").append(resumeid);
        sb.append(", graduateid=").append(graduateid);
        sb.append(", jobid=").append(jobid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}