package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsHepatitisB;
import com.gp.medical.repository.AlPcInsHbRepository;
import com.gp.medical.service.AlPcInsHbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsHbServiceImpl implements AlPcInsHbService {

    @Autowired
    private AlPcInsHbRepository alPcInsHbRepository;

    @Override
    public void saveHb(AlPcInsHepatitisB alPcInsHepatitisB) {
        alPcInsHbRepository.save(alPcInsHepatitisB);
    }
}
