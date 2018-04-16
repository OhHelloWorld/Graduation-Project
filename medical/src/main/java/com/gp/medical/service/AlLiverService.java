package com.gp.medical.service;

import com.gp.medical.entity.AlLiver;

public interface AlLiverService {

    void saveAlLiver(AlLiver alLiver);

    AlLiver findByPersonId(Integer personId);

    void updateAlLiver(AlLiver alLiver);
}
