package com.snipeshark.provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name="language")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBLanguage {
    @XmlElement(name="name")
    private String name;

    @XmlElement(name="abbreviation")
    private String abbreviation;

    @XmlElement(name="id")
    private int id;

}
