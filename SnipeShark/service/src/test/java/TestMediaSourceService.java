import com.snipeshark.model.Series;
import service.data.TVDBMediaSourceWorker;

/**
 * Created by Alex on 5/27/2015.
 */
public class TestMediaSourceService {
    public static void main(String[] args) {
        String apiKey = "DFCDB4071E338637";
        String seriesId = "270408";
        String episodeId = "270408";

        TVDBMediaSourceWorker worker = new TVDBMediaSourceWorker(apiKey, "en");

        try {
            Series series = worker.getSeriesById("270408");

            System.out.println("asa");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
