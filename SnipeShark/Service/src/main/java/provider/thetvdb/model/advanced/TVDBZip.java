package provider.thetvdb.model.advanced;

import provider.thetvdb.model.TVDBActors;
import provider.thetvdb.model.TVDBBanners;
import provider.thetvdb.model.TVDBData;

/**
 * Created by Alex on 5/26/2015.
 */
public class TVDBZip {
    private TVDBData tvdbData;
    private TVDBBanners banners;
    private TVDBActors actors;

    public TVDBData getTvdbData() {
        return tvdbData;
    }

    public void setTvdbData(TVDBData tvdbData) {
        this.tvdbData = tvdbData;
    }

    public TVDBBanners getBanners() {
        return banners;
    }

    public void setBanners(TVDBBanners banners) {
        this.banners = banners;
    }

    public TVDBActors getActors() {
        return actors;
    }

    public void setActors(TVDBActors actors) {
        this.actors = actors;
    }
}
