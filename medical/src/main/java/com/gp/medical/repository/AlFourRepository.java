package com.gp.medical.repository;

import com.gp.medical.entity.AlFour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
public interface AlFourRepository extends CrudRepository<AlFour,Integer>{

    AlFour findByPersonId(Integer personId);
}
