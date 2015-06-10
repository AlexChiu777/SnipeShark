package com.achome.snipeshark.data.access;

import com.achome.snipeshark.data.DataConnectionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Alex on 6/9/2015.
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T> {
    private EntityManager entityManager;
    private EntityTransaction entityTransaction;
    final Class<T> typeParameterClass;

    public GenericDaoImpl(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public void save(T t) throws Exception {
        try {
            startOperation();
            entityManager.persist(t);
            entityTransaction.commit();
        } catch (Exception e) {
            throw handleException(e);
        } finally {
            DataConnectionManager.close();
        }
    }

    @Override
    public void saveOrUpdate (T t) throws Exception  {
        try {
            startOperation();
            entityManager.merge(t);
            entityTransaction.commit();
        } catch (Exception e) {
            throw handleException(e);
        } finally {
            DataConnectionManager.close();
        }
    }

    @Override
    public void delete (T t) throws Exception  {
        try {
            startOperation();
            entityManager.remove(t);
            entityTransaction.commit();
        } catch (Exception e) {
            throw handleException(e);
        } finally {
            DataConnectionManager.close();
        }
    }

    @Override
    public T findById (long id) throws Exception  {
        T t = null;
        try {
            startOperation();
            t = entityManager.find(typeParameterClass, id);
        } catch (Exception e) {
            throw handleException(e);
        } finally {
            DataConnectionManager.close();
        }
        return t;
    }

    @Override
    public List<T> findAll () throws Exception {
        List<T> objects = null;
        try {
            startOperation();
            Query query = entityManager.createQuery("from " + typeParameterClass.getName());
            objects = query.getResultList();
        } catch (Exception e) {
            throw handleException(e);
        } finally {
            DataConnectionManager.close();
        }
        return objects;
    }

    private Exception handleException(Exception e) throws Exception {
        DataConnectionManager.rollbackTransaction(entityTransaction);
        throw new Exception(e);
    }

    private void startOperation () {
        entityManager = DataConnectionManager.getEntityManager();
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
    }
}
