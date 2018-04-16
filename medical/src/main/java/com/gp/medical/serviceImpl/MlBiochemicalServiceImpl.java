package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlBiochemical;
import com.gp.medical.repository.MlBiochemicalRepository;
import com.gp.medical.service.MlBiochemicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlBiochemicalServiceImpl implements MlBiochemicalService {

    @Autowired
    private MlBiochemicalRepository mlBiochemicalRepository;

    @Override
    public void saveBiochemical(MlBiochemical mlBiochemical) {

        mlBiochemicalRepository.save(mlBiochemical);

    }

    @Override
    public MlBiochemical findByPersonId(Integer personId) {
        return mlBiochemicalRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlBiochemical(MlBiochemical mlBiochemical) {
        MlBiochemical oldObj = findByPersonId(mlBiochemical.getPersonId());
        oldObj.setAcid(mlBiochemical.getAcid());
        oldObj.setAfp(mlBiochemical.getAfp());
        oldObj.setAlb(mlBiochemical.getAlb());
        oldObj.setAlp(mlBiochemical.getAlp());
        oldObj.setAlt(mlBiochemical.getAlt());
        oldObj.setAst(mlBiochemical.getAst());
        oldObj.setDbil(mlBiochemical.getDbil());
        oldObj.setFbg(mlBiochemical.getFbg());
        oldObj.setGgt(mlBiochemical.getGgt());
        oldObj.setInr(mlBiochemical.getInr());
        oldObj.setPt(mlBiochemical.getPt());
        oldObj.setScr(mlBiochemical.getScr());
        oldObj.setTbil(mlBiochemical.getTbil());
        oldObj.setTp(mlBiochemical.getTp());
        oldObj.setUn(mlBiochemical.getUn());
        mlBiochemicalRepository.save(oldObj);
    }
}
