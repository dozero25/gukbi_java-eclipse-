package com.example.tut05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/page")
    public String geAdminMainPage(Model model){ // Model 객체를 이용해서 html에 데이터 전송
        String title = "Koreait Academy - Admin Pages";
        model.addAttribute("getTitle", title);

        String tableTitle = "1. Koreait Academy";
        model.addAttribute("tableTitle", tableTitle);
        return "admin/admin";
    }
}