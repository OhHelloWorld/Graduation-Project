package com.gp.medical.service;

import com.gp.medical.entity.Person;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface PersonService {

    void savePerson(Person alPerson, Long userId);

    List<Person> minePersonByPage(Long userId,String page);

    List<Person> allPerson();

    Person getPersonById(Long id);

    String uploadImage(MultipartFile file);

    List<Person> latestPerson();

    Long getPersonCount();

    int getMinePersonCount(Long userId);

    List<Person> getPersonByPage(String page);
}
