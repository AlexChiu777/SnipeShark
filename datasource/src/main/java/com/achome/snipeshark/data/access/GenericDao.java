package com.achome.snipeshark.data.access;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface GenericDao <T> {
    void save(T t) throws Exception ;
    void saveOrUpdate(T t) throws Exception ;
    void delete(T t) throws Exception;
    T findById (long tId) throws Exception ;
    List<T> findAll () throws Exception ;
}
