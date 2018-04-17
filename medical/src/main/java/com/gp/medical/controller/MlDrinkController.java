package com.gp.medical.controller;

import com.gp.medical.entity.MlDrink;
import com.gp.medical.service.MlDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mlDrink")
public class MlDrinkController {

    @Autowired
    private MlDrinkService mlDrinkService;

    @PostMapping(path = "")
    public void saveDrink(@RequestBody MlDrink mlDrink){
        mlDrinkService.saveDrink(mlDrink);
    }

    @GetMapping(path = "")
    public MlDrink findByPersonId(@RequestParam Integer personId){
        return mlDrinkService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateMlDrink(@RequestBody MlDrink mlDrink){
        mlDrinkService.updateMlDrink(mlDrink);
    }
}
