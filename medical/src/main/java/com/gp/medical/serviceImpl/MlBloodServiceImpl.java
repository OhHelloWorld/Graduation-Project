package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlBlood;
import com.gp.medical.repository.MlBloodRepository;
import com.gp.medical.service.MlBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlBloodServiceImpl implements MlBloodService {

    @Autowired
    private MlBloodRepository mlBloodRepository;

    @Override
    public void saveBlood(MlBlood mlBlood) {
        mlBloodRepository.save(mlBlood);
    }

    @Override
    public MlBlood findByPersonId(Integer personId) {
        return mlBloodRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlBlood(MlBlood mlBlood) {
        MlBlood oldObj = findByPersonId(mlBlood.getPersonId());
        oldObj.setE(mlBlood.getE());
        oldObj.setHb(mlBlood.getHb());
        oldObj.setN(mlBlood.getN());
        oldObj.setPlt(mlBlood.getPlt());
        oldObj.setThc(mlBlood.getThc());
        oldObj.setWbc(mlBlood.getWbc());
        mlBloodRepository.save(oldObj);
    }
}
