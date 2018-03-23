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

    /**
     * 转换自免肝四诊信息的内容
     * @param alFourFront
     * @return
     */
    public static AlFour switchAlFour(AlFour alFourFront){
        AlFour alFour = new AlFour();
        String angry = alFourFront.getAngry();
        String fatigue = alFourFront.getFatigue();
        String itch = alFourFront.getItch();
        String dry = alFourFront.getDry();
        String vague = alFourFront.getVague();
        String depress = alFourFront.getDepress();
        String insomnia = alFourFront.getInsomnia();
        String wake = alFourFront.getWake();
        String tinnitus = alFourFront.getTinnitus();
        String thirst = alFourFront.getThirst();

        if("1".equals(angry)){
            alFour.setAngry("无");
        }else if("2".equals(angry)){
            alFour.setAngry("偶见烦躁");
        }else if("3".equals(angry)){
            alFour.setAngry("经常烦躁不安");
        }else if("4".equals(angry)){
            alFour.setAngry("一触即怒");
        }else{
            alFour.setAngry(null);
        }

        if("1".equals(fatigue)){
            alFour.setFatigue("无");
        }else if("2".equals(fatigue)){
            alFour.setFatigue("肢体乏力，勉强维持日常生活");
        }else if("3".equals(fatigue)){
            alFour.setFatigue("肢体稍倦，可坚持轻体力工作");
        }else if("4".equals(fatigue)){
            alFour.setFatigue("全身无力，终日不愿活动");
        }else{
            alFour.setFatigue(null);
        }

        if("1".equals(itch)){
            alFour.setItch("无");
        }else if("2".equals(itch)){
            alFour.setItch("偶有，不影响日常生活");
        }else if("3".equals(itch)){
            alFour.setItch("时常有，轻度影响日常生活");
        }else if("4".equals(itch)){
            alFour.setItch("整日瘙痒，影响日常生活");
        }else{
            alFour.setItch(null);
        }

        if("1".equals(dry)){
            alFour.setDry("无");
        }else if("2".equals(dry)){
            alFour.setDry("自觉有时目干");
        }else if("3".equals(dry)){
            alFour.setDry("经常两目干涩");
        }else if("4".equals(dry)){
            alFour.setDry("整日两目干涩");
        }else{
            alFour.setDry(null);
        }

        if("1".equals(vague)){
            alFour.setVague("无");
        }else if("2".equals(vague)){
            alFour.setVague("久视后视物不清");
        }else if("3".equals(vague)){
            alFour.setVague("视物不清");
        }else if("4".equals(vague)){
            alFour.setVague("视物困难");
        }else{
            alFour.setVague(null);
        }

        if("1".equals(depress)){
            alFour.setDepress("无");
        }else if("2".equals(depress)){
            alFour.setDepress("有时情绪低落");
        }else if("3".equals(depress)){
            alFour.setDepress("经常情绪低落");
        }else if("4".equals(depress)){
            alFour.setDepress("有厌世倾向");
        }else{
            alFour.setDepress(null);
        }

        if("1".equals(angry)){
            alFour.setAngry("无");
        }else if("2".equals(angry)){
            alFour.setAngry("偶见烦躁");
        }else if("3".equals(angry)){
            alFour.setAngry("经常烦躁不安");
        }else if("4".equals(angry)){
            alFour.setAngry("一触即怒");
        }else{
            alFour.setAngry(null);
        }

        if("1".equals(insomnia)){
            alFour.setInsomnia("无");
        }else if("2".equals(insomnia)){
            alFour.setInsomnia("睡眠不足6小时");
        }else if("3".equals(insomnia)){
            alFour.setInsomnia("睡眠不足4小时");
        }else if("4".equals(insomnia)){
            alFour.setInsomnia("彻夜难眠");
        }else{
            alFour.setInsomnia(null);
        }

        if("1".equals(wake)) {
            alFour.setWake("无");
        }else if("2".equals(wake)){
            alFour.setWake("每夜眠后醒1~2次");
        }else if("3".equals(wake)){
            alFour.setWake("每夜眠后醒3~4次");
        }else if("4".equals(wake)){
            alFour.setWake("每夜醒5次以上");
        }else{
            alFour.setWake(null);
        }

        if("1".equals(tinnitus)){
            alFour.setWake("无");
        } else if ("2".equals(tinnitus)) {
            alFour.setTinnitus("偶见轻微耳鸣");
        }else if("3".equals(tinnitus)){
            alFour.setTinnitus("阵发耳鸣，休息后缓解");
        }else if("4".equals(tinnitus)){
            alFour.setTinnitus("耳鸣持续不解");
        }else{
            alFour.setTinnitus(null);
        }

        if("1".equals(thirst)){
            alFour.setThirst("无");
        }else if("2".equals(thirst)){
            alFour.setThirst("偶有或晨起口干");
        }else if("3".equals(thirst)){
            alFour.setThirst("时感口干");
        }else if("4".equals(thirst)){
            alFour.setThirst("整日口干");
        }else{
            alFour.setThirst(null);
        }
        alFour.setPersonId(alFourFront.getPersonId());
        return alFour;
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
