package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Favourite;
import com.example.ea_system.service.IFavoriuteService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favoriute")
@Api(description = "人才喜好管理")
public class FavoriuteController {
    @Autowired
    private IFavoriuteService favoriuteService;

    @PostMapping("/add")
    @ApiOperation("增加人才喜好")
    public Message add(Favourite favourite)
    {
        favoriuteService.addAndUpdate(favourite);
        return MessageUtil.success(favourite.getFavouriteid());
    }
}
