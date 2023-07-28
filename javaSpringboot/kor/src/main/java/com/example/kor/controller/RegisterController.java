package com.example.kor.controller;

import com.example.kor.dto.RegisterDto;
import com.example.kor.mapper.RegisterMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private RegisterMapper registerMapper;

    @GetMapping("")
    public String getMain() {
        return "main";
    }

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("mem", registerMapper.getMemberAll());
        return "members";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public Map<String, Object> saveRegister(@ModelAttribute RegisterDto registerDto) {
        registerMapper.getRegister(registerDto);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "success");
        return map;
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public Map<String, Object> setLogin(
            @ModelAttribute RegisterDto registerDto, HttpServletRequest req) {

        RegisterDto r = registerMapper.checkLogin(registerDto);

        if( r != null ) {
            HttpSession hs = req.getSession();
            hs.setAttribute("userid", r.getUserid());
            hs.setAttribute("username", r.getUsername());
            hs.setAttribute("level", r.getLevel());
            hs.setMaxInactiveInterval(60 * 30);
        }
        return Map.of("msg", "success");
    }

    @GetMapping("/logout")
    public String getLogout(HttpSession hs) {
        hs.invalidate();
        return "redirect:/"; //로그아웃 후 이동할 페이지
    }

    @GetMapping("/update")
    public String getUpdate(Model model, @RequestParam int id) {
        model.addAttribute("mem", registerMapper.getMemberOne(id));
        return "update";
    }

    @PostMapping("/update")
    @ResponseBody
    public Map<String, Object> setUpdate(@ModelAttribute RegisterDto registerDto) {
        registerMapper.setUpdate(registerDto);
        return Map.of("msg", "success");
    }

}
