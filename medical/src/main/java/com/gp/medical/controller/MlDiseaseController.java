package com.gp.medical.controller;

import com.gp.medical.entity.MlDiseaseHistory;
import com.gp.medical.service.MlDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/mlDisease")
public class MlDiseaseController {

    @Autowired
    private MlDiseaseService mlDiseaseService;

    @PostMapping(path = "")
    public void saveMlDisease(@RequestBody MlDiseaseHistory mlDiseaseHistory){
        mlDiseaseService.saveMlDisease(mlDiseaseHistory);
    }
}
