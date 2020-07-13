package com.example.ea_system.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String TestDemo(Map<String,Object> map){
//        map.put("name", Arrays.asList("Tom","Jerry","Mike"));
        return "Login";
    }
}
