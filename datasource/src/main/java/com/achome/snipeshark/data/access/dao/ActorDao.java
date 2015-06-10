package com.achome.snipeshark.data.access.dao;


import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Actor;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface ActorDao extends GenericDao <Actor> {
    void save(Actor actor) throws Exception ;
    void saveOrUpdate(Actor actor) throws Exception ;
    Actor findById (long actorId) throws Exception ;
    List<Actor> findAll () throws Exception ;
}
