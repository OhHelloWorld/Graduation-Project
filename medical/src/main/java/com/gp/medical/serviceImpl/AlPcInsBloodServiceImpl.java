package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsBlood;
import com.gp.medical.repository.AlPcInsBloodRepository;
import com.gp.medical.service.AlPcInsBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsBloodServiceImpl implements AlPcInsBloodService {

    @Autowired
    private AlPcInsBloodRepository alPcInsBloodRepository;

    @Override
    public void saveBlood(AlPcInsBlood alPcInsBlood) {

        alPcInsBloodRepository.save(alPcInsBlood);

    }

    @Override
    public AlPcInsBlood findByPersonId(Integer personId) {
        return alPcInsBloodRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlPcInsBlood(AlPcInsBlood alPcInsBlood) {
        AlPcInsBlood oldObj = findByPersonId(alPcInsBlood.getPersonId());
        oldObj.setHb(alPcInsBlood.getHb());
        oldObj.setLymphocyte(alPcInsBlood.getLymphocyte());
        oldObj.setNeutrophil(alPcInsBlood.getNeutrophil());
        oldObj.setRbc(alPcInsBlood.getRbc());
        oldObj.setWbc(alPcInsBlood.getWbc());
        alPcInsBloodRepository.save(oldObj);
    }


}
