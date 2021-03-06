package com.gp.medical.controller;

import com.gp.medical.entity.MlDiseaseHistory;
import com.gp.medical.service.MlDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlDisease")
public class MlDiseaseController {

    @Autowired
    private MlDiseaseService mlDiseaseService;

    @PostMapping(path = "")
    public void saveMlDisease(@RequestBody MlDiseaseHistory mlDiseaseHistory){
        mlDiseaseService.saveMlDisease(mlDiseaseHistory);
    }

    @GetMapping(path = "")
    public MlDiseaseHistory findByPersonId(@RequestParam Integer personId){
        return mlDiseaseService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateMlDisease(@RequestBody MlDiseaseHistory mlDiseaseHistory){
        mlDiseaseService.updateMlDisease(mlDiseaseHistory);
    }
}
