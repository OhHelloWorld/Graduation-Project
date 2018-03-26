package com.gp.medical.controller;

import com.gp.medical.entity.Document;
import com.gp.medical.entity.Person;
import com.gp.medical.entity.User;
import com.gp.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/3/6 0006.
 */
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册用户
     * @param user
     * @return user_id
     */
    @PostMapping(path = "/register")
    public Long register(@RequestBody User user){
        return userService.registeredUser(user);
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping(path = "/login")
    public @ResponseBody User login(@RequestBody User user){
        return userService.login(user);
    }

    /**
     * 收藏病例
     * @param personId
     * @param userId
     */
    @GetMapping(path = "/collection/{personId}")
    public void collectPerson(@PathVariable Long personId,@RequestHeader(value = "userId") Long userId){
        userService.collectionPerson(userId,personId);
    }

    /**
     * 取消收藏病例
     * @param userId
     * @param personId
     */
    @GetMapping(path = "/uncollectPerson")
    public void uncollectPerson(@RequestHeader(value = "userId") Long userId,@RequestParam(value = "personId") Long personId){
        userService.uncollectPerson(userId,personId);
    }

    /**
     * 收藏文章
     * @param docId
     * @param userId
     */
    @GetMapping(path = "/docCollection/{docId}")
    public void collectionDoc(@PathVariable Long docId,@RequestHeader(value = "userId") Long userId){
        userService.collectionDoc(userId,docId);
    }

    /**
     * 取消收藏文章
     * @param userId
     * @param docId
     */
    @GetMapping(path = "/uncollectDoc")
    public void uncollectDoc(@RequestHeader(value = "userId") Long userId,@RequestParam(value = "docId") Long docId){
        userService.uncollectDoc(userId,docId);
    }

    /**
     * 根据用户Id得到该用户的所有病例收藏（分页）
     * @param userId
     * @return
     */
    @GetMapping(path = "/collections/page")
    public List<Person> pageCollections(@RequestHeader(value = "userId") Long userId,@RequestParam(value = "page") String page){
        return userService.pageCollections(userId,Integer.valueOf(page));
    }

    /**
     * 根据用户Id得到该用户的所有文藏收藏（分页）
     * @param userId
     * @param page
     * @return
     */
    @GetMapping(path = "/docCollections/page")
    public List<Document> pageDocCollections(@RequestHeader(value = "userId") Long userId,@RequestParam(value = "page") String page){
        return userService.pageDocCollections(userId,Integer.valueOf(page));
    }

    /**
     * 根据用户Id得到该用户的病例收藏数量
     * @param userId
     * @return
     */
    @GetMapping(path = "/collections/count")
    public int getCollectionCount(@RequestHeader(value = "userId") Long userId){
         return userService.getCollectionCount(userId);
    }

    /**
     * 根据用户Id得到该用户的文章收藏数量
     * @param userId
     * @return
     */
    @GetMapping(path = "/docCollections/count")
    public int getDocCollectionCount(@RequestHeader(value = "userId") Long userId){
        return userService.getDocCollectionCount(userId);
    }

}
