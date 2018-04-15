package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlBlood;
import com.gp.medical.repository.MlBloodRepository;
import com.gp.medical.service.MlBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlBloodServiceImpl implements MlBloodService {

    @Autowired
    private MlBloodRepository mlBloodRepository;

    @Override
    public void saveBlood(MlBlood mlBlood) {
        mlBloodRepository.save(mlBlood);
    }
}
