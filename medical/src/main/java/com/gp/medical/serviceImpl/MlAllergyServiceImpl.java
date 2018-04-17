package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlAllergy;
import com.gp.medical.repository.MlAllergyRepository;
import com.gp.medical.service.MlAllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlAllergyServiceImpl implements MlAllergyService {

    @Autowired
    private MlAllergyRepository mlAllergyRepository;

    @Override
    public void saveAllergy(MlAllergy mlAllergy) {
        mlAllergyRepository.save(mlAllergy);
    }

    @Override
    public MlAllergy findByPersonId(Integer personId) {
        return mlAllergyRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlAllergy(MlAllergy mlAllergy) {
        MlAllergy oldObj = findByPersonId(mlAllergy.getPersonId());
        oldObj.setAllergen(mlAllergy.getAllergen());
        oldObj.setAllergy(mlAllergy.getAllergy());
        oldObj.setRemark(mlAllergy.getRemark());
        mlAllergyRepository.save(oldObj);
    }
}
