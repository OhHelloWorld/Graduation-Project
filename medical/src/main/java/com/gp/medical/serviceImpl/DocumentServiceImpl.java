package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Document;
import com.gp.medical.entity.User;
import com.gp.medical.repository.CommentRepository;
import com.gp.medical.repository.DocumentRepository;
import com.gp.medical.service.DocumentService;
import com.gp.medical.tool.Switch;
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
            documentList.add(Switch.switchDoc(document));
        }
        return documentList;
    }

    public Document getDocumentById(Integer docId){
        Document documentInDatabase = documentRepository.findOne(docId);
        return Switch.switchDoc(documentInDatabase);
    }

    @Override
    public List<Document> getDocByPage(String page) {
        List<Document> docInDatabase = documentRepository.getDocByPage(Integer.valueOf(page) - 1);
        List<Document> documents = new ArrayList<>();
        for(Document document : docInDatabase){
            documents.add(Switch.switchDoc(document));
        }
        return documents;
    }

    @Override
    public Integer getDocCount() {
        return Math.toIntExact(documentRepository.count());
    }

    @Override
    public Boolean hasCollect(Integer userId, Integer docId) {
        List<User> userList = documentRepository.findOne(docId).getUserList();
        List<Integer> userIdList = new ArrayList<>();
        for(User user : userList){
            userIdList.add(user.getId());
        }
        if(userIdList.contains(userId)){
            return true;
        }else{
            return false;
        }
    }

}
