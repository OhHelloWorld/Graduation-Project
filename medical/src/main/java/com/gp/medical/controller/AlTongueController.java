package com.gp.medical.controller;

import com.gp.medical.entity.AlTongue;
import com.gp.medical.service.AlTongueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
@RestController
@RequestMapping(path = "/api/alTongue")
public class AlTongueController {

    @Autowired
    private AlTongueService alTongueService;

    /**
     * 存储
     * @param tongue
     */
    @PostMapping(path = "")
    public void saveAlTongue(@RequestBody  AlTongue tongue){
        alTongueService.saveTongue(tongue);
    }
}
