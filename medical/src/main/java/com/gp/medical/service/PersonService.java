package com.gp.medical.service;

import com.gp.medical.entity.Person;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface PersonService {

    void savePerson(Person alPerson, Long userId);

    List<Person> minePerson(Long userId);

    List<Person> allPerson();

    Person getPersonById(Long id);
}
