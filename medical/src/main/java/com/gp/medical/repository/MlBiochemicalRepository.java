package com.gp.medical.repository;

import com.gp.medical.entity.MlBiochemical;
import org.springframework.data.repository.CrudRepository;

public interface MlBiochemicalRepository extends CrudRepository<MlBiochemical,Integer> {

    MlBiochemical findByPersonId(Integer personId);
}
