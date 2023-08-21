package com.example.kor.controller;

import com.example.kor.dto.RegisterDto;
import com.example.kor.mapper.ListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
public class ListController {

    @Autowired
    private ListMapper listMapper;

    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("list", listMapper.getList());
        return "list";
    }

    @GetMapping("/delete")
    @ResponseBody
    public Map<String, Object> deleteList(@RequestParam int id) {
        Map<String, Object> map = new HashMap<>();

        listMapper.deleteList(id);
        map.put("msg", "success");
        return map;
    }

    @GetMapping("/update")
    public String getUpdate(Model model,@RequestParam int id){
        model.addAttribute("list", listMapper.getListOne(id));
        return "update";
    }

    @PostMapping("/update")
    @ResponseBody
    public Map<String, Object> setUpdateList(@ModelAttribute RegisterDto registerDto) {
        Map<String, Object> map = new HashMap<>();
        listMapper.updateList(registerDto);
        map.put("msg", "success");

        return map;
    }
}
