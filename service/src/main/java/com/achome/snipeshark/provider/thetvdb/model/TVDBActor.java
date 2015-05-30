package com.achome.snipeshark.provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name="actor")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBActor {
    @XmlElement(name="id")
    private long id;

    @XmlElement(name="image")
    private String image;

    @XmlElement(name="name")
    private String name;

    @XmlElement(name="role")
    private String role;

    /*
    An integer from 0-3. 1 being the most important actor on the show and 3 being the third most important actor.
    0 means they have no special sort order. Duplicates of 1-3 aren't suppose to be allowed but currently are so
    the field isn't perfect but can still be used for basic sorting.
    */

    @XmlElement(name="sortorder")
    private int sortOrder;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
