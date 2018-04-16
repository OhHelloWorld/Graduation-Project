package com.gp.medical.service;

import com.gp.medical.entity.AlPcInsHepatitisB;

public interface AlPcInsHbService {

    void saveHb(AlPcInsHepatitisB alPcInsHepatitisB);

    AlPcInsHepatitisB findByPersonId(Integer personId);

    void updateAlPcInsHb(AlPcInsHepatitisB alPcInsHepatitisB);
}
