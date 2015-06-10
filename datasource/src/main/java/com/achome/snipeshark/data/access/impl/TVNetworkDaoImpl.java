package com.achome.snipeshark.data.access.impl;



import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.TVNetworkDao;
import com.achome.snipeshark.data.entity.TVNetwork;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class TVNetworkDaoImpl extends GenericDaoImpl<TVNetwork> implements TVNetworkDao {
    public TVNetworkDaoImpl() {
        super(TVNetwork.class);
    }

    public void save(TVNetwork tvNetwork) throws Exception {
        super.save(tvNetwork);
    }


    public void saveOrUpdate(TVNetwork tvNetwork) throws Exception {
        super.saveOrUpdate(tvNetwork);
    }


    public void delete(TVNetwork tvNetwork) throws Exception {
        super.delete(tvNetwork);
    }


    public TVNetwork findById(long networkId) throws Exception {
        return super.findById(networkId);
    }


    public List<TVNetwork> findAll() throws Exception {
        return super.findAll();
    }
}
