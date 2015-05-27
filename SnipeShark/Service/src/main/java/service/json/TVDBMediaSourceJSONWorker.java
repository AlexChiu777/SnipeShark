package service.json;

import org.codehaus.jackson.map.ObjectMapper;
import provider.thetvdb.service.TVProcessor;

/**
 * Created by Alex on 5/26/2015.
 */
public class TVDBMediaSourceJSONWorker implements MediaSourceJSONFactory {
    private TVProcessor processor;
    private static final String language = "en";
    private static final ObjectMapper mapper = new ObjectMapper();

    public TVDBMediaSourceJSONWorker(String apiKey) {
        processor = new TVProcessor(apiKey);
    }

    @Override
    public String getSeriesById(String seriesId) throws Exception {
        return mapper.writeValueAsString(processor.getTVDBSeriesInfoById(seriesId, language));
    }

    @Override
    public String getSeriesByName(String seriesName) throws  Exception{
        return mapper.writeValueAsString(processor.getTVDBSeriesInfoByName(seriesName));
    }

    @Override
    public String getEpisodeById(String episodeId) throws Exception {
        return mapper.writeValueAsString(processor.getTVDBEpisodeInfoById(episodeId, language));
    }
}
