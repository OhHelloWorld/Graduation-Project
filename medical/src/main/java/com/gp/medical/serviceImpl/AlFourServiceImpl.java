package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlFour;
import com.gp.medical.repository.AlFourRepository;
import com.gp.medical.service.AlFourService;
import com.gp.medical.tool.Switch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Service
public class AlFourServiceImpl implements AlFourService{

    @Autowired
    private AlFourRepository alFourRepository;

    @Override
    public void saveAlFour(AlFour alFour) {
        alFourRepository.save(Switch.switchAlFour(alFour));
    }
}
