package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlFour;
import com.gp.medical.repository.AlFourRepository;
import com.gp.medical.service.AlFourService;
import com.gp.medical.tool.Switch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Service
public class AlFourServiceImpl implements AlFourService{

    @Autowired
    private AlFourRepository alFourRepository;

    @Override
    public void saveAlFour(AlFour alFour) {
        alFourRepository.save(alFour);
    }

    @Override
    public AlFour findByPersonId(Integer personId) {
        return alFourRepository.findByPersonId(personId);
    }

    @Override
    public void updateAlFour(AlFour alFour) {
        AlFour oldObj = findByPersonId(alFour.getPersonId());
        oldObj.setAngry(alFour.getAngry());
        oldObj.setDepress(alFour.getDepress());
        oldObj.setDry(alFour.getDry());
        oldObj.setFatigue(alFour.getFatigue());
        oldObj.setInsomnia(alFour.getInsomnia());
        oldObj.setItch(alFour.getItch());
        oldObj.setThirst(alFour.getThirst());
        oldObj.setTinnitus(alFour.getTinnitus());
        oldObj.setVague(alFour.getVague());
        oldObj.setWake(alFour.getWake());
        alFourRepository.save(oldObj);
    }
}
