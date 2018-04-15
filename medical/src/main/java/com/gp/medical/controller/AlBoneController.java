package com.gp.medical.controller;

import com.gp.medical.entity.AlBone;
import com.gp.medical.service.AlBoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/alBone")
public class AlBoneController {

    @Autowired
    private AlBoneService alBoneService;

    @PostMapping(path = "")
    public void saveAlBone(@RequestBody AlBone alBone){
        alBoneService.saveAlBone(alBone);
    }
}
