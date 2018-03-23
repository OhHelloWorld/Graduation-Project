package com.gp.medical.service;

import com.gp.medical.entity.Comment;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public interface CommentService {

    void saveComment(Comment comment,Long userId,Long docId);
}
