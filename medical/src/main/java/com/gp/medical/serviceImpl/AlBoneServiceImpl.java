package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlBone;
import com.gp.medical.repository.AlBoneRepository;
import com.gp.medical.service.AlBoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlBoneServiceImpl implements AlBoneService {

    @Autowired
    private AlBoneRepository alBoneRepository;

    @Override
    public void saveAlBone(AlBone alBone) {
        alBoneRepository.save(alBone);
    }

    @Override
    public AlBone findByPersonId(Integer personId) {
        return alBoneRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlBone(AlBone alBone) {
        AlBone oldObj = findByPersonId(alBone.getPersonId());
        oldObj.setBr(alBone.getBr());
        oldObj.setBrT(alBone.getBrT());
        oldObj.setDiagnosis(alBone.getDiagnosis());
        oldObj.setFn(alBone.getFn());
        oldObj.setFnT(alBone.getFnT());
        oldObj.setLv(alBone.getLv());
        oldObj.setLvT(alBone.getLvT());
        oldObj.setTh(alBone.getTh());
        oldObj.setThT(alBone.getThT());
        alBoneRepository.save(oldObj);
    }
}
