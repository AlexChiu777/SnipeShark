package com.achome.snipeshark.data.entity;

import javax.persistence.*;

/**
 * Created by Alex on 5/24/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="TV_NETWORK")
public class TVNetwork extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="NETWORK_ID")
    private long networkId;

    @Column(name="NETWORK_NAME")
    private String networkName;

    public long getNetworkId() {
        return networkId;
    }

    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
