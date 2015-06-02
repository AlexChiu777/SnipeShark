package com.achome.snipeshark.rest.controller;

import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.service.data.TVDBMediaSourceWorker;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by Alex on 5/30/2015.
 */

@RestController
@RequestMapping("/tv")
public class TVContentController {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static TVDBMediaSourceWorker worker = new TVDBMediaSourceWorker(SSConstants.TVDB_API_KEY, SSConstants.LANGUAGE_ENGLISH);

    //To get banners or fanarts
    //http://thetvdb.com/banners/fanart/original/80348-48.jpg
    //http://thetvdb.com/banners/banner/original/80348-48.jpg

    @RequestMapping(value = "/series/name/{name}", method = RequestMethod.GET)
    public String getSeriesByName(@PathVariable String name) throws IOException{
        return mapper.writeValueAsString(worker.getBasicSeriesByName(name));
    }

    @RequestMapping(value = "/series/id/{id}", method = RequestMethod.GET)
    public String getSeriesById(@PathVariable String id) throws IOException {
        return mapper.writeValueAsString(worker.getSeriesById(id));
    }

    @RequestMapping(value = "/series/full/id/{id}", method = RequestMethod.GET)
    public String getFullSeriesById(@PathVariable String id) throws IOException {
        return mapper.writeValueAsString(worker.getFullSeriesById(id));
    }

    @RequestMapping(value = "/episode/id/{id}", method = RequestMethod.GET)
    public String getEpisodeById(@PathVariable String id) throws IOException {
        return mapper.writeValueAsString(worker.getEpisodeById(id));
    }

}
