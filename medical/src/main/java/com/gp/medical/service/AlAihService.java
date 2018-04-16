package com.gp.medical.service;

import com.gp.medical.entity.AlAih;

public interface AlAihService {

    void saveAlAih(AlAih alAih);

    AlAih findByPersonId(Integer personId);

    void updateAlAih(AlAih alAih);
}
