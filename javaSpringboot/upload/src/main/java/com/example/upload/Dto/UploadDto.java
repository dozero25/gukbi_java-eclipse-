package com.example.upload.Dto;

import lombok.Data;

@Data
public class UploadDto {
    private String imageName;
    private Long imageSize;
    private String imageUrl;
    private String imageTransName;
}
