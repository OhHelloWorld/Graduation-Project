package com.gp.medical.service;

import com.gp.medical.entity.Document;
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

    void uncollectPerson(Long userId,Long personId);

    void collectionDoc(Long userId,Long docId);

    void uncollectDoc(Long userId,Long docId);

    List<Person> pageCollections(Long userId,int page);

    List<Document> pageDocCollections(Long userId,int page);

    int getCollectionCount(Long userId);

    int getDocCollectionCount(Long userId);

}
