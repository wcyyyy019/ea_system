package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Job;
import com.example.ea_system.bean.JobExample;
import com.example.ea_system.mapper.JobMapper;
import com.example.ea_system.mapper.LoginerMapper;
import com.example.ea_system.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements IJobService {

    @Autowired(required = false)
     private JobMapper jobMapper;



    @Override
    public void addAndUpdate(Job job) throws RuntimeException {
        if (job == null) throw new RuntimeException();

        if (job.getJobid() == null) {
            jobMapper.insert(job);

        } else {
            jobMapper.updateByPrimaryKey(job);
        }
    }

    @Override
    public void deleteByID(int id) throws RuntimeException {
        jobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Job> getAllJob() throws RuntimeException {
        JobExample jobExample =new JobExample();

        return  jobMapper.selectByExample(jobExample);
    }

    @Override
    public List<Job> getJobByCompanyId(int companyId) throws RuntimeException {
        JobExample jobExample =new JobExample();
        jobExample.createCriteria().andCompanyidEqualTo(companyId);
        return  jobMapper.selectByExample(jobExample);
    }


}
