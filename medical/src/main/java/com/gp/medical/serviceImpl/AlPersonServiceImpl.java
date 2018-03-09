package com.gp.medical.serviceImpl;

import com.gp.medical.entity.AlPerson;
import com.gp.medical.repository.AlPersonRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.AlPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
@Service
public class AlPersonServiceImpl implements AlPersonService{

    @Autowired
    private AlPersonRepository alPersonRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveAlPerson(AlPerson alPerson,Long userId) {
        alPerson.setUser(userRepository.findOne(userId));
        alPersonRepository.save(alPerson);
    }

    @Override
    public List<AlPerson> mineAlPerson(Long userId) {
        return alPersonRepository.mineAlPerson(userId);
    }

    @Override
    public List<AlPerson> allAlPerson() {
        List<AlPerson> alPersonList = new ArrayList<>();
        for(AlPerson alPerson : alPersonRepository.allAlPerson()){
            alPersonList.add(switchAlPerson(alPerson));
        }
        return alPersonList;
    }

    @Override
    public AlPerson getAlPersonById(Long id) {
        return switchAlPerson(alPersonRepository.findOne(id));
    }

    /**
     * 转换entity格式使程序不会陷入死循环
     * @param AlPersonInDatabase
     * @return
     */
    private AlPerson switchAlPerson(AlPerson AlPersonInDatabase){
        AlPerson newAlPerson = new AlPerson();
        newAlPerson.setName(AlPersonInDatabase.getName());
        newAlPerson.setId(AlPersonInDatabase.getId());
        return newAlPerson;
    }

}
