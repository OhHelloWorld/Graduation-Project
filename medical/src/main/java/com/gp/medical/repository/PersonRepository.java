package com.gp.medical.repository;

import com.gp.medical.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
public interface PersonRepository extends CrudRepository<Person,Integer>{

    @Query(value = "select * from person where user_id = ?1 order by id desc limit ?3 offset ?2",nativeQuery = true)
    List<Person> minePersonByPage(Integer userId, int offset, int limitNum);

    @Query(value = "select * from person",nativeQuery = true)
    List<Person> allPerson();

    @Query(value = "select * from person order by id desc limit 6",nativeQuery = true)
    List<Person> latestPerson();

    @Query(value = "select * from person order by id desc limit ?1 offset ?2",nativeQuery = true)
    List<Person> getPersonByPage(int limitNum,int offset);

    @Query(value = "select * from person where gender=?3 order by id desc limit ?1 offset ?2",nativeQuery = true)
    List<Person> getPersonByPageAndGender(int limitNun,int offset,String gender);

    @Query(value = "select * from person where age between ?3 and ?4 order by id desc limit ?1 offset ?2",nativeQuery = true)
    List<Person> getPersonByPageAndAge(int limitNum,int offset,int age1,int age2);

    @Query(value = "select * from person where gender = ?3 and age between ?4 and ?5 order by id desc limit ?1 offset ?2",nativeQuery = true)
    List<Person> getPersonByPageAndGenderAndAge(int limitNum,int offset,String gender,int age1,int age2);

    @Query(value = "select * from person where user_id = ?1",nativeQuery = true)
    List<Person> getPersonByUserId(Integer userId);

    @Query(value = "select count(*) from person where gender=?1",nativeQuery = true)
    Integer getGenderConditionPersonCount(String gender);

    @Query(value = "select count(*) from person where age between ?1 and ?2",nativeQuery = true)
    Integer getAgeConditionPersonCount(int age1,int age2);

    @Query(value = "select count(*) from person where gender = ?1 and age between ?2 and ?3",nativeQuery = true)
    Integer getGenderAndAgeConditionPersonCount(String gender,int age1,int age2);

    @Query(value = "select * from person where name like %?1%",nativeQuery = true)
    List<Person> getSearchPerson(String name);

    @Query(value = "select count(*) from person where age between 0 and 10" +
            " union all " +
            "select count(*) from person where age between 11 and 20" +
            " union all " +
            "select count(*) from person where age between 21 and 30" +
            " union all " +
            "select count(*) from person where age between 31 and 40" +
            " union all " +
            "select count(*) from person where age between 41 and 50" +
            " union all " +
            "select count(*) from person where age between 51 and 60" +
            " union all " +
            "select count(*) from person where age > 60",nativeQuery = true)
    List<BigInteger> getAgeChartData();

    @Query(value = "select count(*) from person where gender = '男'" +
            " union all " +
            "select count(*) from person where gender = '女'",nativeQuery = true)
    List<BigInteger> getGenderChartData();
}
