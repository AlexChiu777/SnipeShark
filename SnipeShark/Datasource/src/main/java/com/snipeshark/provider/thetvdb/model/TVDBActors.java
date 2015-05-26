package com.snipeshark.provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name = "actors")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBActors {
    @XmlElement(name = "actor")
    private List<TVDBActor> actorList;

    public List<TVDBActor> getActorList() {
        return actorList;
    }

    public void setActorList(List<TVDBActor> actorList) {
        this.actorList = actorList;
    }
}
