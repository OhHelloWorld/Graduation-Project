package com.gp.medical.service;

import com.gp.medical.entity.MlLiver;

public interface MlLiverService {

    void saveLiver(MlLiver mlLiver);

    MlLiver findByPersonId(Integer personId);

    void updateMlLiver(MlLiver mlLiver);
}
