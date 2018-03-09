package com.gp.medical.service;

import com.gp.medical.entity.AlPerson;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface AlPersonService {

    void saveAlPerson(AlPerson alPerson,Long userId);

    List<AlPerson> mineAlPerson(Long userId);

    List<AlPerson> allAlPerson();

    AlPerson getAlPersonById(Long id);
}
