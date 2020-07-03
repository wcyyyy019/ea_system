package com.example.ea_system.service;

import com.example.ea_system.bean.User;

public interface IUserService {
    void addAndUpdate(User user) throws RuntimeException;
}
