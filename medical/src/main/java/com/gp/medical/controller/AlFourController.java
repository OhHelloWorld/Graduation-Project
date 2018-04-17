package com.gp.medical.controller;

import com.gp.medical.entity.AlFour;
import com.gp.medical.service.AlFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@RestController
@RequestMapping(path = "/api/alFour")
public class AlFourController {

    @Autowired
    private AlFourService alFourService;

    @PostMapping(path = "")
    public void saveAlFour(@RequestBody AlFour alFour){
        alFourService.saveAlFour(alFour);
    }

    @GetMapping(path = "")
    public AlFour findByPersonId(@RequestParam Integer personId){
        return alFourService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateAlFour(@RequestBody AlFour alFour){
        alFourService.updateAlFour(alFour);
    }

}
