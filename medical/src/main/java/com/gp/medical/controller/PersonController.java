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
    public void savePerson(@RequestBody Person person, @RequestHeader(value = "userId") Integer userId){
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
     * 得到该用户创建的病例（分页）
     * @param userId
     * @return
     */
    @GetMapping(path = "/mine/page")
    public List<Person> minePerson(@RequestHeader(value = "userId") Integer userId,@RequestParam(value = "page") String page){
        return personService.minePersonByPage(userId,page);
    }

    /**
     * 得到某个用户创建的病例数量
     * @param userId
     * @return
     */
    @GetMapping(path = "/mine/count")
    public int minePersonCount(@RequestHeader(value = "userId") Integer userId){
        return personService.getMinePersonCount(userId);
    }


    /**
     * 跟据病例id得到某个病例
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable Integer id){
        return personService.getPersonById(id);
    }

    /**
     * 得到所有病例数量
     * @return
     */
    @GetMapping(path = "/count")
    public Integer getPersonCount(@RequestParam String gender,@RequestParam String age){
        return personService.getPersonCount(gender,age);
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

    /**
     * 得到所有用户的病例（分页）
     * @param page
     * @return
     */
    @GetMapping(path = "/page")
    public List<Person> getPersonByPage(@RequestParam String page,@RequestParam String gender,@RequestParam String age){
        return personService.getPersonByPage(page,gender,age);
    }

    /**
     * 判断用户是否收藏某病例
     * @param userId
     * @param personId
     * @return
     */
    @GetMapping(path = "/hasCollect")
    public Boolean getCollectStatus(@RequestHeader(value = "userId") Integer userId,@RequestParam(value = "personId") Integer personId){
        return personService.hasCollect(userId,personId);
    }

    @PostMapping(path = "/update")
    public void updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
    }

}
