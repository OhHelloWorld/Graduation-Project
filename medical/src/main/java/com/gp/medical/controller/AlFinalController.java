package com.gp.medical.controller;

import com.gp.medical.entity.AlFinal;
import com.gp.medical.service.AlFinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/alFinal")
public class AlFinalController {

    @Autowired
    private AlFinalService alFinalService;

    @PostMapping(path = "")
    public void saveAlFinal(@RequestBody AlFinal alFinal){
        alFinalService.saveAlFinal(alFinal);
    }
}
