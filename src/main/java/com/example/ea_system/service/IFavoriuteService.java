package com.example.ea_system.service;

import com.example.ea_system.bean.Favourite;

public interface IFavoriuteService {
    void addAndUpdate(Favourite favourite) throws RuntimeException;
}
