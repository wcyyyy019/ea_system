package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Resume;
import com.example.ea_system.service.IResumeService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/Resume")
@Api(description = "简历信息")
public class ResumeController {

    @Autowired
    private IResumeService resumeService;

    @RequestMapping("/selectAll")
    @ApiOperation("查询所有信息")
    @ResponseBody
    public UIMessage<Resume> select()
    {
        List<Resume> list=resumeService.selectAll();
        UIMessage<Resume> resumeUIMessage = new UIMessage<Resume>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//        System.out.println(111);
       return resumeUIMessage;
    }

    @GetMapping("selectByID")
    @ApiOperation("根据ID查询对应简历")
    public Message selectByID(int id)
    {
        List<Resume> l=resumeService.selectByID(id);
        return MessageUtil.success(l);
    }

    @GetMapping("selectByTitle")
    @ApiOperation("通过标题进行模糊查询")
    public Message selectByTitle(String title)
    {
        List<Resume> l=resumeService.selectName(title);
        return MessageUtil.success(l);
    }


}