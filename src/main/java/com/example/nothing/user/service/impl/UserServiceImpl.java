package com.example.nothing.user.service.impl;

import com.example.nothing.user.bean.UserBean;

import java.util.List;

/**
 * @Author YJL
 * @Create 2022/5/8
 */
public interface UserServiceImpl {
    /**
     * 获取所有用户
     * @return 用户信息
     */
    public List<UserBean> getUser();
}
