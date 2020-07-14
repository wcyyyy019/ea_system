package com.example.ea_system.web.controller;


import com.example.ea_system.bean.Company;
import com.example.ea_system.bean.Job;
import com.example.ea_system.service.ICompanyService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Company")
@Api(description = "公司信息管理")
public class CompanyController {
    @Autowired
    private ICompanyService companyService;


    @PostMapping("/add")
    @ApiOperation("添加企业信息")
    public Message add(Company company)
    {
        companyService.addAndUpdate(company);
        return MessageUtil.success(company.getCompanyid());
    }

    @PostMapping("/delete")
    @ApiOperation("删除企业信息")
    public Message delete(int id)
    {
        companyService.deleteByID(id);
        return MessageUtil.success();
    }

    @GetMapping("/selectall")
    @ApiOperation("查询所有企业")
    public Message selectAll()
    {
       List<Company> c= companyService.selectAll();
        return MessageUtil.success(c);
    }

    @GetMapping("/selectjob")
    @ApiOperation("根据企业id查找职位")
    public Message selectJob(int id)
    {
        List<Job> list=companyService.selectBycompany(id);
        return MessageUtil.success(list);
    }


}
