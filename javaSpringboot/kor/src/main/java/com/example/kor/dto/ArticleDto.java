package com.example.kor.dto;

import lombok.Data;

@Data
public class ArticleDto {

    private int id;
    private String code;
    private String subject;
    private String writer;
    private String content;
    private int grp;
    private int depth;
}
