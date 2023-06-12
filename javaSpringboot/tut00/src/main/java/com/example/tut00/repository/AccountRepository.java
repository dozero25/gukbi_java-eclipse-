package com.example.tut00.repository;

import com.example.tut00.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {
    public UserDto insertUser(UserDto userDto);

}
