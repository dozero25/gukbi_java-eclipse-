package com.example.employees.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDto {
    private int korBoardId;
    private String korBoardNotice;
    private String korBoardWriter;
    private String korBoardSubject;
    private String korBoardContent;
    private String korBoardUploadName;
    private String korBoardUploadUrl;
    private Long korBoardUploadSize;
    private String korBoardUploadTrans;
    private int korBoardVisit;
    private int korBoardReplyGrp;
    private int korBoardReplyGrpSeq;
    private int korBoardReplyGrpSeqIndent;
    private LocalDateTime korBoardRegdate;
}
