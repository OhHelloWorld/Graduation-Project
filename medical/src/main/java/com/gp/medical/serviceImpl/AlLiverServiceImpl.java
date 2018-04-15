package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlLiver;
import com.gp.medical.repository.AlLiverRepository;
import com.gp.medical.service.AlLiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlLiverServiceImpl implements AlLiverService {

    @Autowired
    private AlLiverRepository alLiverRepository;

    @Override
    public void saveAlLiver(AlLiver alLiver) {

        alLiverRepository.save(alLiver);

    }
}
