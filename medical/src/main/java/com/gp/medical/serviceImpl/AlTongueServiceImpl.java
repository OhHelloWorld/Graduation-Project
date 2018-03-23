package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlTongue;
import com.gp.medical.repository.AlTongueRepository;
import com.gp.medical.service.AlTongueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
@Service
public class AlTongueServiceImpl implements AlTongueService{

    @Autowired
    private AlTongueRepository alTongueRepository;

    @Override
    public void saveTongue(AlTongue tongue) {
        alTongueRepository.save(tongue);
    }
}
