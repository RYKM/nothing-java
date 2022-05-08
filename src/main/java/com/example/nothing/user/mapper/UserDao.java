package com.example.nothing.user.mapper;

import com.example.nothing.user.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author YJL
 * @Create 2022/5/8
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 获取所有用户
     * @return 用户信息
     */
    List<UserBean> getUser();
}
