package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlLiver;
import com.gp.medical.repository.MlLiverRepository;
import com.gp.medical.service.MlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlLiverServiceImpl implements MlLiverService {

    @Autowired
    private MlLiverRepository mlLiverRepository;

    @Override
    public void saveLiver(MlLiver mlLiver) {

        mlLiverRepository.save(mlLiver);

    }
}
