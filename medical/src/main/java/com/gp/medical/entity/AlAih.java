package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "al_aih")
public class AlAih {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String anasma1;
    private String anasma2;
    private String antiLkm;
    private String antiSla;
    private String igg;
    private String liverHistology;
    private String excludeViralHepatitis;

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

    public String getAnasma1() {
        return anasma1;
    }

    public void setAnasma1(String anasma1) {
        this.anasma1 = anasma1;
    }

    public String getAnasma2() {
        return anasma2;
    }

    public void setAnasma2(String anasma2) {
        this.anasma2 = anasma2;
    }

    public String getAntiLkm() {
        return antiLkm;
    }

    public void setAntiLkm(String antiLkm) {
        this.antiLkm = antiLkm;
    }

    public String getAntiSla() {
        return antiSla;
    }

    public void setAntiSla(String antiSla) {
        this.antiSla = antiSla;
    }

    public String getIgg() {
        return igg;
    }

    public void setIgg(String igg) {
        this.igg = igg;
    }

    public String getLiverHistology() {
        return liverHistology;
    }

    public void setLiverHistology(String liverHistology) {
        this.liverHistology = liverHistology;
    }

    public String getExcludeViralHepatitis() {
        return excludeViralHepatitis;
    }

    public void setExcludeViralHepatitis(String excludeViralHepatitis) {
        this.excludeViralHepatitis = excludeViralHepatitis;
    }
}
