package com.example.employees.dto;

import lombok.Data;

@Data
public class PageDto {

    private int pageCount = 2;
    private int blockCount = 5;

    private int page;
    private int totalPage;
    private int startPage;
    private int endPage;
}
