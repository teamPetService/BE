package com.example.pet.service.user.service;

import com.example.pet.service.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void insertUser(UserVo userVo){

        userMapper.add(userVo);
    }
}
