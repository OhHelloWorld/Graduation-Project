package com.gp.medical.controller;

import com.gp.medical.entity.AlLiver;
import com.gp.medical.service.AlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/alLiver")
public class AlLiverController {

    @Autowired
    private AlLiverService alLiverService;

    @PostMapping(path = "")
    public void saveAlLiver(@RequestBody AlLiver alLiver){
        alLiverService.saveAlLiver(alLiver);
    }

    @GetMapping(path = "")
    public AlLiver findByPersonId(@RequestParam Integer personId){
        return alLiverService.findByPersonId(personId);
    }
}
