package com.example.employees.service;

import com.example.employees.dto.EmployeeDto;
import com.example.employees.dto.PageDto;
import com.example.employees.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PagingService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public PageDto pageCalc(int page){
        int totalCount = employeeMapper.getEmpTotalCount();

        PageDto pageDto = new PageDto();



        int totalPage = (int) Math.ceil(((double)totalCount/pageDto.getPageCount()));

        int startPage = (((int)Math.ceil((double)totalPage / pageDto.getBlockCount())) - 1) * pageDto.getPageCount()+1;

        int endPage = startPage + pageDto.getBlockCount() - 1;

        if (endPage > totalPage) {
            endPage = totalPage;
        }

        pageDto.setPage(page);
        pageDto.setStartPage(startPage);
        pageDto.setEndPage(endPage);

        return pageDto;
    }

    public List<EmployeeDto> getPagingEmp(int page){
        Map<String, Object> map = new HashMap<>();
        PageDto pageDto = new PageDto();

        int pageStartNum = (page -1) * pageDto.getPageCount();
        map.put("start", pageStartNum);
        map.put("limit", pageDto.getPageCount());

        return employeeMapper.getEmpList(map);
    }
}
