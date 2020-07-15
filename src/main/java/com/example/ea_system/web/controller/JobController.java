package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Job;
import com.example.ea_system.bean.Resume;
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
        System.out.println("hello");
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



    @RequestMapping("/delete")
    @ApiOperation("删除职位信息")
    @ResponseBody
    public UIMessage delete(int id)
    {
        jobService.deleteByID(id);
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;
    }

    @RequestMapping("/deleteMany")
    @ApiOperation("删除职位信息")
    @ResponseBody
    public UIMessage deleteMany(int[] ids)
    {
        jobService.deleteByIDS(ids);
//        System.out.println("批量删除成功");
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;
    }

    @GetMapping("/select")
    @ApiOperation("查看所有职位")
    public Message selectAll()
    {
       List<Job> l=jobService.selectAll();
        return MessageUtil.success(l);
    }

    @GetMapping("/selectByTitle")
    @ApiOperation("通过标题进行模糊查询")
    @ResponseBody
    public UIMessage<Job> selectByTitle(String search)
    {
//         System.out.println("查询"+search);
        List<Job> list=jobService.selectName(search);
        UIMessage<Job> resumeUIMessage = new UIMessage<Job>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//         System.out.println(resumeUIMessage.getData());
        return resumeUIMessage;
    }


}
