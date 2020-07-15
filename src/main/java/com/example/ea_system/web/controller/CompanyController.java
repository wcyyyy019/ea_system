package com.example.ea_system.web.controller;


import com.example.ea_system.bean.Company;
import com.example.ea_system.bean.Job;
import com.example.ea_system.service.ICompanyService;
import com.example.ea_system.service.ILoginerService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/Company")
@Api(description = "公司信息管理")
public class CompanyController {
    @Autowired
    private ICompanyService companyService;

    @Autowired
    private ILoginerService loginerService;

    @PostMapping("/add")
    @ApiOperation("添加企业信息")
    public Message add(Company company)
    {
        companyService.addAndUpdate(company);
        return MessageUtil.success(company.getCompanyid());
    }

    @PostMapping("/update")
    @ApiOperation("添加企业信息")
    public UIMessage update(Company company) throws Exception {
//        System.out.println(company);
        company.setUserid(loginerService.getLoginer().get(0).getUserid());
        company.setCompanyid(loginerService.getLoginer().get(0).getCompanyid());
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");

        companyService.addAndUpdate(company);
        return uiMessage;
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
    @ResponseBody
    public UIMessage<Company> selectAll()
    {
//         System.out.println("查询进入");
        List<Company> c= companyService.selectAll();
        UIMessage<Company> uiMessage = new UIMessage<Company>();
        uiMessage.setCode(0);
        uiMessage.setMsg("success");
        uiMessage.setCount((long) c.size());
        uiMessage.setData(c);
//         System.out.println(uiMessage.getData());
        return uiMessage;
    }

    @GetMapping("/selectjob")
    @ApiOperation("根据企业id查找职位")
    public Message selectJob(int id)
    {
        List<Job> list=companyService.selectBycompany(id);
        return MessageUtil.success(list);
    }

    @GetMapping("/selectByTitle")
    @ApiOperation("通过标题进行模糊查询")
    @ResponseBody
    public UIMessage<Company> selectByTitle(String search)
    {
//         System.out.println("查询"+search);
        List<Company> list=companyService.selectName(search);
        UIMessage<Company> resumeUIMessage = new UIMessage<Company>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//         System.out.println(resumeUIMessage.getData());
        return resumeUIMessage;
    }

}
