package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Graduate;
import com.example.ea_system.mapper.GraduateMapper;
import com.example.ea_system.mapper.ex.GraduateExMapper;
import com.example.ea_system.service.IGraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraduateServiceImpl implements IGraduateService {

    @Autowired
    private GraduateMapper graduateMapper;

    @Override
    public void addAndUpdate(Graduate graduate) throws RuntimeException {
        if (graduate == null) throw new RuntimeException();

        if (graduate.getGraduateid() == null) {

            graduateMapper.insert(graduate);

        } else {
            graduateMapper.updateByPrimaryKey(graduate);
        }
    }


    @Autowired
    private GraduateExMapper graduateExMapper;

    @Override
    public void init(int userid) throws RuntimeException {
        graduateExMapper.init(userid);

    }
}
