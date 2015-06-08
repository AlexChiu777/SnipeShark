package com.achome.snipeshark.rest.controller;

import com.achome.snipeshark.service.EntertainmentService;
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
@RequestMapping("/tv/{workerId}")
public class TVContentController {
    private static final ObjectMapper mapper = new ObjectMapper();

    //To get banners or fanarts
    //http://thetvdb.com/banners/fanart/original/80348-48.jpg
    //http://thetvdb.com/banners/banner/original/80348-48.jpg

    @RequestMapping(value = "/series/name/{name}", method = RequestMethod.GET)
    public String getSeriesByName(@PathVariable int workerId, @PathVariable String name) throws IOException{
        return mapper.writeValueAsString(EntertainmentService.getInstance().getMediaSourceWorker(workerId).getBasicSeriesByName(name));
    }

    @RequestMapping(value = "/series/id/{id}", method = RequestMethod.GET)
    public String getSeriesById(@PathVariable int workerId, @PathVariable String id) throws IOException {
        return mapper.writeValueAsString(EntertainmentService.getInstance().getMediaSourceWorker(workerId).getSeriesById(id));
    }

    @RequestMapping(value = "/series/full/id/{id}", method = RequestMethod.GET)
    public String getFullSeriesById(@PathVariable int workerId, @PathVariable String id) throws IOException {
        return mapper.writeValueAsString(EntertainmentService.getInstance().getMediaSourceWorker(workerId).getFullSeriesById(id));
    }

    @RequestMapping(value = "/episode/id/{id}", method = RequestMethod.GET)
    public String getEpisodeById(@PathVariable int workerId, @PathVariable String id) throws IOException {
        return mapper.writeValueAsString(EntertainmentService.getInstance().getMediaSourceWorker(workerId).getEpisodeById(id));
    }

    @RequestMapping(value = "/tv/premiere", method = RequestMethod.GET)
    public String getTVPremiere(@PathVariable int workerId) throws IOException {
        return mapper.writeValueAsString(EntertainmentService.getInstance().getMediaSourceWorker(workerId).getTVPremiere());
    }

    @RequestMapping(value = "/tv/popular", method = RequestMethod.GET)
    public String getTVPopular(@PathVariable int workerId) throws IOException {
        return mapper.writeValueAsString(EntertainmentService.getInstance().getMediaSourceWorker(workerId).getPopularSeries());
    }

}
