package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.ActorDao;
import com.achome.snipeshark.data.entity.Actor;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class ActorDaoImpl extends GenericDaoImpl<Actor> implements ActorDao  {
    public ActorDaoImpl() {
        super(Actor.class);
    }

    public void save(Actor actor) throws Exception {
        super.save(actor);
    }


    public void saveOrUpdate(Actor actor) throws Exception {
        super.saveOrUpdate(actor);
    }


    public void delete(Actor actor) throws Exception {
        super.delete(actor);
    }


    public Actor findById(long actorId) throws Exception {
        return super.findById(actorId);
    }


    public List<Actor> findAll() throws Exception {
        return super.findAll();
    }
}
