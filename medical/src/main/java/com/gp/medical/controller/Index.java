package com.gp.medical.controller;

import com.gp.medical.entity.User;
import com.gp.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
@RestController
public class Index {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/")
    public String hello(){
        return "hello world";
    }

    @GetMapping(path = "/users")
    public List<User> listUser(){
        return userService.listUsers();
    }

    @GetMapping(path = "/delete/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteUser(@PathVariable Long id){
        userService.removeUser(id);
    }

    @GetMapping(path = "/admins")
    public List<User> listAdmin(){
        return userService.listUsers();
    }

    @PostMapping(path = "/login")
    public void login(@RequestBody User user){
        userService.saveUser(user);
    }
}
