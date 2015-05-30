package com.achome.snipeshark.provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Alex on 5/24/2015.
 */
@XmlRootElement(name="mirror")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mirror {
    @XmlElement(name="id")
    private int id;

    @XmlElement(name="mirrorpath")
    private String mirrorPath;

    @XmlElement(name="typemask")
    private int typeMask;

    //typemask is the sum of the following files
    //1 xml files
    //2 banner files
    //4 zip files

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMirrorPath() {
        return mirrorPath;
    }

    public void setMirrorPath(String mirrorPath) {
        this.mirrorPath = mirrorPath;
    }

    public int getTypeMask() {
        return typeMask;
    }

    public void setTypeMask(int typeMask) {
        this.typeMask = typeMask;
    }

    @Override
    public String toString() {
        return "Mirror{" +
                "id=" + id +
                ", mirrorPath='" + mirrorPath + '\'' +
                ", typeMask=" + typeMask +
                '}';
    }
}
