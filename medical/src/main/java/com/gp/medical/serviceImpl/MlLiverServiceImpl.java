package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlLiver;
import com.gp.medical.repository.MlLiverRepository;
import com.gp.medical.service.MlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlLiverServiceImpl implements MlLiverService {

    @Autowired
    private MlLiverRepository mlLiverRepository;

    @Override
    public void saveLiver(MlLiver mlLiver) {

        mlLiverRepository.save(mlLiver);

    }

    @Override
    public MlLiver findByPersonId(Integer personId) {
        return mlLiverRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlLiver(MlLiver mlLiver) {
        MlLiver oldObj = findByPersonId(mlLiver.getPersonId());
        oldObj.setOption1(mlLiver.getOption1());
        oldObj.setOption2(mlLiver.getOption2());
        oldObj.setOption3(mlLiver.getOption3());
        oldObj.setOption4(mlLiver.getOption4());
        oldObj.setOption5(mlLiver.getOption5());
        mlLiverRepository.save(oldObj);
    }
}
