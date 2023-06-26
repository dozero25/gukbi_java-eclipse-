package com.example.tut07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    // html @Controller
    // json, ajax => axios, fetch(브라우저마다 차이)
    // @Controller + @ ResponseBody = @RestController

    @GetMapping("")
    public String getLoginPage(){
        return "main/index";
    }

}
