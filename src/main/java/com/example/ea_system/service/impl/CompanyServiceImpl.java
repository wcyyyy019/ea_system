package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Company;
import com.example.ea_system.mapper.CompanyMapper;
import com.example.ea_system.mapper.ex.CompanyExMapper;
import com.example.ea_system.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public void addAndUpdate(Company company) throws RuntimeException {
        if (company == null) throw new RuntimeException();

        if (company.getCompanyid() == null) {

            companyMapper.insert(company);

        } else {
            companyMapper.updateByPrimaryKey(company);
        }
    }

    @Override
    public void deleteByID(int id) throws RuntimeException {
        companyMapper.deleteByPrimaryKey(id);
    }


        @Autowired
        private CompanyExMapper companyExMapper;

        @Override
        public void init ( int userid) throws RuntimeException {
            companyExMapper.init(userid);

        }

    @Override
    public List<Company> selectAll() throws RuntimeException {
        List<Company> list=companyMapper.selectAll();
        return list;
    }


}

