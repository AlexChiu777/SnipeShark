import com.snipeshark.entity.Actor;
import com.snipeshark.entity.Episode;
import com.snipeshark.entity.Season;
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

            Episode episode = new Episode();
            episode.setEpisodeID(1);
            episode.setEpisodeName("alex");

            Season season = new Season();
            season.setSeasonId(1);

            Series series = new Series();
            series.setSeriesID(1);

            episode.setSeason(season);

            season.setSeries(series);







            em.merge(episode);



            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}

