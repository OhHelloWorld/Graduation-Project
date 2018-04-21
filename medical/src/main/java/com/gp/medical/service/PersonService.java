package com.gp.medical.service;

import com.gp.medical.entity.Person;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface PersonService {

    void savePerson(Person person, Integer userId);

    List<Person> minePersonByPage(Integer userId,String page);

    List<Person> allPerson();

    Person getPersonById(Integer id);

    String uploadImage(MultipartFile file);

    List<Person> latestPerson();

    Integer getPersonCount(String gender, String age);

    int getMinePersonCount(Integer userId);

    List<Person> getPersonByPage(String page,String gender,String age);

    Boolean hasCollect(Integer userId,Integer personId);

    void updatePerson(Person person);

    List<Person> getSearchPerson(String name);

    List<Integer> getAgeChartData();

    List<Integer> getGenderChartData();
}
