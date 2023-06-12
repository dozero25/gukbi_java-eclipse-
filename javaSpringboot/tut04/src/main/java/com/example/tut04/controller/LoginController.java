package com.example.tut04.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class LoginController { // 필드 생성자 getter 메소드

    // Rest Api : html 출력 x -> 글자나 db 자료 전송 -> react.js
    // Response -> Json 출력

    @GetMapping("/text")
    @ResponseBody
    public String textOutput(){
        return "Koreait Academy";
    }

    // html 띄우기 : 0

    @GetMapping("/login")
    public String dispHtml() {
        log.info("보여짐");
        return "admin/login";
    }
}
