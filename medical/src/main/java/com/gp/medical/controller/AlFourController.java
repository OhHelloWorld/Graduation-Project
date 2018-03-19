package com.gp.medical.controller;

import com.gp.medical.entity.AlFour;
import com.gp.medical.service.AlFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@RestController
@RequestMapping(path = "/api/alFour")
public class AlFourController {

    @Autowired
    private AlFourService alFourService;

    @PostMapping(path = "")
    public void saveAlFour(@RequestBody AlFour alFour){
        alFourService.saveAlFour(alFour);
    }
}
