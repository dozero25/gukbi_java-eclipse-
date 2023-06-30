package com.example.employees.controller;

import com.example.employees.dto.RegisterDto;
import com.example.employees.mappers.WebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private WebsiteMapper websiteMapper;

    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("web", websiteMapper.getWebsite());
        return "home";
    }


}
