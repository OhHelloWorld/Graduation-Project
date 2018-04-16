package com.gp.medical.repository;

import com.gp.medical.entity.MlDiseaseHistory;
import org.springframework.data.repository.CrudRepository;

public interface MlDiseaseRepository extends CrudRepository<MlDiseaseHistory,Integer> {

    MlDiseaseHistory findByPersonId(Integer personId);
}
