import service.json.TVDBMediaSourceJSONWorker;

/**
 * Created by Alex on 5/26/2015.
 */
public class TestJSONWorker {


    public static void main(String[] args) {
        String apiKey = "DFCDB4071E338637";
        String seriesId = "270408";
        String episodeId = "270408";

        TVDBMediaSourceJSONWorker worker = new TVDBMediaSourceJSONWorker(apiKey);

        try {
            //System.out.println(worker.getSeriesById(seriesId));
            //System.out.println(worker.getSeriesByName("Outlander"));
            System.out.println(worker.getEpisodeById(episodeId));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
