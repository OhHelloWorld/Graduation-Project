package com.gp.medical.service;

import com.gp.medical.entity.Document;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
public interface DocumentService {

    /**
     * 得到所有文章
     * @return
     */
    List<Document> allDocument();

    /**
     * 根据文章Id得到文章
     * @param docId
     * @return
     */
    Document getDocumentById(Long docId);

    /**
     * 得到所有文章（分页）
     * @param page
     * @return
     */
    List<Document> getDocByPage(String page);

    /**
     * 得到所有文章数量
     * @return
     */
    Long getDocCount();

    /**
     * 判断用户是否收藏某文章
     * @param userId
     * @param docId
     * @return
     */
    Boolean hasCollect(Long userId,Long docId);
}
