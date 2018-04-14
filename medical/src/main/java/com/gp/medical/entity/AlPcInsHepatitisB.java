package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "al_pc_ins_hepatitis_b")
public class AlPcInsHepatitisB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String hbsAg;
    private String hbsAb;
    private String hbeAg;
    private String hbeAb;
    private String hbcAb;
    private String hbvRna;

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

    public String getHbsAg() {
        return hbsAg;
    }

    public void setHbsAg(String hbsAg) {
        this.hbsAg = hbsAg;
    }

    public String getHbsAb() {
        return hbsAb;
    }

    public void setHbsAb(String hbsAb) {
        this.hbsAb = hbsAb;
    }

    public String getHbeAg() {
        return hbeAg;
    }

    public void setHbeAg(String hbeAg) {
        this.hbeAg = hbeAg;
    }

    public String getHbeAb() {
        return hbeAb;
    }

    public void setHbeAb(String hbeAb) {
        this.hbeAb = hbeAb;
    }

    public String getHbcAb() {
        return hbcAb;
    }

    public void setHbcAb(String hbcAb) {
        this.hbcAb = hbcAb;
    }

    public String getHbvRna() {
        return hbvRna;
    }

    public void setHbvRna(String hbvRna) {
        this.hbvRna = hbvRna;
    }
}
