package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Company;
import com.example.ea_system.mapper.CompanyMapper;
import com.example.ea_system.mapper.ex.CompanyExMapper;
import com.example.ea_system.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyExMapper companyExMapper;

    @Override
    public void init(int userid) throws RuntimeException {
        companyExMapper.init(userid);
    }
}
