package com.gp.medical.tool;

import com.gp.medical.entity.AlFour;
import com.gp.medical.entity.Person;
import org.springframework.stereotype.Component;

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




        alFour.setPersonId(alFourFront.getPersonId());
        return alFour;
    }
}
