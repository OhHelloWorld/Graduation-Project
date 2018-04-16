package com.gp.medical.service;

import com.gp.medical.entity.AlPcInsKidney;

public interface AlPcInsKidneyService {

    void saveKidney(AlPcInsKidney alPcInsKidney);

    AlPcInsKidney findByPersonId(Integer personId);

    void updateAlPcInsKidney(AlPcInsKidney alPcInsKidney);
}
