package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.SeasonDao;
import com.achome.snipeshark.data.entity.Season;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class SeasonDaoImpl extends GenericDaoImpl<Season> implements SeasonDao {
    public SeasonDaoImpl () {
        super(Season.class);
    }

    public void save(Season season) throws Exception {
        super.save(season);
    }


    public void saveOrUpdate(Season season) throws Exception {
        super.saveOrUpdate(season);
    }


    public void delete(Season Season) throws Exception {
        super.delete(Season);
    }


    public Season findById(long seasonId) throws Exception {
        return super.findById(seasonId);
    }


    public List<Season> findAll() throws Exception {
        return super.findAll();
    }
}