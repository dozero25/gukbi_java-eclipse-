package com.example.kor.controller;

import com.example.kor.dto.RegisterDto;
import com.example.kor.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private RegisterMapper registerMapper;

    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public Map<String, Object> getRegister(@ModelAttribute RegisterDto registerDto) {
        Map<String, Object> map = new HashMap<>();
        registerMapper.getRegister(registerDto);
        map.put("msg", "success");
    return map;
    }
}
