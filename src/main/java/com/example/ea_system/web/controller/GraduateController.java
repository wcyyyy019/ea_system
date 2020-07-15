package com.example.ea_system.web.controller;


import com.example.ea_system.bean.Graduate;
import com.example.ea_system.service.IGraduateService;
import com.example.ea_system.service.ILoginerService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/Graduate")
@Api(description = "毕业生信息管理")
public class GraduateController {
    @Autowired
    private IGraduateService graduateService;

    @Autowired
    private ILoginerService loginerService;

    @PostMapping("/add")
    @ApiOperation("添加毕业生信息")
    public Message add(Graduate graduate)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        graduateService.addAndUpdate(graduate);
        return MessageUtil.success(graduate.getGraduateid());
    }

    @PostMapping("/update")
    @ApiOperation("添加毕业生信息")
    public UIMessage update(Graduate graduate) throws Exception {
//         System.out.println(graduate);
        UIMessage uiMessage = new UIMessage();
        graduate.setUserid(loginerService.getLoginer().get(0).getUserid());
        graduate.setGraduateid(loginerService.getLoginer().get(0).getGraduaterid());
        graduate.setRemark("");
        graduate.setFirstlevel("");
        graduate.setFirstforeignlanguage("");
        graduate.setSecondforeignlanguage("");
        graduate.setSecondlevel("");
        graduateService.addAndUpdate(graduate);
        uiMessage.setMsg("success");

//        System.out.println(uiMessage.getData());
        return uiMessage;
    }
}
