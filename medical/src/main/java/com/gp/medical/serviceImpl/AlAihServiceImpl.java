package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlAih;
import com.gp.medical.repository.AlAihRepository;
import com.gp.medical.service.AlAihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlAihServiceImpl implements AlAihService {

    @Autowired
    private AlAihRepository alAihRepository;

    @Override
    public void saveAlAih(AlAih alAih) {
        alAihRepository.save(alAih);
    }

    @Override
    public AlAih findByPersonId(Integer personId) {
        return alAihRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlAih(AlAih alAih) {
        AlAih oldObj = findByPersonId(alAih.getPersonId());
        oldObj.setAnasma1(alAih.getAnasma1());
        oldObj.setAnasma2(alAih.getAnasma2());
        oldObj.setAntiLkm(alAih.getAntiLkm());
        oldObj.setAntiSla(alAih.getAntiSla());
        oldObj.setExcludeViralHepatitis(alAih.getExcludeViralHepatitis());
        oldObj.setIgg(alAih.getIgg());
        oldObj.setLiverHistology(alAih.getLiverHistology());
        alAihRepository.save(oldObj);
    }
}
