package com.example.ea_system.web.controller;


import com.example.ea_system.bean.Graduate;
import com.example.ea_system.service.IGraduateService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;

import java.util.Date;

@RestController
@RequestMapping("/Graduate")
@Api(description = "毕业生信息管理")
public class GraduateController {
    @Autowired
    private IGraduateService graduateService;


    @PostMapping("/add")
    @ApiOperation("添加毕业生信息")
    public Message add(Graduate graduate)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        graduateService.addAndUpdate(graduate);
        return MessageUtil.success(graduate.getGraduateid());
    }
}
