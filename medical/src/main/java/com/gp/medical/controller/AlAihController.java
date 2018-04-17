package com.gp.medical.controller;

import com.gp.medical.entity.AlAih;
import com.gp.medical.service.AlAihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/alAih")
public class AlAihController {

    @Autowired
    private AlAihService alAihService;

    @PostMapping(path = "")
    public void saveAlAih(@RequestBody AlAih alAih){
        alAihService.saveAlAih(alAih);
    }

    @GetMapping(path = "")
    public AlAih findByPersonId(@RequestParam Integer personId){
        return alAihService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateAlAih(@RequestBody AlAih alAih){
        alAihService.updateAlAih(alAih);
    }
}
