package com.snipeshark.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Alex on 5/27/2015.
 */

@MappedSuperclass
public class BaseModel {
    @Column(name="PROVIDER_ID")
    private long providerId;

    @Column(name="PROVIDER")
    private String provider;

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
