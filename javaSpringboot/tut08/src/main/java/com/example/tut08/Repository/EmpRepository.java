package com.example.tut08.Repository;

import com.example.tut08.Dto.BuseoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpRepository {
    List<BuseoDto> getEmpAjax();
}
