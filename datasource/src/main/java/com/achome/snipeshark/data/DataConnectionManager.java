package com.achome.snipeshark.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Alex on 6/9/2015.
 */
public class DataConnectionManager {
    private static final String PERSISTENCE_UNIT = "unit";
    private static EntityManagerFactory entityManagerFactory = null;
    private static EntityManager entityManager = null;

    public static void close() {
        try {
            if (entityManager.isOpen()) {
                entityManager.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeEntityManagerFactory() {
        if (entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }


    public static EntityManager getEntityManager() {
        buildEntityManagerFactory();
        if (entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public static EntityManagerFactory buildEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        return entityManagerFactory;
    }

    public static void rollbackTransaction(EntityTransaction entityTransaction) {
        if (entityTransaction != null && entityTransaction.isActive()) {
            entityTransaction.rollback();
        }
    }


}
