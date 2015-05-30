package com.achome.snipeshark.entity.primaryId;

import com.achome.snipeshark.entity.Series;
import com.achome.snipeshark.entity.Series;

import java.io.Serializable;

/**
 * Created by Alex on 5/27/2015.
 */
public class SeasonPK implements Serializable {
    private long seasonId;
    private Series series;

    public SeasonPK(){}
    public SeasonPK(long seasonId, Series series) {
        this.seasonId = seasonId;
        this.series = series;
    }

    public long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(long seasonId) {
        this.seasonId = seasonId;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeasonPK)) return false;

        SeasonPK seasonPK = (SeasonPK) o;

        if (seasonId != seasonPK.seasonId) return false;
        if (!series.equals(seasonPK.series)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (seasonId ^ (seasonId >>> 32));
        result = 31 * result + series.hashCode();
        return result;
    }
}
