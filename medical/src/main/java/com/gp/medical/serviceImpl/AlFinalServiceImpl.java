package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlFinal;
import com.gp.medical.repository.AlFinalRepository;
import com.gp.medical.service.AlFinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlFinalServiceImpl implements AlFinalService {

    @Autowired
    private AlFinalRepository alFinalRepository;

    @Override
    public void saveAlFinal(AlFinal alFinal) {
        alFinalRepository.save(alFinal);
    }

    @Override
    public AlFinal findByPersonId(Integer personId) {
        return alFinalRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlFinal(AlFinal alFinal) {
        AlFinal oldObj = findByPersonId(alFinal.getPersonId());
        oldObj.setAih(alFinal.getAih());
        oldObj.setPbc(alFinal.getPbc());
        oldObj.setSpecial(alFinal.getSpecial());
        alFinalRepository.save(oldObj);
    }
}
