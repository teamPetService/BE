package com.example.pet.service.user.service;

import com.example.pet.service.user.UserVo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    void add(UserVo userVo);
}
