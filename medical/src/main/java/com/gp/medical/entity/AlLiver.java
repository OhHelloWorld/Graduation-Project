package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "al_liver")
public class AlLiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String li;
    private String ih;
    private String pi1;
    private String pi2;
    private String rc;
    private String hbsAg;
    private String hbcAg;
    private String hcv;

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

    public String getLi() {
        return li;
    }

    public void setLi(String li) {
        this.li = li;
    }

    public String getIh() {
        return ih;
    }

    public void setIh(String ih) {
        this.ih = ih;
    }

    public String getPi1() {
        return pi1;
    }

    public void setPi1(String pi1) {
        this.pi1 = pi1;
    }

    public String getPi2() {
        return pi2;
    }

    public void setPi2(String pi2) {
        this.pi2 = pi2;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getHbsAg() {
        return hbsAg;
    }

    public void setHbsAg(String hbsAg) {
        this.hbsAg = hbsAg;
    }

    public String getHbcAg() {
        return hbcAg;
    }

    public void setHbcAg(String hbcAg) {
        this.hbcAg = hbcAg;
    }

    public String getHcv() {
        return hcv;
    }

    public void setHcv(String hcv) {
        this.hcv = hcv;
    }
}
