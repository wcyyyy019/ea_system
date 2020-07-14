package com.example.ea_system.service.impl;


import com.example.ea_system.bean.Resume;
import com.example.ea_system.bean.ResumeExample;
import com.example.ea_system.mapper.ResumeMapper;
import com.example.ea_system.service.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
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

    @Override
    public List<Resume> selectName(String title) throws RuntimeException {
        if ((title==null||"".equals(title))) {
            return selectAll();
        }else if(!"".equals(title))
        {
            //前者为空 后者不为空
            title="%"+title+"%";
            return resumeMapper.selectName(title);
        }
        return null;
    }

    @Override
    public List<Resume> selectByGraId(int Graid) throws RuntimeException {
        ResumeExample resumeExample = new ResumeExample();
        resumeExample.createCriteria().andGraduateidEqualTo(Graid);
        return resumeMapper.selectByExample(resumeExample);
    }

    @Override
    public Boolean addAndUpdate(Resume resume) throws RuntimeException {
        if (resume == null) return false;
        if (resume.getResumeid() == null) {
            resumeMapper.insert(resume);
        } else {
            resumeMapper.updateByPrimaryKey(resume);
        }
        return true;
    }

    @Override
    public void deleteByid(int id) throws RuntimeException {
        resumeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByids(int[] ids) throws RuntimeException {
//        System.out.println(ids+"kk");
        for (int i=0;i<ids.length;i++){
           int id =ids[i];
            deleteByid(id);
        }

    }

}



