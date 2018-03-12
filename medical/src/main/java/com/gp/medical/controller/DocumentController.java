package com.gp.medical.controller;

import com.gp.medical.entity.Document;
import com.gp.medical.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
@RestController
@RequestMapping(path = "/api/doc")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping(path = "")
    public List<Document> allDocument(){
       return documentService.allDocument();
    }

    @GetMapping(path = "/{docId}")
    public Document getDocumentById(@PathVariable Long docId){
        return documentService.getDocumentById(docId);
    }
}
