package com.gp.medical.controller;

import com.gp.medical.entity.AlTongue;
import com.gp.medical.service.AlTongueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
@RestController
@RequestMapping(path = "/api/alTongue")
public class AlTongueController {

    @Autowired
    private AlTongueService alTongueService;

    /**
     * 存储
     * @param tongue
     */
    @PostMapping(path = "")
    public void saveAlTongue(@RequestBody  AlTongue tongue){
        alTongueService.saveTongue(tongue);
    }

    @GetMapping(path = "")
    public AlTongue findByPersonId(@RequestParam Integer personId){
        return alTongueService.findByPersonId(personId);
    }

    @PostMapping(path = "/update")
    public void updateAlTongue(@RequestBody AlTongue alTongue){
        alTongueService.updateAlTongue(alTongue);
    }
}
