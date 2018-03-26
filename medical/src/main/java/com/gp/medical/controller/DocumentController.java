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
     * 得到所有病例
     * @return
     */
    @GetMapping(path = "")
    public List<Document> allDocument(){
       return documentService.allDocument();
    }

    /**
     * 根据Id得到病例
     * @param docId
     * @return
     */
    @GetMapping(path = "/{docId}")
    public Document getDocumentById(@PathVariable Long docId){
        return documentService.getDocumentById(docId);
    }

    /**
     * 得到所有病例（分页）
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
    public Long getDocCount(){
        return documentService.getDocCount();
    }

    /**
     * 判断用户是否收藏某文章
     * @param userId
     * @param docId
     * @return
     */
    @GetMapping(path = "/hasCollect")
    public Boolean getCollectStatus(@RequestHeader(value = "userId") Long userId,@RequestParam(value = "docId") Long docId){
        return documentService.hasCollect(userId,docId);
    }
}
