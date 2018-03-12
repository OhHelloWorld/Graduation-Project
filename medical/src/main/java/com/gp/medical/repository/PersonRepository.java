package com.gp.medical.repository;

import com.gp.medical.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface PersonRepository extends CrudRepository<Person,Long>{

    @Query(value = "select * from person where user_id = ?1",nativeQuery = true)
    List<Person> minePerson(Long userId);

    @Query(value = "select * from person",nativeQuery = true)
    List<Person> allPerson();

}
