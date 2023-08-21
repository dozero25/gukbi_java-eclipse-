package com.example.employees.dto;

import lombok.Data;

@Data
public class PagingDto {
    private int pageCount = 5; //한 페이지에 표시될 게시물 수
    private int blockCount = 5; //표시할 페이지 번호의 개수

    private int page; //페이지 표시
    private int totalPage;  //전체 게시물 수
    private int startPage;
    private int endPage;
}
