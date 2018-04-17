package com.gp.medical.controller;

import com.gp.medical.entity.*;
import com.gp.medical.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/liver")
    public AlPcInsLiver findByLiverPersonId(@RequestParam Integer personId){
        return alPcInsLiverService.findByPersonId(personId);
    }

    @GetMapping(path = "/kidney")
    public AlPcInsKidney findByKidneyPersonId(@RequestParam Integer personId){
        return alPcInsKidneyService.findByPersonId(personId);
    }

    @GetMapping(path = "/coa")
    public AlPcInsCoagulation findCoaByPersonId(@RequestParam Integer personId){
        return alPcInsCoaService.findByPersonId(personId);
    }

    @GetMapping(path = "/blood")
    public AlPcInsBlood findBloodByPersonId(@RequestParam Integer personId){
        return alPcInsBloodService.findByPersonId(personId);
    }

    @GetMapping(path = "/hb")
    public AlPcInsHepatitisB findHbByPersonId(@RequestParam Integer personId){
        return alPcInsHbService.findByPersonId(personId);
    }

    @PostMapping(path = "/liver/update")
    public void updateLiver(@RequestBody AlPcInsLiver alPcInsLiver){
        alPcInsLiverService.updateAlPcInsLiver(alPcInsLiver);
    }

    @PostMapping(path = "/kidney/update")
    public void updateKidney(@RequestBody AlPcInsKidney alPcInsKidney){
        alPcInsKidneyService.updateAlPcInsKidney(alPcInsKidney);
    }

    @PostMapping(path = "/coa/update")
    public void updateCoa(@RequestBody AlPcInsCoagulation alPcInsCoagulation){
        alPcInsCoaService.updateAlPcInsCoa(alPcInsCoagulation);
    }

    @PostMapping(path = "/blood/update")
    public void updateBlood(@RequestBody AlPcInsBlood alPcInsBlood){
        alPcInsBloodService.updateAlPcInsBlood(alPcInsBlood);
    }

    @PostMapping(path = "/hb/update")
    public void updateHb(@RequestBody AlPcInsHepatitisB alPcInsHepatitisB){
        alPcInsHbService.updateAlPcInsHb(alPcInsHepatitisB);
    }


}
