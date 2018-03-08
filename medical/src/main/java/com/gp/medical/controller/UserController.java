package com.gp.medical.controller;

import com.gp.medical.entity.User;
import com.gp.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/3/6 0006.
 */
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册用户
     * @param user
     * @return user_id
     */
    @PostMapping(path = "/register")
    public Long register(@RequestBody User user){
        return userService.registeredUser(user);
    }

    @PostMapping(path = "/login")
    public @ResponseBody User login(@RequestBody User user){
        return userService.login(user);
    }

}
