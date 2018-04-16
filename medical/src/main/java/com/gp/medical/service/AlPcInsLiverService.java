package com.gp.medical.service;

import com.gp.medical.entity.AlPcInsLiver;

public interface AlPcInsLiverService {

    void saveLiver(AlPcInsLiver alPcInsLiver);

    AlPcInsLiver findByPersonId(Integer personId);

    void updateAlPcInsLiver(AlPcInsLiver alPcInsLiver);
}
