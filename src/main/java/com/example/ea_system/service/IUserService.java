package com.example.ea_system.service;

import com.example.ea_system.bean.User;
import com.example.ea_system.bean.ex.UserEx;

import java.util.List;

public interface IUserService {
    //用户注册或者修改密码
    boolean addAndUpdate(User user) throws RuntimeException;
    //用户登录检验
    int hasExist(String username,String password) throws RuntimeException;

    //用户完整状态信息
    UserEx getUserEx(int userid) throws RuntimeException;
    //列出所有用户信息
    List<User> listAllUser() throws RuntimeException;

    User getUser(int userid) throws RuntimeException;

    boolean checkRepeatUsername(String username) throws RuntimeException;
}
