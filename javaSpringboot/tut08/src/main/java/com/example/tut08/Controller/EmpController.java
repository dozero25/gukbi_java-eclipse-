package com.example.tut08.Controller;

import com.example.tut08.Dto.BuseoDto;
import com.example.tut08.Repository.EmpRepository;
import com.example.tut08.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/dept")
    @ResponseBody
    public List<BuseoDto> getDpt(){
        return empService.getBuseoDtoList();
    }

    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }

    @GetMapping("/empList")
    public String getList(){
        return "admin/empList";
    }
}
