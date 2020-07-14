package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Loginer;
import com.example.ea_system.bean.User;
import com.example.ea_system.bean.ex.UserEx;
import com.example.ea_system.service.*;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
//@RequestMapping("/User")

@Api(description = "用户管理")
@SessionAttributes("loginer")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ICheckService checkService;
    @Autowired
    private ILoginerService loginerService;

    @Autowired
    private IGraduateService graduateService;
    @Autowired
    private ICompanyService companyService;
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
    public String login(String username, String password, Map<String,Object> map) throws Exception {
        int id;
        if((id=userService.hasExist(username,password))!=0){
            UserEx userEx=userService.getUserEx(id);
            Loginer loginer = new Loginer();
            loginer.setUserid(userEx.getUserid());
            loginer.setPassword(userEx.getPassword());
            loginer.setUsername(userEx.getUsername());


            if(userEx.getUsertype()==2){//学生
                loginer.setGraduaterid(graduateService.getGraduateByUserid(id).getGraduateid());
                loginer.setCompanyid(0);
                loginerService.NewLoginer(loginer);
                map.put("loginer",loginer);
//                System.out.println("登录成功"+loginer);
                return "indexPerson";
            }
            else if(userEx.getUsertype()==1){//企业
                loginer.setCompanyid(companyService.getCompanyByUserid(id).getCompanyid());
                loginer.setGraduaterid(0);
                loginerService.NewLoginer(loginer);
                map.put("loginer",loginer);
                return "indexCompany";
            }

        }

        return "Login";
    }


    @RequestMapping("/loginout")
    @ApiOperation("登出")
    public String loginout(Loginer loginer) throws Exception {
         loginerService.DeleteLoginer();
         return "Login";
    }


    @RequestMapping("/changePassword")
    @ApiOperation("修改密码")
    public UIMessage changePassword(HttpServletRequest request) throws Exception {
        String oldPwd = request.getParameter("oldPwd");
        String NewPwd = request.getParameter("NewPwd");
//        System.out.println(oldPwd+" "+NewPwd);
        UIMessage uiMessage = new UIMessage();
        List<Loginer> loginers = loginerService.getLoginer();
        Loginer loginer = loginers.get(0);
        if(oldPwd.equals(loginer.getPassword())){
            int id = loginer.getUserid();
            User user = userService.getUser(id);
            user.setPassword(NewPwd);
            userService.addAndUpdate(user);
            uiMessage.setMsg("success");
        }
            return uiMessage;

    }


    @PostMapping("/addUser")
    @ApiOperation("增加用户")
    public Message add(User user) {
        boolean hasExieted=userService.addAndUpdate(user);
        if (hasExieted){
            int id = user.getUserid();
            checkService.init(id);
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

    @RequestMapping("/checkStatus")
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
