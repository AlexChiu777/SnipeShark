package service.data;

import com.snipeshark.model.Episode;
import com.snipeshark.model.Series;
import com.snipeshark.model.UpdatedContent;

import java.util.List;

/**
 * Created by Alex on 5/26/2015.
 */
public interface MediaSourceServiceFactory {
    //void for now
    List<Series> getBasicSeriesByName(String seriesName);
    Series getSeriesById(String seriesId);
    Series getFullSeriesById(String seriesId);
    Episode getEpisodeById(String episodeId);

    //this is specifically for forced update (if last updated didn,t change - returns null)
    Series getSpecifcSeriesUpdate(long lastUpdated, String seriesId);

    Episode getSpecifcEpisodeUpdate(long lastUpdated, String episodeId);

    //preferred to use daily or weekly - monthly and all are usually not used
    //will only return series that are in the list AND have been updated
    UpdatedContent getUpdatedSince (long timeDiff);

}
