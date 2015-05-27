package service.data;

import java.util.List;

/**
 * Created by Alex on 5/26/2015.
 */
public interface MediaSourceServiceFactory {
    //void for now
    void getSeriesByName(String seriesName);
    void getSeriesByID(String seriesId);
    void getDetailSeriesByID(String seriesId);
    void getEpisodeFromSeriesByID(String seriesId, String episodeId);

    //this is specifically for forced update (if last updated didn,t change - returns null)
    void getSpecifcSeriesUpdate(long lastUpdated, String seriesId);

    //preferred to use daily or weekly - monthly and all are usually not used
    //will only return series that are in the list AND have been updated
    void getDailyUpdatedInfoForSeries(List<String> seriesList);
    void getWeeklyUpdatedInfoForSeries(List<String> seriesList);
    void getMonthlyUpdatedInfoForSeries(List<String> seriesList);
    void getAllUpdatedInfoForSeries(List<String> seriesList);

}
