package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Comment;
import com.gp.medical.entity.Document;
import com.gp.medical.entity.User;
import com.gp.medical.repository.CommentRepository;
import com.gp.medical.repository.DocumentRepository;
import com.gp.medical.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
@Service
public class DocumentServiceImpl implements DocumentService{

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Document> allDocument() {
        List<Document> documentList = new ArrayList<>();
        for(Document document : documentRepository.findAll()){
            Document newDocument = new Document();
            newDocument.setId(document.getId());
            newDocument.setName(document.getName());
            newDocument.setAuthor(document.getAuthor());
            documentList.add(newDocument);
        }
        return documentList;
    }

    public Document getDocumentById(Long docId){
        Document documentInDatabase = documentRepository.findOne(docId);
        return switchDoc(documentInDatabase);
    }

    private Document switchDoc(Document document){
        Document newDocument = new Document();
        newDocument.setId(document.getId());
        newDocument.setName(document.getName());
        newDocument.setAuthor(document.getAuthor());
        newDocument.setContent(document.getContent());
        newDocument.setImage(document.getImage());
        newDocument.setSource(document.getSource());
        List<Comment> newComments = new ArrayList<>();
        List<Comment> commentsInDatabase = document.getComments();
        if(!commentsInDatabase.isEmpty()) {
            for (Comment comment : commentsInDatabase) {
                newComments.add(switchComment(comment));
            }
        }
        newDocument.setComments(newComments);
        return newDocument;
    }

    private Comment switchComment(Comment comment){
        Comment newComment = new Comment();
        newComment.setContent(comment.getContent());
        newComment.setId(comment.getId());
        newComment.setTime(comment.getTime());
        User user = new User();
        user.setUsername(comment.getUser().getUsername());
        newComment.setUser(user);
        return newComment;
    }

}
