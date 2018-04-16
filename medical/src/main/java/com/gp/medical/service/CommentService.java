package com.gp.medical.service;

import com.gp.medical.entity.Comment;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public interface CommentService {

    /**
     * 存储评论信息
     * @param comment
     * @param userId
     * @param docId
     */
    void saveComment(Comment comment,Integer userId,Integer docId);
}
