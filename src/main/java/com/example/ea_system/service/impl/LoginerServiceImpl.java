package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Loginer;
import com.example.ea_system.bean.LoginerExample;
import com.example.ea_system.mapper.LoginerMapper;
import com.example.ea_system.service.ILoginerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginerServiceImpl implements ILoginerService {

    @Autowired
    private LoginerMapper loginerMapper;

    @Override
    public void NewLoginer(Loginer loginer) throws Exception {
        loginerMapper.insert(loginer);
    }

    @Override
    public void DeleteLoginer() throws Exception {
        LoginerExample loginerExample = new LoginerExample();
        loginerExample.createCriteria().andUseridIsNotNull();
        loginerMapper.deleteByExample(loginerExample);
    }

    @Override
    public List<Loginer> getLoginer() throws Exception {
        LoginerExample loginerExample = new LoginerExample();
        loginerExample.createCriteria().andUseridIsNotNull();
        List<Loginer> Loginer = loginerMapper.selectByExample(loginerExample);
        return Loginer;
    }
}
