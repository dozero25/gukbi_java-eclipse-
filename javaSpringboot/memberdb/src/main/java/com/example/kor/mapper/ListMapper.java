package com.example.kor.mapper;

import com.example.kor.dto.RegisterDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ListMapper {

    @Select("SELECT * FROM register order by id asc")
    List<RegisterDto> getList();

    @Delete("DELETE FROM register WHERE id = #{id}")
    void deleteList(int id);

    @Update("UPDATE register SET email = #{email}, first_name=#{firstName}, last_name=#{lastName}, password=#{password}, enabled = #{enabled} WHERE id = #{id}")
    void updateList(RegisterDto registerDto);

    @Select("SELECT * FROM register WHERE id = #{id}")
    RegisterDto getListOne(int id);

}
