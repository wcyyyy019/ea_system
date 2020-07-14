package com.example.ea_system.service;

import com.example.ea_system.bean.Job;

import java.util.List;

public interface IJobService {
    void addAndUpdate(Job job) throws RuntimeException;
    void deleteByID(int id) throws RuntimeException;
    List<Job> getAllJob() throws RuntimeException;
    List<Job> getJobByCompanyId(int companyId) throws RuntimeException;

}
