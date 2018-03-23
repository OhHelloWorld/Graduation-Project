package com.gp.medical.entity;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public class CommentDTO {

    private Long docId;
    private Long userId;
    private String content;

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
