package com.example.emp.controller;

import com.example.emp.dto.DeptDto;
import com.example.emp.dto.RegisterDto;
import com.example.emp.mappers.DeptMapper;
import com.example.emp.mappers.RegisterMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class DeptController {

    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private RegisterMapper registerMapper;

    @GetMapping("/dept")
    public String getDept() {
        return "admin/dept";
    }

    @GetMapping("/getDept")
    @ResponseBody
    public List<DeptDto> getDeptAll() {
        return deptMapper.getDeptAll();
    }

    @PostMapping("/dept")
    @ResponseBody
    public Map<String, Object> saveDept(DeptDto deptDto) {

        int result = deptMapper.getBuseoCodeCheck(deptDto.getBuseoCode());
        Map<String, Object> map = new HashMap<>();

        if( result > 0 ) {
            map.put("msg", "failure");

        }else{
            deptMapper.saveDept(deptDto);
            map.put("msg", "success");
        }

        return map;
    }



    @PostMapping("/dept/delete")
    @ResponseBody
    public Map<String, Object> deleteDept(String buseoCode) {

        Map<String, Object> map = new HashMap<>();

        deptMapper.deleteDept(buseoCode);
        map.put("message", "ok");

        return map;
    }



    @GetMapping("/register")
    public String getRegister() {
        return "employees/register";
    }


    @PostMapping("/register")
    @ResponseBody
    public Map<String, Object> saveEmp(RegisterDto registerDto) {
        registerMapper.saveEmp(registerDto);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200 );

        return map;
    }

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("cnt", registerMapper.getEmpCount());
        model.addAttribute("emp", registerMapper.getEmpAll());

        return "admin/list";
    }



    @GetMapping("/login")
    public String getLogin() {
        return "employees/login";
    }

    @PostMapping("/login")
    public String getLoginDo(@ModelAttribute RegisterDto registerDto, HttpServletRequest httpServletRequest){
        RegisterDto registerDto1 = registerMapper.getLoginDto(registerDto);

        if (registerDto1 == null) {
            System.out.println("로그인 정보가 없습니다. 회원가입을 진행하세요.");
            return "redirect:/emp/register";
        } else {
            HttpSession httpSession = httpServletRequest.getSession();
            httpSession.setAttribute("sessInfo", registerDto1);
            httpSession.setMaxInactiveInterval(30 * 60); // 30 분
            return "redirect:/emp/main";
        }
    }

    @GetMapping("/main")
    public String getMain(){
        return "admin/main";
    }

    @GetMapping("/logout")
    public String getLogout(HttpSession httpSession){
        httpSession.invalidate();

        System.out.println("로그아웃 되었습니다.");
        return "redirect:/emp/login";
    }

}









