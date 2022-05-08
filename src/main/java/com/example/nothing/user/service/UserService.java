package com.example.nothing.user.service;

import com.example.nothing.user.bean.UserBean;
import com.example.nothing.user.mapper.UserDao;
import com.example.nothing.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author YJL
 * @Create 2022/5/8
 */
@Service("userService")
public class UserService implements UserServiceImpl {
    @Autowired
    private UserDao userDao;
    @Override
    public List<UserBean> getUser() {
        return userDao.getUser();
    }
}
