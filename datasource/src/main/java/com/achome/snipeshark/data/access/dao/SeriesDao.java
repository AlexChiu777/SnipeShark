package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Series;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface SeriesDao extends GenericDao<Series> {
    void save(Series series) throws Exception ;
    void saveOrUpdate(Series series) throws Exception ;
    Series findById (long seriesId) throws Exception ;
    List<Series> findAll () throws Exception ;
}
