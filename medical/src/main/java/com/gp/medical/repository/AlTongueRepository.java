package com.gp.medical.repository;

import com.gp.medical.entity.AlTongue;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
public interface AlTongueRepository extends CrudRepository<AlTongue,Integer>{

    AlTongue findByPersonId(Integer personId);
}
