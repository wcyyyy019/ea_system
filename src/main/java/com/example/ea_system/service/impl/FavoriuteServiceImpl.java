package com.example.ea_system.service.impl;

import com.example.ea_system.bean.Favourite;
import com.example.ea_system.mapper.FAvouriteMapper;
import com.example.ea_system.mapper.ex.FavoriuteExMapper;
import com.example.ea_system.service.IFavoriuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriuteServiceImpl implements IFavoriuteService {


    @Autowired(required = false)
    private FAvouriteMapper favoriuteMapper;

    @Override
    public void addAndUpdate(Favourite favourite) throws RuntimeException {
        if (favourite == null) throw new RuntimeException();

        if (favourite.getFavouriteid() == null) {

            favoriuteMapper.insert(favourite);

        } else {
            favoriuteMapper.updateByPrimaryKey(favourite);
        }
    }




}
