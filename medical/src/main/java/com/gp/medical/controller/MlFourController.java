package com.gp.medical.controller;

import com.gp.medical.entity.MlFour;
import com.gp.medical.service.MlFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlFour")
public class MlFourController {

    @Autowired
    private MlFourService mlFourService;

    @PostMapping(path = "")
    public void saveMlFour(@RequestBody MlFour mlFour){
        mlFourService.saveMlFour(mlFour);
    }

    @GetMapping(path = "")
    public MlFour findByPersonId(@RequestParam Integer personId){
        return mlFourService.findByPersonId(personId);
    }
}
