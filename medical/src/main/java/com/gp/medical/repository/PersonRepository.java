package com.gp.medical.repository;

import com.gp.medical.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface PersonRepository extends CrudRepository<Person,Long>{

    @Query(value = "select * from person where user_id = ?1 order by id desc limit ?3 offset ?2",nativeQuery = true)
    List<Person> minePersonByPage(Long userId,int offset,int limitNum);

    @Query(value = "select * from person",nativeQuery = true)
    List<Person> allPerson();

    @Query(value = "select * from person order by id desc limit 6",nativeQuery = true)
    List<Person> latestPerson();

    @Query(value = "select * from person order by id desc limit ?1 offset ?2",nativeQuery = true)
    List<Person> getPersonByPage(int limitNum,int offset);

    @Query(value = "select * from person where user_id = ?1",nativeQuery = true)
    List<Person> getPersonByUserId(Long userId);
}
