package com.gp.medical.entity;

/**
 * 用于接收从前端传来的数据以及传递数据给前端
 * Created by Administrator on 2018/3/20 0020.
 */
public class CommentDTO {

    //评论的文章Id
    private Long docId;
    //评论的用户Id
    private Long userId;
    //评论的内容
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
