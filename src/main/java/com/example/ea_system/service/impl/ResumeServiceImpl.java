package com.example.ea_system.service.impl;


import com.example.ea_system.bean.Resume;
import com.example.ea_system.mapper.ResumeMapper;
import com.example.ea_system.service.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements IResumeService {
   @Autowired
   private ResumeMapper resumeMapper;


    @Override
    public List<Resume> selectAll() throws RuntimeException {
      List<Resume> list=resumeMapper.selectAll();
         return list;
    }

    @Override
    public List<Resume> selectByID(int id) throws RuntimeException {
     return resumeMapper.selectByID(id);
    }
}
