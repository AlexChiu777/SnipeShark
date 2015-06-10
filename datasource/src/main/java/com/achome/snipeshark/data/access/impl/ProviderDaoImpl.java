package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.ProviderDao;
import com.achome.snipeshark.data.entity.Provider;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class ProviderDaoImpl extends GenericDaoImpl<Provider> implements ProviderDao {
        public ProviderDaoImpl () {
            super(Provider.class);
        }

        public void save(Provider provider) throws Exception {
            super.save(provider);
        }


        public void saveOrUpdate(Provider provider) throws Exception {
            super.saveOrUpdate(provider);
        }


        public void delete(Provider provider) throws Exception {
            super.delete(provider);
        }


        public Provider findById(long providerId) throws Exception {
            return super.findById(providerId);
        }


        public List<Provider> findAll() throws Exception {
            return super.findAll();
        }
}
