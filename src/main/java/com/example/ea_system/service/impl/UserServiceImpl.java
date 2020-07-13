package com.example.ea_system.service.impl;

import com.example.ea_system.bean.User;
import com.example.ea_system.bean.UserExample;
import com.example.ea_system.bean.ex.UserEx;
import com.example.ea_system.mapper.UserMapper;
import com.example.ea_system.mapper.ex.UserExMapper;
import com.example.ea_system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserExMapper userExMapper;

    /**
     *
     * @param user
     * @return  true 表示操作成功   false表示失败
     * @throws RuntimeException
     */
    @Override
    public boolean addAndUpdate(User user) throws RuntimeException {
        if (user == null) return false;
        if (user.getUserid() == null) {
            if(!checkRepeatUsername(user.getUsername())){
                userMapper.insert(user);
                return true;
            }
            else
                return false;
        } else {
            userMapper.updateByPrimaryKey(user);
        }
        return true;
    }

    /**
     *
     * @param username  用户姓名
     * @param password  用户密码
     * @return  存在用户则返回用户id 否则返回0
     * @throws RuntimeException
     */
    @Override
    public int hasExist(String username,String password) throws RuntimeException {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        //账号不存在
        if(users.size()==0){
            return 0;
        }else if (users.get(0).getPassword() == password || password.equals(users.get(0).getPassword())){//密码正确
            return users.get(0).getUserid();
        }else{//密码错误
            return 0;
        }
    }

    /**
     *  根据用户id返回完整的用户信息 包括check信息
     * @param userid
     * @return  UserEx类型
     * @throws RuntimeException
     */
    @Override
    public UserEx getUserEx(int userid) throws RuntimeException {
        return userExMapper.checkStatus(userid);
    }

    /**
     *
     * @return  返回所有user对象的集合
     * @throws RuntimeException
     */
    @Override
    public List<User> listAllUser() throws RuntimeException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseridIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public User getUser(int userid) throws RuntimeException {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public boolean checkRepeatUsername(String username) throws RuntimeException {
        List<User> users = listAllUser();
        for(User user:
             users) {
            if(user.getUsername().equals(username)) return true;
        }
        return false;
    }


}
