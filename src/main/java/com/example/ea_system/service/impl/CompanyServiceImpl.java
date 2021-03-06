package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Company;
import com.example.ea_system.bean.CompanyExample;
import com.example.ea_system.bean.Job;
import com.example.ea_system.mapper.CompanyMapper;
import com.example.ea_system.mapper.JobMapper;
import com.example.ea_system.mapper.ex.CompanyExMapper;
import com.example.ea_system.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private JobMapper jobMapper;

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
        CompanyExample companyExample = new CompanyExample();
        companyExample.createCriteria().andCompanyidIsNotNull();


        return companyMapper.selectByExample(companyExample);
    }

    @Override
    public Company getCompanyByUserid(int id) throws RuntimeException {
        CompanyExample companyExample =new CompanyExample();
        companyExample.createCriteria().andUseridEqualTo(id);
        List<Company> companys = companyMapper.selectByExample(companyExample);
        return companys.get(0);
        }
    @Override
    public List<Job> selectBycompany(int id) throws RuntimeException {
            List<Job> list=jobMapper.selectBycompany(id);
             return list;
    }

    @Override
    public List<Company> selectName(String title) throws RuntimeException {
        if ((title==null||"".equals(title))) {
            return selectAll();
        }else if(!"".equals(title))
        {
            //前者为空 后者不为空
            title="%"+title+"%";
            return companyMapper.selectName(title);
        }
        return null;
    }


}

