package com.gp.medical.controller;

import com.gp.medical.entity.MlAllergy;
import com.gp.medical.service.MlAllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlAllergy")
public class MlAllergyController {

    @Autowired
    private MlAllergyService mlAllergyService;

    @PostMapping(path = "")
    public void saveAllergy(@RequestBody MlAllergy mlAllergy){
        mlAllergyService.saveAllergy(mlAllergy);
    }

    @GetMapping(path = "")
    public MlAllergy findByPersonId(@RequestParam Integer personId){
        return mlAllergyService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateMlAllergy(@RequestBody MlAllergy mlAllergy){
        mlAllergyService.updateMlAllergy(mlAllergy);
    }
}
