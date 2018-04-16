package com.gp.medical.service;

import com.gp.medical.entity.AlFinal;

public interface AlFinalService {

    void saveAlFinal(AlFinal alFinal);

    AlFinal findByPersonId(Integer personId);

    void updateAlFinal(AlFinal alFinal);
}
