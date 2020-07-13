package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Job;
import com.example.ea_system.mapper.JobMapper;
import com.example.ea_system.mapper.ex.JobEXMapper;
import com.example.ea_system.service.IJobService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
