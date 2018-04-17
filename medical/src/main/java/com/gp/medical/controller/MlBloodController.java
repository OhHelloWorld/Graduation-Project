package com.gp.medical.controller;

import com.gp.medical.entity.MlBlood;
import com.gp.medical.service.MlBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlBlood")
public class MlBloodController {

    @Autowired
    private MlBloodService mlBloodService;

    @PostMapping(path = "")
    public void saveBlood(@RequestBody MlBlood mlBlood){
        mlBloodService.saveBlood(mlBlood);
    }

    @GetMapping(path = "")
    public MlBlood findByPersonId(@RequestParam Integer personId){
        return mlBloodService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateMlBlood(@RequestBody MlBlood mlBlood){
        mlBloodService.updateMlBlood(mlBlood);
    }
}