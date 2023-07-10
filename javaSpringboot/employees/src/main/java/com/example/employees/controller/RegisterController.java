package com.example.employees.controller;

import com.example.employees.dto.DeptDto;
import com.example.employees.dto.PosDto;
import com.example.employees.dto.RegisterDto;
import com.example.employees.mappers.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RegisterController {

    private RegisterMapper registerMapper;

    @Autowired
    public RegisterController(RegisterMapper reigsterMapper) {
        this.registerMapper = reigsterMapper;
    }

    @GetMapping("/main/register")
    public String getRegister() {
        return "main/register";
    }

    @PostMapping("/main/register")
    @ResponseBody
    public Map<String, Object> saveRegister(@ModelAttribute RegisterDto registerDto) {
        Map<String, Object> map = new HashMap<>();

        if( registerDto != null ) {
            registerMapper.saveRegister(registerDto);
            map.put("msg", "success");
        }

        return map;
    }

    @PostMapping("/main/getDept")
    @ResponseBody
    public List<DeptDto> getDept() {
        return registerMapper.getDept();
    }


    @PostMapping("/main/getPos")
    @ResponseBody
    public List<PosDto> getPos(@RequestParam String selDeptValue) {
        return registerMapper.getPos(selDeptValue);
    }

    @PostMapping("/main/emailCheck")
    @ResponseBody
    public int emailCheck(@RequestParam String email) {
        return registerMapper.emailCheck(email);
    }

}







