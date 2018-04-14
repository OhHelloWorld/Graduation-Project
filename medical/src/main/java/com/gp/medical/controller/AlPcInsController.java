package com.gp.medical.controller;

import com.gp.medical.entity.*;
import com.gp.medical.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/alPcIns")
public class AlPcInsController {

    @Autowired
    private AlPcInsLiverService alPcInsLiverService;

    @Autowired
    private AlPcInsKidneyService alPcInsKidneyService;

    @Autowired
    private AlPcInsCoaService alPcInsCoaService;

    @Autowired
    private AlPcInsBloodService alPcInsBloodService;

    @Autowired
    private AlPcInsHbService alPcInsHbService;

    @PostMapping(path = "/liver")
    public void saveLiver(@RequestBody AlPcInsLiver alPcInsLiver){
        alPcInsLiverService.saveLiver(alPcInsLiver);
    }

    @PostMapping(path = "/kidney")
    public void saveKidney(@RequestBody AlPcInsKidney alPcInsKidney){
        alPcInsKidneyService.saveKidney(alPcInsKidney);
    }

    @PostMapping(path = "/coa")
    public void saveCoa(@RequestBody AlPcInsCoagulation alPcInsCoagulation){
        alPcInsCoaService.saveCoa(alPcInsCoagulation);
    }

    @PostMapping(path = "/blood")
    public void saveBlood(@RequestBody AlPcInsBlood alPcInsBlood){
        alPcInsBloodService.saveBlood(alPcInsBlood);
    }

    @PostMapping(path = "/hb")
    public void saveHb(@RequestBody AlPcInsHepatitisB alPcInsHepatitisB){
        alPcInsHbService.saveHb(alPcInsHepatitisB);
    }
}
