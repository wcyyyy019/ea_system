package com.example.ea_system.service;

import com.example.ea_system.bean.Tutorial;

public interface ITutorialService {
    void addAndUpdate(Tutorial tutorial) throws RuntimeException;
}
