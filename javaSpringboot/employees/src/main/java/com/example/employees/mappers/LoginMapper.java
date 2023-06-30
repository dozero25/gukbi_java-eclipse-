package com.example.employees.mappers;

import com.example.employees.dto.RegisterDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("SELECT * FROM kor_emp WHERE kor_emp_email = #{korEmpEmail} and kor_emp_passwd = #{korEmpPasswd};")
    RegisterDto getLoginInfo(RegisterDto registerDto);
}
