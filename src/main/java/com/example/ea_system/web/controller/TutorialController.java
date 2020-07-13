package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Tutorial;
import com.example.ea_system.service.ITutorialService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tutorial")
@Api(description = "就业指导管理")
public class TutorialController {
    @Autowired
    private ITutorialService tutorialService;

    @PostMapping("/add")
    @ApiOperation("添加就业指导")
    public Message add(Tutorial tutorial){
        tutorialService.addAndUpdate(tutorial);
        return MessageUtil.success(tutorial.getTutorialid());
    }

}
