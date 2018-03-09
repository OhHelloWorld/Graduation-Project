package com.gp.medical.controller;

import com.gp.medical.entity.AlPerson;
import com.gp.medical.service.AlPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
@RestController
@RequestMapping(path = "/api/alPerson")
public class AlPersonController {

    @Autowired
    private AlPersonService alPersonService;

    @PostMapping(path = "")
    public void saveAlPerson(@RequestBody AlPerson alPerson, @RequestHeader(value = "userId") Long userId){
        alPersonService.saveAlPerson(alPerson,userId);
    }

    @GetMapping(path = "/all")
    public List<AlPerson> allAlPerson(){
        return alPersonService.allAlPerson();
    }

    @GetMapping(path = "/mine")
    public List<AlPerson> mineAlPerson(@RequestHeader(value = "userId") Long userId){
        return alPersonService.mineAlPerson(userId);
    }

    @GetMapping(path = "/{id}")
    public AlPerson getAlPersonById(@PathVariable Long id){
        return alPersonService.getAlPersonById(id);
    }
}
