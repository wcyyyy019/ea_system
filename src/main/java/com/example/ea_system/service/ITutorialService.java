package com.example.ea_system.service;

import com.example.ea_system.bean.Resume;
import com.example.ea_system.bean.Tutorial;

import java.util.List;

public interface ITutorialService {
    void addAndUpdate(Tutorial tutorial) throws RuntimeException;
    List<Tutorial> selectAll() throws RuntimeException;
    List<Tutorial> selectName(String title) throws RuntimeException;
    List<Tutorial> selectByComId(int id) throws RuntimeException;
    void deleteByid(int id) throws RuntimeException;
    void deleteByids(int[] ids) throws  RuntimeException;
}
