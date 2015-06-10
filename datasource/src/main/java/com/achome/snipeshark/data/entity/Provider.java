package com.achome.snipeshark.data.entity;

import javax.persistence.*;

/**
 * Created by Alex on 5/27/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="PROVIDER")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PROVIDER_ID")
    private long providerId;

    @Column(name="PROVIDER_TYPE")
    private String providerType;

    @Column(name="DESCRIPTION")
    private String description;

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
