package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "al_pc_ins_liver")
public class AlPcInsLiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private String albumin;
    private String globulin;
    private String alt;
    private String ast;
    private String ggt;
    private String alp;

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

    public String getAlbumin() {
        return albumin;
    }

    public void setAlbumin(String albumin) {
        this.albumin = albumin;
    }

    public String getGlobulin() {
        return globulin;
    }

    public void setGlobulin(String globulin) {
        this.globulin = globulin;
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
}
