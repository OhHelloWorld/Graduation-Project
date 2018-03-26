package com.gp.medical.service;

import com.gp.medical.entity.Document;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
public interface DocumentService {

    List<Document> allDocument();

    Document getDocumentById(Long docId);

    List<Document> getDocByPage(String page);

    Long getDocCount();

    Boolean hasCollect(Long userId,Long docId);
}
