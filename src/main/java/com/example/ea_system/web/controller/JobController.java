package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Job;
import com.example.ea_system.service.IJobService;
import com.example.ea_system.service.ILoginerService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;


import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Controller
//@RestController
@RestController
@RequestMapping("/Job")
@Api(description = "职位信息管理")
public class JobController {
    @Autowired
    private IJobService jobService;

    @Autowired
    private ILoginerService loginerService;

    @RequestMapping("/add")
    @ApiOperation("增加职位信息")
    public Message add(Job job) throws Exception {
        job.setCompanyid(loginerService.getLoginer().get(0).getCompanyid());
        jobService.addAndUpdate(job);
        return MessageUtil.success(job.getJobid());
    }

    @RequestMapping("/getAllJob")
    @ResponseBody
    public UIMessage<Job> getAllJob(){
        List<Job> jobs = jobService.getAllJob();
        UIMessage<Job> uiMessage = new UIMessage<Job>();
        uiMessage.setData(jobs);
        uiMessage.setCount((long) jobs.size());
        uiMessage.setMsg("success");
        uiMessage.setCode(0);
        return uiMessage;
    }

    @RequestMapping("/getJobByCompanyeId")
    @ResponseBody
    public UIMessage<Job> getJobByCompanyeId() throws Exception {
        int companyid =loginerService.getLoginer().get(0).getCompanyid();
        List<Job> jobs = jobService.getJobByCompanyId(companyid);
        UIMessage<Job> uiMessage = new UIMessage<Job>();
        uiMessage.setData(jobs);
        uiMessage.setCount((long) jobs.size());
        uiMessage.setMsg("success");
        uiMessage.setCode(0);
        return uiMessage;
    }



    @PostMapping("/delete")
    @ApiOperation("删除职位信息")
    public Message delete(int id)
    {
        jobService.deleteByID(id);
        return MessageUtil.success();
    }

    @GetMapping("select")
    @ApiOperation("查看所有职位")
    public Message selectAll()
    {
       List<Job> l=jobService.selectAll();
        return MessageUtil.success(l);
    }
}
