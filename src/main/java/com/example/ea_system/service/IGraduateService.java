package com.example.ea_system.service;

import com.example.ea_system.bean.Graduate;

public interface IGraduateService {
    void addAndUpdate(Graduate graduate) throws RuntimeException;
    void init(int userid) throws RuntimeException;
    Graduate getGraduateByUserid(int userid) throws RuntimeException;
}
