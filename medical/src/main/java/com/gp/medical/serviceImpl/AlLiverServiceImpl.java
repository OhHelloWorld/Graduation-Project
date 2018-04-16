package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlLiver;
import com.gp.medical.repository.AlLiverRepository;
import com.gp.medical.service.AlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlLiverServiceImpl implements AlLiverService {

    @Autowired
    private AlLiverRepository alLiverRepository;

    @Override
    public void saveAlLiver(AlLiver alLiver) {

        alLiverRepository.save(alLiver);

    }

    @Override
    public AlLiver findByPersonId(Integer personId) {
        return alLiverRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlLiver(AlLiver alLiver) {
        AlLiver oldObj = findByPersonId(alLiver.getPersonId());
        oldObj.setHbcAg(alLiver.getHbcAg());
        oldObj.setHbsAg(alLiver.getHbsAg());
        oldObj.setHcv(alLiver.getHcv());
        oldObj.setIh(alLiver.getIh());
        oldObj.setLi(alLiver.getLi());
        oldObj.setPi1(alLiver.getPi1());
        oldObj.setPi2(alLiver.getPi2());
        oldObj.setRc(alLiver.getRc());
        alLiverRepository.save(oldObj);
    }
}
