package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.TVNetwork;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface TVNetworkDao extends GenericDao<TVNetwork> {
    void save(TVNetwork tvNetwork) throws Exception ;
    void saveOrUpdate(TVNetwork tvNetwork) throws Exception ;
    TVNetwork findById (long tvNetworkId) throws Exception ;
    List<TVNetwork> findAll () throws Exception ;

}
