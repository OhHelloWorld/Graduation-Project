package com.gp.medical.service;

import com.gp.medical.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface UserService {

    void removeUser(Long id);

    List<User> listUsers();

    Long registeredUser(User user);

}
