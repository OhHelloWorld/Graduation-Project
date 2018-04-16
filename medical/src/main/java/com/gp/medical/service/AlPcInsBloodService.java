package com.gp.medical.service;

import com.gp.medical.entity.AlPcInsBlood;

public interface AlPcInsBloodService {

    void saveBlood(AlPcInsBlood alPcInsBlood);

    AlPcInsBlood findByPersonId(Integer personId);

    void updateAlPcInsBlood(AlPcInsBlood alPcInsBlood);
}
