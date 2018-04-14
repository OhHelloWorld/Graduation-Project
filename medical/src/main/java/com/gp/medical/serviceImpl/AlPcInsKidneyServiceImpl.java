package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsKidney;
import com.gp.medical.repository.AlPcInsKidneyRepository;
import com.gp.medical.service.AlPcInsKidneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsKidneyServiceImpl implements AlPcInsKidneyService {

    @Autowired
    private AlPcInsKidneyRepository alPcInsKidneyRepository;

    @Override
    public void saveKidney(AlPcInsKidney alPcInsKidney) {

        alPcInsKidneyRepository.save(alPcInsKidney);

    }
}
