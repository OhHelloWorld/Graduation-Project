package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Entity(name = "al_four")
public class AlFour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer personId;
    private String fatigue;
    private String itch;
    private String dry;
    private String vague;
    private String depress;
    private String angry;
    private String insomnia;
    private String wake;
    private String tinnitus;
    private String thirst;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFatigue() {
        return fatigue;
    }

    public void setFatigue(String fatigue) {
        this.fatigue = fatigue;
    }

    public String getItch() {
        return itch;
    }

    public void setItch(String itch) {
        this.itch = itch;
    }

    public String getDry() {
        return dry;
    }

    public void setDry(String dry) {
        this.dry = dry;
    }

    public String getVague() {
        return vague;
    }

    public void setVague(String vague) {
        this.vague = vague;
    }

    public String getDepress() {
        return depress;
    }

    public void setDepress(String depress) {
        this.depress = depress;
    }

    public String getAngry() {
        return angry;
    }

    public void setAngry(String angry) {
        this.angry = angry;
    }

    public String getInsomnia() {
        return insomnia;
    }

    public void setInsomnia(String insomnia) {
        this.insomnia = insomnia;
    }

    public String getWake() {
        return wake;
    }

    public void setWake(String wake) {
        this.wake = wake;
    }

    public String getTinnitus() {
        return tinnitus;
    }

    public void setTinnitus(String tinnitus) {
        this.tinnitus = tinnitus;
    }

    public String getThirst() {
        return thirst;
    }

    public void setThirst(String thirst) {
        this.thirst = thirst;
    }
}
