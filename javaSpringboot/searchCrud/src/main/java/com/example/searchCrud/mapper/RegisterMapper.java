package com.example.searchCrud.mapper;

import com.example.searchCrud.dto.RegisterDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface RegisterMapper {

    @Insert("INSERT INTO searchCrud VALUES (0, #{userId}, #{password}, #{name})")
    void setRegister(RegisterDto registerDto);

    @Select("SELECT * FROM searchCrud WHERE id = #{id}")
    RegisterDto getReg(int id);

    @Select("SELECT * FROM searchCrud ${searchValue} order by id desc")
    List<RegisterDto> getAllReg(String searchValue);

    @Select("SELECT COUNT(*) FROM searchCrud ${searchValue}")
    int getMemCount(String searchValue);

}
