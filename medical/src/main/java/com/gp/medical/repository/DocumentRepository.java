package com.gp.medical.repository;

import com.gp.medical.entity.Document;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
public interface DocumentRepository extends CrudRepository<Document,Integer>{

    @Query(value = "select * from document order by id desc limit 24 offset ?1",nativeQuery = true)
    List<Document> getDocByPage(int offset);
}
