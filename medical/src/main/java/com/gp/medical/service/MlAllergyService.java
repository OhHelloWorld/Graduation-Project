package com.gp.medical.service;

import com.gp.medical.entity.MlAllergy;

public interface MlAllergyService {

    void saveAllergy(MlAllergy mlAllergy);

    MlAllergy findByPersonId(Integer personId);

    void updateMlAllergy(MlAllergy mlAllergy);
}
