package com.example.tut06.controller;

import com.example.tut06.dto.DeptDto;
import com.example.tut06.dto.EmpDto;
import com.example.tut06.mappers.EmpMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpMappers empMappers;

    @GetMapping("/register")
    public String getEmpRegisterPage(){
        return "emp/register";
    }

    @GetMapping("/category/dept")
    @ResponseBody
    public List<DeptDto> getDept(){
        return empMappers.getDept();
    }

    @PostMapping("/register")
    public String getRegister(EmpDto empDto){
        empMappers.saveEmp(empDto);
        return "redirect:/employee/list";
    }

    @GetMapping("/list")
    public String getEmpListPage(Model model){
        String msg = "Koreait 사원 목록 페이지";
        model.addAttribute("title", msg);
        return "admin/list";
    }

    @GetMapping("/list/load")
    @ResponseBody
    public List<EmpDto> getEmpList(){
        return empMappers.getEmp();
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String deleteEmp(String email){
        empMappers.deleteEmp(email);
        return "redirect:/employee/list";
    }
}
