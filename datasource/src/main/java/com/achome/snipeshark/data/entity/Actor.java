package com.achome.snipeshark.data.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Alex on 5/24/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="ACTOR")
public class Actor extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ACTOR_ID")
    private long actorID;

    @Column(name="ACTOR_NAME")
    private String actorName;

    @ManyToMany(mappedBy = "actorList")
    private List<Episode> episodeList;

    public long getActorID() {
        return actorID;
    }

    public void setActorID(long actorID) {
        this.actorID = actorID;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
