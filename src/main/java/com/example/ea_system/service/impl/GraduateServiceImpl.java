package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Graduate;
import com.example.ea_system.bean.GraduateExample;
import com.example.ea_system.mapper.GraduateMapper;
import com.example.ea_system.mapper.ex.GraduateExMapper;
import com.example.ea_system.service.IGraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraduateServiceImpl implements IGraduateService {

    @Autowired
    private GraduateMapper graduateMapper;

    @Autowired
    private GraduateExMapper graduateExMapper;

    @Override
    public void init(int userid) throws RuntimeException {
        graduateExMapper.init(userid);
    }
}
