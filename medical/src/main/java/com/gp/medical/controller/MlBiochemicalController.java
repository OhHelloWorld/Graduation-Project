package com.gp.medical.controller;

import com.gp.medical.entity.MlBiochemical;
import com.gp.medical.service.MlBiochemicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlBiochemical")
public class MlBiochemicalController {

    @Autowired
    private MlBiochemicalService mlBiochemicalService;

    @PostMapping(path = "")
    public void saveBiochemical(@RequestBody MlBiochemical mlBiochemical){
        mlBiochemicalService.saveBiochemical(mlBiochemical);
    }

    @GetMapping(path = "")
    public MlBiochemical findByPersonId(@RequestParam Integer personId){
        return mlBiochemicalService.findByPersonId(personId);
    }
}
