package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsLiver;
import com.gp.medical.repository.AlPcInsLiverRepository;
import com.gp.medical.service.AlPcInsLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsLiverServiceImpl implements AlPcInsLiverService {

    @Autowired
    private AlPcInsLiverRepository alPcInsLiverRepository;

    @Override
    public void saveLiver(AlPcInsLiver alPcInsLiver) {

        alPcInsLiverRepository.save(alPcInsLiver);

    }

    @Override
    public AlPcInsLiver findByPersonId(Integer personId) {
        return alPcInsLiverRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlPcInsLiver(AlPcInsLiver alPcInsLiver) {
        AlPcInsLiver oldObj = findByPersonId(alPcInsLiver.getPersonId());
        oldObj.setAlbumin(alPcInsLiver.getAlbumin());
        oldObj.setAlp(alPcInsLiver.getAlp());
        oldObj.setAlt(alPcInsLiver.getAlt());
        oldObj.setAst(alPcInsLiver.getAst());
        oldObj.setGgt(alPcInsLiver.getGgt());
        oldObj.setGlobulin(alPcInsLiver.getGlobulin());
        alPcInsLiverRepository.save(oldObj);
    }
}
