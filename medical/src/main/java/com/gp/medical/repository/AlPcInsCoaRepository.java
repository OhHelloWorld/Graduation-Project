package com.gp.medical.repository;

import com.gp.medical.entity.AlPcInsCoagulation;
import org.springframework.data.repository.CrudRepository;

public interface AlPcInsCoaRepository extends CrudRepository<AlPcInsCoagulation,Integer> {

    AlPcInsCoagulation findByPersonId(Integer personId);
}
