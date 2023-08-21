package com.example.kor.controller;

import com.example.kor.dto.ArticleDto;
import com.example.kor.dto.ConfigDto;
import com.example.kor.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConfigController {

    @Autowired
    private ConfigMapper configMapper;

    @GetMapping("/config")
    public String getConfig(Model model){
        model.addAttribute("config", configMapper.getConfig());
        return "config";
    }

    @GetMapping("/create")
    public String getCreate(){
        return "create";
    }

    @PostMapping("/create")
    public String setCreate(@ModelAttribute ConfigDto configDto){
        configMapper.setConfig(configDto);
        configMapper.createTable(configDto.getCode());
        return "redirect:/create";
    }

    @GetMapping("/drop")
    public String setDrop(@RequestParam String code) {
        configMapper.deleteConfig(code);
        configMapper.dropConfig(code);
        return "redirect:/config";
    }

}
