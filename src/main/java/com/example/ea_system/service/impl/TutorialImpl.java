package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Tutorial;
import com.example.ea_system.mapper.TutorialMapper;
import com.example.ea_system.service.ITutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
