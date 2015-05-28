package com.snipeshark.entity;

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
    private int providerId;

    @Column(name="PROVIDER_TYPE")
    private String providerType;

    @Column(name="DESCRIPTION")
    private String description;

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
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
