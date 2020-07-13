package com.example.ea_system.service;

import com.example.ea_system.bean.Resume;

import java.util.List;


public interface IResumeService {
    List<Resume> selectAll() throws RuntimeException;
    List<Resume> selectByID(int id) throws RuntimeException;
    List<Resume> selectName(String title) throws RuntimeException;
}
