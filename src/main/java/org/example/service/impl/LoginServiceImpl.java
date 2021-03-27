package org.example.service.impl;

import javax.annotation.Resource;

import org.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import org.example.beans.UserBean;
import org.example.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService{

    @Resource
    private UserMapper userMapper;


    @Override
    public UserBean Login(String username, String password) {
        return userMapper.login(username, password);
    }
}