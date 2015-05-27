package service.json;

/**
 * Created by Alex on 5/26/2015.
 */
public interface MediaSourceJSONFactory {
    //Detailed Series info
    String getSeriesById(String seriesId) throws Exception;

    //Skim version of the series
    String getSeriesByName(String seriesName) throws Exception;


    String getEpisodeById(String episodeId) throws Exception;
}
