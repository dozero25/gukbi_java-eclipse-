package com.example.employees.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LevelDto {
    private int korEmpLevelCode;
    private String korEmpLevelName;
}
