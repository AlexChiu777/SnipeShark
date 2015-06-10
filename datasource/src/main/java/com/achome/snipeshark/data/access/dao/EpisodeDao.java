package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Episode;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface EpisodeDao extends GenericDao<Episode> {
    void save(Episode episode) throws Exception ;
    void saveOrUpdate(Episode episode) throws Exception ;
    Episode findById (long episodeId) throws Exception ;
    List<Episode> findAll () throws Exception ;
}
