package com.example.ea_system.service;

import com.example.ea_system.bean.Job;

public interface IJobService {
    void addAndUpdate(Job job) throws RuntimeException;
}
