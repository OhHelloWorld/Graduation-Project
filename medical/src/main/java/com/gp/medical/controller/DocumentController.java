package com.gp.medical.controller;

import com.gp.medical.entity.Document;
import com.gp.medical.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12 0012.
 */
@RestController
@RequestMapping(path = "/api/doc")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    /**
     * 得到所有文章
     * @return
     */
    @GetMapping(path = "")
    public List<Document> allDocument(){
       return documentService.allDocument();
    }

    /**
     * 根据Id得到文章
     * @param docId
     * @return
     */
    @GetMapping(path = "/{docId}")
    public Document getDocumentById(@PathVariable Integer docId){
        return documentService.getDocumentById(docId);
    }

    /**
     * 得到所有文章（分页）
     * @param page
     * @return
     */
    @GetMapping(path = "/page")
    public List<Document> getDocByPage(@RequestParam String page){
        return documentService.getDocByPage(page);
    }

    /**
     * 得到所有文章数量
     * @return
     */
    @GetMapping(path = "/count")
    public Integer getDocCount(){
        return documentService.getDocCount();
    }

    /**
     * 判断用户是否收藏某文章
     * @param userId
     * @param docId
     * @return
     */
    @GetMapping(path = "/hasCollect")
    public Boolean getCollectStatus(@RequestHeader(value = "userId") Integer userId,@RequestParam(value = "docId") Integer docId){
        return documentService.hasCollect(userId,docId);
    }
}
