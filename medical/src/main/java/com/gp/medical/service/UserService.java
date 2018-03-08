package com.gp.medical.service;

import com.gp.medical.entity.User;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface UserService {

    Long registeredUser(User user);

    User login(User user);

}
