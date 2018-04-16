package com.gp.medical.repository;

import com.gp.medical.entity.AlPcInsKidney;
import org.springframework.data.repository.CrudRepository;

public interface AlPcInsKidneyRepository extends CrudRepository<AlPcInsKidney,Integer> {

    AlPcInsKidney findByPersonId(Integer personId);
}
