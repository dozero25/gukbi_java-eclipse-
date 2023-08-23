package com.example.crud.controller;

import com.example.crud.dto.CrudDto;
import com.example.crud.mapper.CrudMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CrudController {

    @Autowired
    private CrudMapper crudMapper;

    @GetMapping("/list")
    public String getList(
            Model model,
            @RequestParam(value="word", defaultValue = "") String word) {

        String searchQuery = "";
        
        if( word.equals("") ) { //검색어 x
            searchQuery = "";
            
        }else{ //검색어 있을 때
            searchQuery = "WHERE mUid = '"+word+"'";
        }


        model.addAttribute("mem", crudMapper.getMem(searchQuery));
        model.addAttribute("cnt", crudMapper.getMemCount(searchQuery));
        return "list";
    }

    @GetMapping("/add")
    public String getAdd() {
        return "add"; //html 파일 이름
    }

    @PostMapping("/save")
    public String setSave(@ModelAttribute CrudDto crudDto) {
        crudMapper.setSave(crudDto);

        return "redirect:/list"; //이동할 주소
    }

    @GetMapping("/edit")
    public String getEdit(@RequestParam int mId, Model model) {
        model.addAttribute("mem", crudMapper.getEdit(mId));
        return "edit"; //html 파일 이름
    }

    @PostMapping("/edit")
    public String setEdit(@ModelAttribute CrudDto crudDto) {
        crudMapper.setEdit(crudDto);
        return "redirect:/list";
    }


}
