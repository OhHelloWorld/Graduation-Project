package com.gp.medical.controller;

import com.gp.medical.entity.MlLiver;
import com.gp.medical.service.MlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/mlLiver")
public class MlLiverController {

    @Autowired
    private MlLiverService mlLiverService;

    @PostMapping(path = "")
    public void saveLiver(@RequestBody MlLiver mlLiver){
        mlLiverService.saveLiver(mlLiver);
    }
}
