package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "al_pc_ins_blood")
public class AlPcInsBlood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String rbc;
    private String hb;
    private String wbc;
    private String neutrophil;
    private String lymphocyte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getRbc() {
        return rbc;
    }

    public void setRbc(String rbc) {
        this.rbc = rbc;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getWbc() {
        return wbc;
    }

    public void setWbc(String wbc) {
        this.wbc = wbc;
    }

    public String getNeutrophil() {
        return neutrophil;
    }

    public void setNeutrophil(String neutrophil) {
        this.neutrophil = neutrophil;
    }

    public String getLymphocyte() {
        return lymphocyte;
    }

    public void setLymphocyte(String lymphocyte) {
        this.lymphocyte = lymphocyte;
    }
}
