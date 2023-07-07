package com.example.employees.controller;


import com.example.employees.dto.EmployeeDto;
import com.example.employees.mappers.EmployeeMapper;
import com.example.employees.mappers.LevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeesController {

    private String UPLOAD_LOCATION="D:\\윤도영\\JavaIntellij\\employees\\src\\main\\resources\\static\\upload\\";

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private LevelMapper levelMapper;

    @GetMapping("/admin/employees")
    public String getEmpList(Model model) {
        model.addAttribute("emp", employeeMapper.getEmpList());
        return "admin/employees";
    }

    @GetMapping("/admin/employees/delete")
    @ResponseBody
    public Map<String, Object> deleteEmp(@RequestParam int korEmpId) {
        Map<String, Object> map = new HashMap<>();

        if ( korEmpId > 0 ) {
            employeeMapper.deleteEmp(korEmpId);
            map.put("msg", "success");
        }
        return map;
    }

    @GetMapping("/admin/employees/view")
    public String getEmpView(@RequestParam int korEmpId, Model model){
        if (korEmpId > 0) {
            model.addAttribute("emp", employeeMapper.getEmpView(korEmpId));
            model.addAttribute("level", levelMapper.getLevel());
        }

        return "admin/empView";
    }

    @GetMapping("/admin/employees/popup")
    public String getPopup() {

        return "admin/popup";
    }

    @PostMapping("/admin/employees/upload")
    @ResponseBody
    public Map<String, Object> fileUpload(MultipartFile uploadFile, int korEmpId){

        Map<String, Object> map = new HashMap<>();

        try {

            if (uploadFile != null) {
                EmployeeDto employeeDto = new EmployeeDto();
                employeeDto.setKorEmpImageName(uploadFile.getOriginalFilename());
                employeeDto.setKorEmpImageSize(uploadFile.getSize());
                employeeDto.setKorEmpId(korEmpId);

                employeeMapper.fileUpload(employeeDto);

                Path path = Paths.get(UPLOAD_LOCATION, uploadFile.getOriginalFilename());
                Files.write(path, uploadFile.getBytes());

                map.put("msg", "success");
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        return map;
    }
}
