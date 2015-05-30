package com.achome.snipeshark.service.json;


import com.achome.snipeshark.SSConstants;
import org.codehaus.jackson.map.ObjectMapper;
import com.achome.snipeshark.provider.thetvdb.service.TVDBProcessor;

/**
 * Created by Alex on 5/26/2015.
 */
public class TVDBMediaSourceJSONWorker implements MediaSourceJSONFactory {
    private TVDBProcessor processor;
    private static final ObjectMapper mapper = new ObjectMapper();

    public TVDBMediaSourceJSONWorker(String apiKey) {
        processor = new TVDBProcessor(apiKey, SSConstants.LANGUAGE_ENGLISH);
    }

    @Override
    public String getSeriesById(String seriesId) throws Exception {
        return mapper.writeValueAsString(processor.getTVDBSeriesInfoById(seriesId));
    }

    @Override
    public String getFullSeriesById(String seriesId) throws Exception {
        return mapper.writeValueAsString(processor.getTVDBFullSeriesInfoById(seriesId));
    }

    @Override
    public String getBasicSeriesByName(String seriesName) throws  Exception{
        return mapper.writeValueAsString(processor.getTVDBSeriesInfoByName(seriesName));
    }

    @Override
    public String getEpisodeById(String episodeId) throws Exception {
        return mapper.writeValueAsString(processor.getTVDBEpisodeInfoById(episodeId));
    }

    @Override
    public String getUpdatesByTimeDiff(long timeDiff) throws Exception {
        return mapper.writeValueAsString(processor.getTVDBUpdate(timeDiff));
    }
}
