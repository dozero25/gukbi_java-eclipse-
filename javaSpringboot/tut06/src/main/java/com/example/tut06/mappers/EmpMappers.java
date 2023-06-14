package com.example.tut06.mappers;

import com.example.tut06.dto.DeptDto;
import com.example.tut06.dto.EmpDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMappers {

    @Select("SELECT * from kor_buseo order by kor_buseo_code DESC")
    public List<DeptDto> getDept();

    @Insert("INSERT INTO tb_reg VALUES (#{dept}, #{email}, #{passwd})")
    public void saveEmp(EmpDto empDto);

    @Select("SELECT * FROM tb_reg")
    public List<EmpDto> getEmp();

    @Delete("DELETE FROM tb_reg WHERE email = #{email}")
    public void deleteEmp(String email);


}
