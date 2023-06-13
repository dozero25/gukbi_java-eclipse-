package com.example.tut05.controller;

import com.example.tut05.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/login")
    public String getLoginPage(Model model){
        String title = "Koreait Academy - Users Login Pages";
        model.addAttribute("getTitle", title);

        return "users/login";
    }

}
