package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlDrink;
import com.gp.medical.repository.MlDrinkRepository;
import com.gp.medical.service.MlDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlDrinkServiceImpl implements MlDrinkService {

    @Autowired
    private MlDrinkRepository mlDrinkRepository;

    @Override
    public void saveDrink(MlDrink mlDrink) {

        mlDrinkRepository.save(mlDrink);

    }

    @Override
    public MlDrink findByPersonId(Integer personId) {
        return mlDrinkRepository.findByPersonId(personId);
    }

    @Override
    public void updateMlDrink(MlDrink mlDrink) {
        MlDrink oldObj = findByPersonId(mlDrink.getPersonId());
        oldObj.setHistory(mlDrink.getHistory());
        oldObj.setSpecies(mlDrink.getSpecies());
        oldObj.setTime(mlDrink.getTime());
        mlDrinkRepository.save(oldObj);
    }
}
