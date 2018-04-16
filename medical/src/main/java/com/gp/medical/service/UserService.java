package com.gp.medical.service;

import com.gp.medical.entity.Document;
import com.gp.medical.entity.Person;
import com.gp.medical.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface UserService {

    Integer registeredUser(User user);

    User login(User user);

    void collectionPerson(Integer userId,Integer personId);

    void uncollectPerson(Integer userId,Integer personId);

    void collectionDoc(Integer userId,Integer docId);

    void uncollectDoc(Integer userId,Integer docId);

    List<Person> pageCollections(Integer userId,int page);

    List<Document> pageDocCollections(Integer userId,int page);

    int getCollectionCount(Integer userId);

    int getDocCollectionCount(Integer userId);

}
