package com.gp.medical.service;

import com.gp.medical.entity.MlBiochemical;

public interface MlBiochemicalService {

    void saveBiochemical(MlBiochemical mlBiochemical);

    MlBiochemical findByPersonId(Integer personId);

    void updateMlBiochemical(MlBiochemical mlBiochemical);
}
