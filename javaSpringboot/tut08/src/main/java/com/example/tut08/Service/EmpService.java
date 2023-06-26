package com.example.tut08.Service;

import com.example.tut08.Dto.BuseoDto;
import com.example.tut08.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public List<BuseoDto> getBuseoDtoList() {
        return empRepository.getEmpAjax();
    }
}
