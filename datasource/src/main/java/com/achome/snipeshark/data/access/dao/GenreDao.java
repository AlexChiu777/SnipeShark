package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Genre;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface GenreDao extends GenericDao<Genre> {
    void save(Genre genre) throws Exception ;
    void saveOrUpdate(Genre genre) throws Exception ;
    Genre findById (long genreId) throws Exception ;
    List<Genre> findAll () throws Exception ;

}
