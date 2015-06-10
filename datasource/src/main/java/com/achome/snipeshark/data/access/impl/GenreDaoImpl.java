package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.GenreDao;
import com.achome.snipeshark.data.entity.Genre;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class GenreDaoImpl extends GenericDaoImpl<Genre> implements GenreDao {
    public GenreDaoImpl() {
        super(Genre.class);
    }

    public void save(Genre genre) throws Exception {
        super.save(genre);
    }


    public void saveOrUpdate(Genre genre) throws Exception {
        super.saveOrUpdate(genre);
    }


    public void delete(Genre genre) throws Exception {
        super.delete(genre);
    }


    public Genre findById(long genreId) throws Exception {
        return (Genre) super.findById(genreId);
    }


    public List<Genre> findAll() throws Exception {
        return super.findAll();
    }
}