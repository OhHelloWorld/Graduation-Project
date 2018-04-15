package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlBone;
import com.gp.medical.repository.AlBoneRepository;
import com.gp.medical.service.AlBoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlBoneServiceImpl implements AlBoneService {

    @Autowired
    private AlBoneRepository alBoneRepository;

    @Override
    public void saveAlBone(AlBone alBone) {
        alBoneRepository.save(alBone);
    }
}
