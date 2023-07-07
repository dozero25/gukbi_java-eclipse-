package com.example.employees.mappers;


import com.example.employees.dto.EmployeeDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM kor_employees ORDER BY kor_emp_id DESC")
    List<EmployeeDto> getEmpList();

    @Delete("DELETE FROM kor_employees WHERE kor_emp_id = #{korEmpId}")
    void deleteEmp(int korEmpId);

    @Select("SELECT * FROM kor_dept D INNER JOIN kor_employees E ON D.kor_dept_code = E.kor_emp_dept INNER JOIN kor_pos P on E.kor_emp_pos = P.kor_pos_code WHERE E.kor_emp_id = ${korEmpId}")
    EmployeeDto getEmpView(int korEmpId);

    @Update("UPDATE kor_employees SET kor_emp_image_name = #{korEmpImageName}, kor_emp_image_size = #{korEmpImageSize} WHERE kor_emp_id = #{korEmpId}")
    void fileUpload(EmployeeDto employeeDto);
}







