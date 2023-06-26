package com.example.tut08.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BuseoDto {
    private String korBuseoCdoe;
    private String korBuseoName;
}
