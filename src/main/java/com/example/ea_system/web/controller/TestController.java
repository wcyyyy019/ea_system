package com.example.ea_system.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String TestDemo(){
        return "Login";
    }
}
