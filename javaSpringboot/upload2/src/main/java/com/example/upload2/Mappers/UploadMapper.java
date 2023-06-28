package com.example.upload2.Mappers;

import com.example.upload2.Dto.UploadDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UploadMapper {

    @Select("SELECT * FROM emp_tb WHERE email = #{} AND passwd = #{}")
    UploadDto getEmp(UploadDto uploadDto);

}
