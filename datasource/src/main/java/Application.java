import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.service.EntertainmentService;

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

            com.achome.snipeshark.model.Series series = EntertainmentService.getInstance().getMediaSourceWorker(SSConstants.PROVIDER_TYPE_TVDB).getSeriesById("270408");

            System.out.println(series);


            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}

