package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsHepatitisB;
import com.gp.medical.repository.AlPcInsHbRepository;
import com.gp.medical.service.AlPcInsHbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsHbServiceImpl implements AlPcInsHbService {

    @Autowired
    private AlPcInsHbRepository alPcInsHbRepository;

    @Override
    public void saveHb(AlPcInsHepatitisB alPcInsHepatitisB) {
        alPcInsHbRepository.save(alPcInsHepatitisB);
    }

    @Override
    public AlPcInsHepatitisB findByPersonId(Integer personId) {
        return alPcInsHbRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlPcInsHb(AlPcInsHepatitisB alPcInsHepatitisB) {
        AlPcInsHepatitisB oldObj = findByPersonId(alPcInsHepatitisB.getPersonId());
        oldObj.setHbcAb(alPcInsHepatitisB.getHbcAb());
        oldObj.setHbeAb(alPcInsHepatitisB.getHbeAb());
        oldObj.setHbeAg(alPcInsHepatitisB.getHbeAg());
        oldObj.setHbsAb(alPcInsHepatitisB.getHbsAb());
        oldObj.setHbsAg(alPcInsHepatitisB.getHbsAg());
        oldObj.setHbvRna(alPcInsHepatitisB.getHbvRna());
        alPcInsHbRepository.save(oldObj);
    }
}
