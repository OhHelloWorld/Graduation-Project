package com.gp.medical.repository;

import com.gp.medical.entity.AlPcInsHepatitisB;
import org.springframework.data.repository.CrudRepository;

public interface AlPcInsHbRepository extends CrudRepository<AlPcInsHepatitisB,Integer> {

    AlPcInsHepatitisB findByPersonId(Integer personId);

}

