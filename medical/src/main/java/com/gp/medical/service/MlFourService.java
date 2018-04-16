package com.gp.medical.service;

import com.gp.medical.entity.MlFour;

public interface MlFourService {

    void saveMlFour(MlFour mlFour);

    MlFour findByPersonId(Integer personId);

    void updateMlFour(MlFour mlFour);
}
