package com.example.ea_system.service;

import com.example.ea_system.bean.Check;
import com.example.ea_system.bean.ex.UserEx;

public interface ICheckService {
    void init(int userId) throws RuntimeException;

    boolean hasBan(UserEx userEx) throws RuntimeException;

    boolean hasPersonalInfoDo(UserEx userEx) throws RuntimeException;

}
