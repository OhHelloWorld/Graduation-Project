package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ml_biochemical")
public class MlBiochemical {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String alt;
    private String ast;
    private String ggt;
    private String alp;
    private String acid;
    private String tbil;
    private String dbil;
    private String tp;
    private String alb;
    private String scr;
    private String un;
    private String fbg;
    private String pt;
    private String inr;
    private String afp;

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

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAst() {
        return ast;
    }

    public void setAst(String ast) {
        this.ast = ast;
    }

    public String getGgt() {
        return ggt;
    }

    public void setGgt(String ggt) {
        this.ggt = ggt;
    }

    public String getAlp() {
        return alp;
    }

    public void setAlp(String alp) {
        this.alp = alp;
    }

    public String getAcid() {
        return acid;
    }

    public void setAcid(String acid) {
        this.acid = acid;
    }

    public String getTbil() {
        return tbil;
    }

    public void setTbil(String tbil) {
        this.tbil = tbil;
    }

    public String getDbil() {
        return dbil;
    }

    public void setDbil(String dbil) {
        this.dbil = dbil;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getAlb() {
        return alb;
    }

    public void setAlb(String alb) {
        this.alb = alb;
    }

    public String getScr() {
        return scr;
    }

    public void setScr(String scr) {
        this.scr = scr;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getFbg() {
        return fbg;
    }

    public void setFbg(String fbg) {
        this.fbg = fbg;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getInr() {
        return inr;
    }

    public void setInr(String inr) {
        this.inr = inr;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }
}
