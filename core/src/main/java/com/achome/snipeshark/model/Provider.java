package com.achome.snipeshark.model;

/**
 * Created by Alex on 5/27/2015.
 */
public class Provider {
    private int providerTypeId;
    private long providerId;

    public int getProviderTypeId() {
        return providerTypeId;
    }

    public void setProviderTypeId(int providerTypeId) {
        this.providerTypeId = providerTypeId;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }
}
