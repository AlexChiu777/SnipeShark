package com.achome.snipeshark.data.access.impl;

import com.achome.snipeshark.data.access.GenericDaoImpl;
import com.achome.snipeshark.data.access.dao.LanguageDao;
import com.achome.snipeshark.data.entity.Language;

import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public class LanguageDaoImpl extends GenericDaoImpl<Language> implements LanguageDao {
    public LanguageDaoImpl() {
        super(Language.class);
    }

    public void save(Language language) throws Exception {
        super.save(language);
    }


    public void saveOrUpdate(Language language) throws Exception {
        super.saveOrUpdate(language);
    }


    public void delete(Language language) throws Exception {
        super.delete(language);
    }


    public Language findById(long languageId) throws Exception {
        return (Language) super.findById(languageId);
    }


    public List<Language> findAll() throws Exception {
        return super.findAll();
    }
}
