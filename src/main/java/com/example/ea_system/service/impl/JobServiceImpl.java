package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Job;
import com.example.ea_system.mapper.JobMapper;
import com.example.ea_system.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements IJobService {

    @Autowired
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
}
