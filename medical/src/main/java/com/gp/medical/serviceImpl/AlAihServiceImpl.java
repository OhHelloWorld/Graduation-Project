package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlAih;
import com.gp.medical.repository.AlAihRepository;
import com.gp.medical.service.AlAihService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlAihServiceImpl implements AlAihService {

    @Autowired
    private AlAihRepository alAihRepository;

    @Override
    public void saveAlAih(AlAih alAih) {
        alAihRepository.save(alAih);
    }
}
