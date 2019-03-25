package com.tortoiselala.service.impl;


import com.tortoiselala.dao.impl.UserDao;

public class UserService {
    // 维护持久层的一个对象
    private UserDao userDao;


    public UserDao getUserDao() {
        return userDao;
    }


}
