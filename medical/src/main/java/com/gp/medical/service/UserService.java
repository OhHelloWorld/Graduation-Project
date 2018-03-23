package com.gp.medical.service;

import com.gp.medical.entity.Person;
import com.gp.medical.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface UserService {

    Long registeredUser(User user);

    User login(User user);

    void collectionPerson(Long userId,Long personId);

    List<Person> pageCollections(Long userId,int page);

    int getCollectionCount(Long userId);

}
