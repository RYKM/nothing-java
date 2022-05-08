package com.example.nothing.user.contorller;

import com.example.nothing.user.bean.UserBean;
import com.example.nothing.user.service.UserService;
import com.example.nothing.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author YJL
 * @Create 2022/5/8
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JsonResult login(){
        System.err.println("aaaaaaaaaa");
        JsonResult result = new JsonResult(false);
        List<UserBean> userList = userService.getUser();
        for (UserBean userBean : userList) {
            System.err.println(userBean);
        }
        result.setMsg("登录成功");
        result.setSuccess(true);
        return result;
    }
}
