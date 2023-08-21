package com.example.employees.service;


import com.example.employees.dto.BoardDto;
import com.example.employees.dto.BoardPagingDto;
import com.example.employees.dto.EmployeeDto;
import com.example.employees.dto.PagingDto;
import com.example.employees.mappers.BoardMapper;
import com.example.employees.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardPagingSrv {

    @Autowired
    private BoardMapper boardMapper;

    public BoardPagingDto BoardPageCalc(int page) {
        int totalCount = boardMapper.getTotalCount();
        BoardPagingDto bpd = new BoardPagingDto();

        int totalPage = (int) Math.ceil(((double) totalCount / bpd.getPageCount()));
        int startPage = (((int) Math.ceil((double) page / bpd.getBlockCount())) - 1)  * bpd.getBlockCount() + 1;

        int endPage = startPage + bpd.getBlockCount() - 1;

        if( endPage > totalPage ) {
            endPage = totalPage;
        }

        bpd.setPage(page);
        bpd.setTotalPage(totalPage);
        bpd.setStartPage(startPage);
        bpd.setEndPage(endPage);

        return bpd;
    }

    public List<BoardDto> getPagingBoard(int page) {
        Map<String, Object> map = new HashMap<>();
        BoardPagingDto bpd = new BoardPagingDto();

        int pageStartNum = (page - 1) * bpd.getPageCount();

        map.put("start", pageStartNum);
        map.put("limit", bpd.getPageCount());

        return boardMapper.getBoard(map);
    }

}






