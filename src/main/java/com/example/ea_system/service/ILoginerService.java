package com.example.ea_system.service;

import com.example.ea_system.bean.Loginer;

import java.util.List;

public interface ILoginerService {
    void NewLoginer(Loginer loginer) throws Exception;
    void DeleteLoginer() throws Exception;
    List<Loginer> getLoginer() throws Exception;
}
