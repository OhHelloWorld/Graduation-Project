package com.gp.medical.service;

import com.gp.medical.entity.MlDrink;

public interface MlDrinkService {

    void saveDrink(MlDrink mlDrink);

    MlDrink findByPersonId(Integer personId);

    void updateMlDrink(MlDrink mlDrink);
}
