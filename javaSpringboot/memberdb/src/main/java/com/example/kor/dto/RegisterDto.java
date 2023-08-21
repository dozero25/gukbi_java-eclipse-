package com.example.kor.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private boolean enabled;
}
