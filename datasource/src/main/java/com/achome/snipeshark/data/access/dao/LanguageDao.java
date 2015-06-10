package com.achome.snipeshark.data.access.dao;

import com.achome.snipeshark.data.access.GenericDao;
import com.achome.snipeshark.data.entity.Language;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public interface LanguageDao extends GenericDao<Language> {
    void save(Language language) throws Exception ;
    void saveOrUpdate(Language language) throws Exception ;
    Language findById (long languageId) throws Exception ;
    List<Language> findAll () throws Exception ;
}
