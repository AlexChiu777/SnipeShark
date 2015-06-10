package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.EpisodeDao;
import com.achome.snipeshark.data.entity.Episode;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class EpisodeDaoImpl extends GenericDaoImpl<Episode> implements EpisodeDao {
    public EpisodeDaoImpl() {
        super(Episode.class);
    }

    public void save(Episode episode) throws Exception {
        super.save(episode);
    }


    public void saveOrUpdate(Episode episode) throws Exception {
        super.saveOrUpdate(episode);
    }


    public void delete(Episode episode) throws Exception {
        super.delete(episode);
    }


    public Episode findById(long episodeId) throws Exception {
        return (Episode) super.findById(episodeId);
    }


    public List<Episode> findAll() throws Exception {
        return super.findAll();
    }
}
