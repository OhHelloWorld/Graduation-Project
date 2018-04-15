package com.gp.medical.controller;

import com.gp.medical.entity.MlBlood;
import com.gp.medical.service.MlBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/mlBlood")
public class MlBloodController {

    @Autowired
    private MlBloodService mlBloodService;

    @PostMapping(path = "")
    public void saveBlood(@RequestBody MlBlood mlBlood){
        mlBloodService.saveBlood(mlBlood);
    }
}
