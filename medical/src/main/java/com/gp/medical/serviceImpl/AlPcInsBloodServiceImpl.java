package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsBlood;
import com.gp.medical.repository.AlPcInsBloodRepository;
import com.gp.medical.service.AlPcInsBloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsBloodServiceImpl implements AlPcInsBloodService {

    @Autowired
    private AlPcInsBloodRepository alPcInsBloodRepository;

    @Override
    public void saveBlood(AlPcInsBlood alPcInsBlood) {

        alPcInsBloodRepository.save(alPcInsBlood);

    }
}
