package com.gp.medical.controller;

import com.gp.medical.entity.Person;
import com.gp.medical.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
@RestController
@RequestMapping(path = "/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(path = "")
    public void savePerson(@RequestBody Person person, @RequestHeader(value = "userId") Long userId){
        personService.savePerson(person,userId);
    }

    @GetMapping(path = "/all")
    public List<Person> allPerson(){
        return personService.allPerson();
    }

    @GetMapping(path = "/mine")
    public List<Person> minePerson(@RequestHeader(value = "userId") Long userId){
        return personService.minePerson(userId);
    }

    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }
}
