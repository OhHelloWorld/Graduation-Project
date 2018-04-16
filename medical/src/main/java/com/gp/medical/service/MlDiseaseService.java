package com.gp.medical.service;

import com.gp.medical.entity.MlDiseaseHistory;

public interface MlDiseaseService {

    void saveMlDisease(MlDiseaseHistory mlDiseaseHistory);

    MlDiseaseHistory findByPersonId(Integer personId);

    void updateMlDisease(MlDiseaseHistory mlDiseaseHistory);
}
