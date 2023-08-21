package com.example.kor.mapper;

import com.example.kor.dto.RegisterDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RegisterMapper {

    @Insert("INSERT INTO register values (0, #{email}, #{firstName}, #{lastName}, #{password}, #{enabled})")
    void getRegister(RegisterDto registerDto);


}
