package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Check;
import com.example.ea_system.mapper.CheckMapper;
import com.example.ea_system.service.ICheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements ICheckService {
    @Autowired
    private CheckMapper checkMapper;


    @Override
    public void init(int userId) throws RuntimeException {
        Check check = new Check();
        check.setUserid(userId);
        check.setPersonalinformation((byte) 0);
        check.setBan((byte) 0);
        checkMapper.insert(check);
    }
}
