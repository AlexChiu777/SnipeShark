import com.snipeshark.entity.Series;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Alex on 5/24/2015.
 */
public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;

        EntityManager em = null;

        EntityTransaction tx = null;
        try {
            emf = Persistence.createEntityManagerFactory("unit");
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}

