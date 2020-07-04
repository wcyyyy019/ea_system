package com.example.ea_system.service;

import com.example.ea_system.bean.User;
import com.example.ea_system.bean.ex.UserEx;

public interface IUserService {
    //用户注册或者修改密码
    void addAndUpdate(User user) throws RuntimeException;
    //用户登录检验
    int hasExist(String username,String password) throws RuntimeException;

    //用户完整状态信息
    UserEx getUserEx(int userid) throws RuntimeException;


}
