package com.example.ea_system.service.impl;

import com.example.ea_system.bean.User;
import com.example.ea_system.mapper.UserMapper;
import com.example.ea_system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addAndUpdate(User user) throws RuntimeException {
        if (user == null) throw new RuntimeException();

        if (user.getUserid() == null) {
            userMapper.insert(user);

        } else {
            userMapper.updateByPrimaryKey(user);
        }
    }
}
