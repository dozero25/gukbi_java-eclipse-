package com.example.searchCrud.controller;

import com.example.searchCrud.dto.RegisterDto;
import com.example.searchCrud.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private RegisterMapper registerMapper;

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String setEdit(@ModelAttribute RegisterDto registerDto) {
        registerMapper.setRegister(registerDto);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String getList( Model model,
                           @RequestParam(value="word", defaultValue = "") String word){
        String searchValue = "";

        if( word.equals("") ) {
            searchValue = "";

        }else{ //검색어 있을 때
            searchValue = "WHERE user_id = '"+word+"'";
        }


        model.addAttribute("reg", registerMapper.getAllReg(searchValue));
        model.addAttribute("count", registerMapper.getMemCount(searchValue));
        return "list";

    }
}
