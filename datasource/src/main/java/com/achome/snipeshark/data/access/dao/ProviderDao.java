package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Provider;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface ProviderDao extends GenericDao<Provider> {
    void save(Provider provider) throws Exception ;
    void saveOrUpdate(Provider provider) throws Exception ;
    Provider findById (long providerId) throws Exception ;
    List<Provider> findAll () throws Exception ;
}
