package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.SeriesDao;
import com.achome.snipeshark.data.entity.Series;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class SeriesDaoImpl extends GenericDaoImpl<Series> implements SeriesDao {
    public SeriesDaoImpl () {
        super(Series.class);
    }

    public void save(Series series) throws Exception {
        super.save(series);
    }


    public void saveOrUpdate(Series series) throws Exception {
        super.saveOrUpdate(series);
    }


    public void delete(Series series) throws Exception {
        super.delete(series);
    }


    public Series findById(long seriesId) throws Exception {
        return super.findById(seriesId);
    }


    public List<Series> findAll() throws Exception {
        return super.findAll();
    }
}