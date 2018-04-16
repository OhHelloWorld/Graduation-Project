package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlDiseaseHistory;
import com.gp.medical.repository.MlDiseaseRepository;
import com.gp.medical.service.MlDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlDiseaseServiceImpl implements MlDiseaseService {

    @Autowired
    private MlDiseaseRepository mlDiseaseRepository;

    @Override
    public void saveMlDisease(MlDiseaseHistory mlDiseaseHistory) {
        mlDiseaseRepository.save(mlDiseaseHistory);
    }

    @Override
    public MlDiseaseHistory findByPersonId(Integer personId) {
        return mlDiseaseRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlDisease(MlDiseaseHistory mlDiseaseHistory) {
        MlDiseaseHistory oldObj = findByPersonId(mlDiseaseHistory.getPersonId());
        oldObj.setOne(mlDiseaseHistory.getOne());
        oldObj.setOther(mlDiseaseHistory.getOther());
        oldObj.setTour(mlDiseaseHistory.getTour());
        mlDiseaseRepository.save(oldObj);
    }
}
