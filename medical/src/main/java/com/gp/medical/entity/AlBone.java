package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "al_bone")
public class AlBone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String lv;
    private String lvT;
    private String fn;
    private String fnT;
    private String br;
    private String brT;
    private String th;
    private String thT;
    private String diagnosis;

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

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getLvT() {
        return lvT;
    }

    public void setLvT(String lvT) {
        this.lvT = lvT;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getFnT() {
        return fnT;
    }

    public void setFnT(String fnT) {
        this.fnT = fnT;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getBrT() {
        return brT;
    }

    public void setBrT(String brT) {
        this.brT = brT;
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    public String getThT() {
        return thT;
    }

    public void setThT(String thT) {
        this.thT = thT;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
