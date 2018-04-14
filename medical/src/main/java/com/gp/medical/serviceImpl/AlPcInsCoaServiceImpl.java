package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPcInsCoagulation;
import com.gp.medical.repository.AlPcInsCoaRepository;
import com.gp.medical.service.AlPcInsCoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlPcInsCoaServiceImpl implements AlPcInsCoaService {

    @Autowired
    private AlPcInsCoaRepository alPcInsCoaRepository;

    @Override
    public void saveCoa(AlPcInsCoagulation alPcInsCoagulation) {
        alPcInsCoaRepository.save(alPcInsCoagulation);
    }
}
