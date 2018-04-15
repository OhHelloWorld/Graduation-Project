package com.gp.medical.controller;

import com.gp.medical.entity.MlFour;
import com.gp.medical.service.MlFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/mlFour")
public class MlFourController {

    @Autowired
    private MlFourService mlFourService;

    @PostMapping(path = "")
    public void saveMlFour(@RequestBody MlFour mlFour){
        mlFourService.saveMlFour(mlFour);
    }
}
