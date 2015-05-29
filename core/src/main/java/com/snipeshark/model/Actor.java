package com.snipeshark.model;

/**
 * Created by Alex on 5/27/2015.
 */
public class Actor {
    private long actorId;
    private String actorName;
    private Provider provider;

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
