package com.gp.medical.controller;

import com.gp.medical.entity.Person;
import com.gp.medical.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
@RestController
@RequestMapping(path = "/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    /**
     * 保存病例个人信息
     * @param person
     * @param userId
     */
    @PostMapping(path = "")
    public void savePerson(@RequestBody Person person, @RequestHeader(value = "userId") Long userId){
        personService.savePerson(person,userId);
    }

    /**
     * 得到所有病例
     * @return
     */
    @GetMapping(path = "/all")
    public List<Person> allPerson(){
        return personService.allPerson();
    }

    /**
     * 得到最新的六个病例
     * @return
     */
    @GetMapping(path = "/latest")
    public List<Person> latestPerson(){
        return personService.latestPerson();
    }

    /**
     * 得到该用户创建的病例
     * @param userId
     * @return
     */
    @GetMapping(path = "/mine")
    public List<Person> minePerson(@RequestHeader(value = "userId") Long userId){
        return personService.minePerson(userId);
    }

    /**
     * 跟据病例id得到某个病例
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    /**
     * 上传文件
     * @param file
     * @return
     */
    @PostMapping(path = "/file")
    public String uploadImage(@RequestParam MultipartFile file){
        return personService.uploadImage(file);
    }

}
