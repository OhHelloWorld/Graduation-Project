package com.gp.medical.service;

import com.gp.medical.entity.MlBlood;

public interface MlBloodService {

    void saveBlood(MlBlood mlBlood);

    MlBlood findByPersonId(Integer personId);

    void updateMlBlood(MlBlood mlBlood);
}
