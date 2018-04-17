package com.gp.medical.repository;

import com.gp.medical.entity.MlAllergy;
import org.springframework.data.repository.CrudRepository;

public interface MlAllergyRepository extends CrudRepository<MlAllergy,Integer> {

    MlAllergy findByPersonId(Integer personId);

}
