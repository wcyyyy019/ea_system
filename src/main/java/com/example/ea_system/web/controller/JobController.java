package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Job;
import com.example.ea_system.service.IJobService;
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
@RequestMapping("/Job")
@Api(description = "职位信息管理")
public class JobController {
    @Autowired
    private IJobService jobService;

    @PostMapping("/add")
    @ApiOperation("增加职位信息")
    public Message add(Job job)
    {
        jobService.addAndUpdate(job);
        return MessageUtil.success(job.getJobid());
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
