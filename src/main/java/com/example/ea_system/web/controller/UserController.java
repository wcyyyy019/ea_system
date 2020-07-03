package com.example.ea_system.web.controller;

import com.example.ea_system.bean.User;
import com.example.ea_system.service.ICheckService;
import com.example.ea_system.service.IUserService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
@Api(description = "用户管理")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ICheckService checkService;

    @PostMapping("/add")
    @ApiOperation("增加用户")
    public Message add(User user) {
        userService.addAndUpdate(user);
        checkService.init(user.getUserid());
        return MessageUtil.success();
    }

    @PostMapping("/updateById")
    @ApiOperation("更新用户")
    public Message updateById(User user) {
        userService.addAndUpdate(user);
        return MessageUtil.success();
    }
}
