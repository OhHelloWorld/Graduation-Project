package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlBiochemical;
import com.gp.medical.repository.MlBiochemicalRepository;
import com.gp.medical.service.MlBiochemicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlBiochemicalServiceImpl implements MlBiochemicalService {

    @Autowired
    private MlBiochemicalRepository mlBiochemicalRepository;

    @Override
    public void saveBiochemical(MlBiochemical mlBiochemical) {

        mlBiochemicalRepository.save(mlBiochemical);

    }
}
