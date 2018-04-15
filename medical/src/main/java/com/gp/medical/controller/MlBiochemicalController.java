package com.gp.medical.controller;

import com.gp.medical.entity.MlBiochemical;
import com.gp.medical.service.MlBiochemicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/mlBiochemical")
public class MlBiochemicalController {

    @Autowired
    private MlBiochemicalService mlBiochemicalService;

    @PostMapping(path = "")
    public void saveBiochemical(@RequestBody MlBiochemical mlBiochemical){
        mlBiochemicalService.saveBiochemical(mlBiochemical);
    }
}
