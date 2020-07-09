package com.example.ea_system.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public String TestDemo(){
        return "hello";
    }
}
