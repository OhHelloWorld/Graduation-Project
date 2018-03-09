package com.gp.medical.repository;

import com.gp.medical.entity.AlPerson;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface AlPersonRepository extends CrudRepository<AlPerson,Long>{

    @Query(value = "select * from al_person where user_id = ?1",nativeQuery = true)
    List<AlPerson> mineAlPerson(Long userId);

    @Query(value = "select * from al_person",nativeQuery = true)
    List<AlPerson> allAlPerson();

}
