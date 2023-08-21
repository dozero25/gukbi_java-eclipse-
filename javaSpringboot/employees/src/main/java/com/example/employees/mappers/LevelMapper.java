package com.example.employees.mappers;

import com.example.employees.dto.LevelDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LevelMapper {
    @Select("SELECT * FROM kor_level ORDER BY kor_emp_level_code ASC")
    List<LevelDto> getLevel();
}








