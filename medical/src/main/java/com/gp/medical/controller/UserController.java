package com.gp.medical.controller;

import com.gp.medical.entity.Person;
import com.gp.medical.entity.User;
import com.gp.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping(path = "/login")
    public @ResponseBody User login(@RequestBody User user){
        return userService.login(user);
    }

    /**
     * 收藏病例
     * @param personId
     * @param userId
     */
    @GetMapping(path = "/collection/{personId}")
    public void collectPerson(@PathVariable Long personId,@RequestHeader(value = "userId") Long userId){
        userService.collectionPerson(userId,personId);
    }

    /**
     * 根据用户Id得到该用户的所有收藏
     * @param userId
     * @return
     */
    @GetMapping(path = "/collections")
    public List<Person> getCollections(@RequestHeader(value = "userId") Long userId){
        return userService.getCollections(userId);
    }

}
