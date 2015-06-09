package com.achome.snipeshark.service;

import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.service.data.MediaSourceServiceFactory;
import com.achome.snipeshark.service.data.TMDBMediaSourceWorker;
import com.achome.snipeshark.service.data.TVDBMediaSourceWorker;

/**
 * Created by Alex on 6/7/2015.
 */
public class EntertainmentService {
    private static TVDBMediaSourceWorker tvdbWorker = new TVDBMediaSourceWorker(SSConstants.TVDB_API_KEY, SSConstants.LANGUAGE_ENGLISH);
    private static TMDBMediaSourceWorker tmdbWorker = new TMDBMediaSourceWorker(SSConstants.TMDB_API_KEY);

    private final static EntertainmentService instance = new EntertainmentService();
    private EntertainmentService() {}

    public static EntertainmentService getInstance() {
        return instance;
    }

    public MediaSourceServiceFactory getMediaSourceWorker (int workerType) {
        MediaSourceServiceFactory worker = null;

        if (workerType == SSConstants.PROVIDER_TYPE_TMDB) {
            worker = tmdbWorker;
        } else if (workerType == SSConstants.PROVIDER_TYPE_TVDB) {
            worker = tvdbWorker;
        }
        return worker;
    }

}
