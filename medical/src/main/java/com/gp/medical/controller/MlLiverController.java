package com.gp.medical.controller;

import com.gp.medical.entity.MlLiver;
import com.gp.medical.service.MlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlLiver")
public class MlLiverController {

    @Autowired
    private MlLiverService mlLiverService;

    @PostMapping(path = "")
    public void saveLiver(@RequestBody MlLiver mlLiver){
        mlLiverService.saveLiver(mlLiver);
    }

    @GetMapping(path = "")
    public MlLiver findByPersonId(@RequestParam Integer personId){
        return mlLiverService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateMlLiver(@RequestBody MlLiver mlLiver){
        mlLiverService.updateMlLiver(mlLiver);
    }
}
