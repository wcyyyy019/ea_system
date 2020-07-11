package com.example.ea_system.web.controller;

import com.example.ea_system.bean.User;
import com.example.ea_system.bean.ex.UserEx;
import com.example.ea_system.service.ICheckService;
import com.example.ea_system.service.IUserService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/User")
@Api(description = "用户管理")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ICheckService checkService;
//    @Autowired
//    private ICompanyService companyService;
//    @Autowired
//    private IGraduateService graduateService;

    @GetMapping("/loginin")
    @ApiOperation("登录校验")
    public String login(String username,String password){
        if(userService.hasExist(username,password)!=0)
            return "hello";
        return "register";
    }

    @PostMapping("/add")
    @ApiOperation("增加用户")
    public Message add(User user) {
        boolean hasExieted=userService.addAndUpdate(user);
        if (hasExieted){
            int id = user.getUserid();
            checkService.init(id);
//            if(user.getUsertype()==1)
//                companyService.init(id);
//            else if(user.getUsertype()==2)
//                graduateService.init(id);
            return MessageUtil.success(user.getUserid());
        }
        else{
            return MessageUtil.success("hasExist");
        }

    }

    @PostMapping("/updateById")
    @ApiOperation("更新用户")
    public Message updateById(User user) {
        userService.addAndUpdate(user);
        return MessageUtil.success(user.getUserid());
    }

    @GetMapping("/checkStatus")
    @ApiOperation("判断用户状态")
    public  Message checkStatus(int userid){

        UserEx userEx = userService.getUserEx(userid);
        if(checkService.hasBan(userEx))
            return MessageUtil.success("hasBan");
        else if (!checkService.hasPersonalInfoDo(userEx))
            return MessageUtil.success("nodo"+userEx);
        return MessageUtil.success(userEx);
    }

    @GetMapping("/getAll")
    @ApiOperation("查询所有用户")
    public Message listAllUser(){
       return MessageUtil.success(userService.listAllUser());
    }


}
