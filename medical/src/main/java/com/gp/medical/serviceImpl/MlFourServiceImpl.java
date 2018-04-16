package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlFour;
import com.gp.medical.repository.MlFourRepository;
import com.gp.medical.service.MlFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlFourServiceImpl implements MlFourService {

    @Autowired
    private MlFourRepository mlFourRepository;

    @Override
    public void saveMlFour(MlFour mlFour) {

        mlFourRepository.save(mlFour);

    }

    @Override
    public MlFour findByPersonId(Integer personId) {
        return mlFourRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlFour(MlFour mlFour) {
        MlFour oldObj = findByPersonId(mlFour.getPersonId());
        oldObj.setAngry(mlFour.getAngry());
        oldObj.setDepress(mlFour.getDepress());
        oldObj.setDry(mlFour.getDry());
        oldObj.setFatigue(mlFour.getFatigue());
        oldObj.setInsomnia(mlFour.getInsomnia());
        oldObj.setItch(mlFour.getItch());
        oldObj.setThirst(mlFour.getThirst());
        oldObj.setTinnitus(mlFour.getTinnitus());
        oldObj.setVague(mlFour.getVague());
        oldObj.setWake(mlFour.getWake());
        mlFourRepository.save(oldObj);
    }
}
