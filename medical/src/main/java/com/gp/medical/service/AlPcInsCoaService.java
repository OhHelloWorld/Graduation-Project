package com.gp.medical.service;

import com.gp.medical.entity.AlPcInsCoagulation;

public interface AlPcInsCoaService {

    void saveCoa(AlPcInsCoagulation alPcInsCoagulation);

    AlPcInsCoagulation findByPersonId(Integer personId);

    void updateAlPcInsCoa(AlPcInsCoagulation alPcInsCoagulation);
}
