package com.example.kor.mapper;


import com.example.kor.dto.RegisterDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RegisterMapper {

    @Insert("INSERT INTO member VALUES(NULL, #{userid}, #{username}, #{passwd} , #{level} )" )
    void getRegister(RegisterDto registerDto);

    @Select("SELECT * FROM member " +
            "WHERE userid = #{userid} AND passwd = #{passwd}")
    RegisterDto checkLogin(RegisterDto registerDto);

    @Select("SELECT * FROM member ORDER BY id DESC")
    List<RegisterDto> getMemberAll();

    @Select("SELECT * FROM member WHERE id = #{id}")
    RegisterDto getMemberOne(int id);

    @Update("UPDATE member SET " +
            "userid = #{userid}, username = #{username}, " +
            "passwd = #{passwd}, level = #{level} WHERE id = #{id}")
    void setUpdate(RegisterDto registerDto);

}
