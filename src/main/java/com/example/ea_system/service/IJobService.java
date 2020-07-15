package com.example.ea_system.service;

import com.example.ea_system.bean.Job;
import com.example.ea_system.bean.Resume;

import java.util.List;

public interface IJobService {
    void addAndUpdate(Job job) throws RuntimeException;
    void deleteByID(int id) throws RuntimeException;
    void deleteByIDS(int[] ids) throws RuntimeException;
    List<Job> getAllJob() throws RuntimeException;
    List<Job> getJobByCompanyId(int companyId) throws RuntimeException;
    List<Job> selectAll() throws RuntimeException;
    List<Job> selectName(String title) throws RuntimeException;
}
