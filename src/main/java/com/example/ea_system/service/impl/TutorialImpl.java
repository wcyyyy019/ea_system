package com.example.ea_system.service.impl;

import com.example.ea_system.bean.ResumeExample;
import com.example.ea_system.bean.Tutorial;
import com.example.ea_system.bean.TutorialExample;
import com.example.ea_system.mapper.TutorialMapper;
import com.example.ea_system.service.ITutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialImpl implements ITutorialService {
    @Autowired
    private TutorialMapper tutorialMapper;

    @Override
    public void addAndUpdate(Tutorial tutorial) throws RuntimeException {
        if (tutorial== null) throw new RuntimeException();

        if (tutorial.getTutorialid() == null) {
            tutorialMapper.insert(tutorial);

        } else {
            tutorialMapper.updateByPrimaryKey(tutorial);
        }
    }

    @Override
    public List<Tutorial> selectAll() throws RuntimeException {
        TutorialExample tutorialExample = new TutorialExample();
        tutorialExample.createCriteria().andCompanyidIsNotNull();
        return tutorialMapper.selectByExample(tutorialExample);
    }

    @Override
    public List<Tutorial> selectName(String title) throws RuntimeException {
        if ((title==null||"".equals(title))) {
            return selectAll();
        }else if(!"".equals(title))
        {
            //前者为空 后者不为空
            title="%"+title+"%";
            return tutorialMapper.selectName(title);
        }
        return null;
    }

    @Override
    public List<Tutorial> selectByComId(int id) throws RuntimeException {
        TutorialExample tutorialExample = new TutorialExample();
        tutorialExample.createCriteria().andCompanyidEqualTo(id);
        return tutorialMapper.selectByExample(tutorialExample);

    }

    @Override
    public void deleteByid(int id) throws RuntimeException {
        tutorialMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void deleteByids(int[] ids) throws RuntimeException {
        for (int i=0;i<ids.length;i++){
            int id =ids[i];
            deleteByid(id);
        }
    }
}
