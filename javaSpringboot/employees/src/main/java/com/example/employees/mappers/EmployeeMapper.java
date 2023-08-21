package com.example.employees.mappers;


import com.example.employees.dto.EmployeeDto;
import com.example.employees.dto.LevelDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM kor_employees ORDER BY kor_emp_id DESC LIMIT #{start}, #{limit} ")
    List<EmployeeDto> getEmpList(Map<String, Object> map);

    @Delete("DELETE FROM kor_employees WHERE kor_emp_id = #{korEmpId}")
    void deleteEmp(int korEmpId);

    @Select("SELECT * FROM kor_dept D INNER JOIN kor_employees E ON\n" +
            "D.kor_dept_code = E.kor_emp_dept INNER JOIN kor_pos P ON\n" +
            "E.kor_emp_pos = P.kor_pos_code WHERE E.kor_emp_id = #{korEmpId}")
    EmployeeDto getEmpView(int korEmpId);

    @Update("UPDATE kor_employees " +
            "SET kor_emp_image_name = #{korEmpImageName}, " +
            "kor_emp_image_size = #{korEmpImageSize} " +
            "WHERE kor_emp_id = #{korEmpId}")
    void fileUpload(EmployeeDto employeeDto);

    @Select("SELECT kor_emp_image_name FROM kor_employees WHERE kor_emp_id = #{korEmpId}")
    EmployeeDto getImageName(int korEmpId);

    @Select("SELECT * FROM kor_level")
    List<LevelDto> getLevel();

    @Update("UPDATE kor_employees SET kor_emp_level = #{korEmpLevel} WHERE kor_emp_id = #{korEmpId}")
    void updateLevel(EmployeeDto employeeDto);

    //페이지 처리를 하기 위한 전체 개시물 수
    @Select("SELECT COUNT(*) FROM kor_employees")
    int getEmpTotalCount();

    @Update("UPDATE kor_employees SET " +
            "kor_emp_email = #{korEmpEmail}, " +
            "kor_emp_passwd=#{korEmpPasswd}, " +
            "kor_emp_name = #{korEmpName}, " +
            "kor_emp_gender = #{korEmpGender}, " +
            "kor_emp_dept = #{korEmpDept}, " +
            "kor_emp_pos = #{korEmpPos}, kor_emp_level = #{korEmpLevel}, " +
            "kor_emp_modified = NOW() WHERE kor_emp_id = #{korEmpId}")
    void setEmpUpdate(EmployeeDto employeeDto);
}







