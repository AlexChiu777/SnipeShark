package com.snipeshark.entity;

import javax.persistence.*;

/**
 * Created by Alex on 5/24/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="TV_NETWORK")
public class TVNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="NETWORK_ID")
    private int networkId;

    @Column(name="NETWORK_NAME")
    private String networkName;

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
