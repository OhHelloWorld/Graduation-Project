package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsLiver;
import com.gp.medical.repository.AlPcInsLiverRepository;
import com.gp.medical.service.AlPcInsLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsLiverServiceImpl implements AlPcInsLiverService {

    @Autowired
    private AlPcInsLiverRepository alPcInsLiverRepository;

    @Override
    public void saveLiver(AlPcInsLiver alPcInsLiver) {

        alPcInsLiverRepository.save(alPcInsLiver);

    }
}
