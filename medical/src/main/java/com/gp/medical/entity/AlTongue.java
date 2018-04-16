package com.gp.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
@Entity(name = "al_tongue")
public class AlTongue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer personId;
    private String tongueQuality;
    private String tongueBody;
    private String mossyQuality;
    private String mossyColor;
    private String varice;
    private String tongueLeft;
    private String tongueRight;

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

    public String getTongueQuality() {
        return tongueQuality;
    }

    public void setTongueQuality(String tongueQuality) {
        this.tongueQuality = tongueQuality;
    }

    public String getTongueBody() {
        return tongueBody;
    }

    public void setTongueBody(String tongueBody) {
        this.tongueBody = tongueBody;
    }

    public String getMossyQuality() {
        return mossyQuality;
    }

    public void setMossyQuality(String mossyQuality) {
        this.mossyQuality = mossyQuality;
    }

    public String getMossyColor() {
        return mossyColor;
    }

    public void setMossyColor(String mossyColor) {
        this.mossyColor = mossyColor;
    }

    public String getVarice() {
        return varice;
    }

    public void setVarice(String varice) {
        this.varice = varice;
    }

    public String getTongueLeft() {
        return tongueLeft;
    }

    public void setTongueLeft(String tongueLeft) {
        this.tongueLeft = tongueLeft;
    }

    public String getTongueRight() {
        return tongueRight;
    }

    public void setTongueRight(String tongueRight) {
        this.tongueRight = tongueRight;
    }
}
