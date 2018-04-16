package com.gp.medical.tool;

import com.gp.medical.entity.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Component
public class Switch {

    /**
     * 转换entity格式使程序不会陷入死循环
     * @param personInDatabase
     * @return
     */
    public static Person switchPerson(Person personInDatabase){
        Person newPerson = new Person();
        newPerson.setName(personInDatabase.getName());
        newPerson.setId(personInDatabase.getId());
        newPerson.setAddress(personInDatabase.getAddress());
        newPerson.setAge(personInDatabase.getAge());
        newPerson.setBmi(personInDatabase.getBmi());
        newPerson.setCulture(personInDatabase.getCulture());
        newPerson.setFileName(personInDatabase.getFileName());
        newPerson.setGender(personInDatabase.getGender());
        newPerson.setHeight(personInDatabase.getHeight());
        newPerson.setNation(personInDatabase.getNation());
        newPerson.setPhone(personInDatabase.getPhone());
        newPerson.setWeight(personInDatabase.getWeight());
        return newPerson;
    }

    /**
     * 转换user使程序不会陷入死循环
     * @param userInDatabase
     * @return
     */
    public static User switchUser(User userInDatabase){
        User user = new User();
        user.setUsername(userInDatabase.getUsername());
        user.setId(userInDatabase.getId());
        return user;
    }

    public static Document switchDoc(Document document){
        Document newDocument = new Document();
        newDocument.setId(document.getId());
        newDocument.setName(document.getName());
        newDocument.setAuthor(document.getAuthor());
        newDocument.setContent(document.getContent());
        if(document.getImage() == null){
            newDocument.setImage("https://d3cbihxaqsuq0s.cloudfront.net/images/15158524_xl.jpg");
        }else{
            newDocument.setImage(document.getImage());
        }
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

    public static Comment switchComment(Comment comment){
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
