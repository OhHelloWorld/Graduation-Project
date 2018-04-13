package com.gp.medical.controller;

import com.gp.medical.entity.Comment;
import com.gp.medical.entity.CommentDTO;
import com.gp.medical.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@RestController
@RequestMapping(path = "/api/com")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 保存评论信息
     * @param commentDTO
     */
    @PostMapping(path = "")
    public void saveComment(@RequestBody CommentDTO commentDTO){
        Comment comment = new Comment();
        comment.setContent(commentDTO.getContent());
        commentService.saveComment(comment, commentDTO.getUserId(), commentDTO.getDocId());
    }
}
