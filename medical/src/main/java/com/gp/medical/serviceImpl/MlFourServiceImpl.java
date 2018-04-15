package com.gp.medical.serviceImpl;

import com.gp.medical.entity.MlFour;
import com.gp.medical.repository.MlFourRepository;
import com.gp.medical.service.MlFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlFourServiceImpl implements MlFourService {

    @Autowired
    private MlFourRepository mlFourRepository;

    @Override
    public void saveMlFour(MlFour mlFour) {

        mlFourRepository.save(mlFour);

    }
}
