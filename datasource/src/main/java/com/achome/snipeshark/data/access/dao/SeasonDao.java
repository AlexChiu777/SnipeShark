package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Season;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface SeasonDao extends GenericDao<Season> {
    void save(Season season) throws Exception ;
    void saveOrUpdate(Season season) throws Exception ;
    Season findById (long seasonId) throws Exception ;
    List<Season> findAll () throws Exception ;
}
