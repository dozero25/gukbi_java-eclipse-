package com.example.tut00.service;

import com.example.tut00.dto.UserDto;
import com.example.tut00.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public UserDto insertUser(UserDto userDto) {
        userDto.getUserid();
        userDto.getPasswd();
        return accountRepository.insertUser(userDto);
    }


}
