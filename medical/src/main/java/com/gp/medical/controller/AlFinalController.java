package com.gp.medical.controller;

import com.gp.medical.entity.AlFinal;
import com.gp.medical.service.AlFinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/alFinal")
public class AlFinalController {

    @Autowired
    private AlFinalService alFinalService;

    @PostMapping(path = "")
    public void saveAlFinal(@RequestBody AlFinal alFinal){
        alFinalService.saveAlFinal(alFinal);
    }

    @GetMapping(path = "")
    public AlFinal findByPersonId(@RequestParam Integer personId){
        return alFinalService.findByPersonId(personId);
    }
}
