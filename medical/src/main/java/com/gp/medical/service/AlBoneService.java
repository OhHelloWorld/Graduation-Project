package com.gp.medical.service;

import com.gp.medical.entity.AlBone;

public interface AlBoneService {

    void saveAlBone(AlBone alBone);

    AlBone findByPersonId(Integer personId);

    void updateAlBone(AlBone alBone);
}
