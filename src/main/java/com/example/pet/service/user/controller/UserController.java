package com.example.pet.service.user.controller;

import com.example.pet.service.user.UserVo;
import com.example.pet.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/members")
    public String test(@RequestBody UserVo uservo){
        userService.insertUser(uservo);
        return "성공";
    }
}
