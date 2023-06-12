package com.example.tut00.controller;

import com.example.tut00.dto.UserDto;
import com.example.tut00.repository.AccountRepository;
import com.example.tut00.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/account")
public class LoginController {

    @Autowired(required = true)
    private AccountService accountService;

    @GetMapping("/login")
    public String loginPage(){
        return "user/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String loginDo(UserDto userDto){

        String userid = userDto.getUserid();
        String passwd = userDto.getPasswd();

        accountService.insertUser(userDto);

        System.out.println("아이디 : "+userid+" 비밀번호 : "+passwd);
        return "아이디 : "+userid+" 비밀번호 : "+passwd;
    }
}
