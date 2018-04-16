package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Comment;
import com.gp.medical.repository.CommentRepository;
import com.gp.medical.repository.DocumentRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public void saveComment(Comment comment,Integer userId,Integer docId) {
        comment.setUser(userRepository.findOne(userId));
        comment.setTime(new Date());
        comment.setDocument(documentRepository.findOne(docId));
        commentRepository.save(comment);
    }
}
