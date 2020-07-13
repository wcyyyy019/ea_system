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
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

//@RestController
@Controller
//@RequestMapping("/User")
@Api(description = "用户管理")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ICheckService checkService;
//    @Autowired
//    private ICompanyService companyService;
//    @Autowired
//    private IGraduateService graduateService;


//    @ModelAttribute
//    public void test1(String username,Map<String,Object> map){
//        if(username.equals("123456")){
//            map.put("test",Arrays.asList("Tom","Jerry","Mike"));
//        }else {
//            map.put("test",Arrays.asList(username));
//        }
//    }

    @RequestMapping("/loginin")
    @ApiOperation("登录校验")
    public String login(String username, String password, Map<String,Object> map){
        int id;
        if((id=userService.hasExist(username,password))!=0){
            UserEx userEx=userService.getUserEx(id);
            map.put("user",userEx);
//            map.put("name", Arrays.asList("Tom","Jerry","Mike"));
<<<<<<< HEAD
            return "indexCompany";
=======
            if(userEx.getUsertype()==2)
            return "indexPerson";
            else if(userEx.getUsertype()==1)
                return "indexCompany";
>>>>>>> abf83fb453cdabec2e8de7f19a0f39ebdc4311f4
        }

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

    @RequestMapping("/getAll")
    @ApiOperation("查询所有用户")
    public Message listAllUser(){
       return MessageUtil.success(userService.listAllUser());
    }


}
