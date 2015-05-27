package provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name="banner")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBBanner {
    @XmlElement(name="id")
    private long id;

    @XmlElement(name="bannerpath")
    private String bannerPath;

    @XmlElement(name="bannertype")
    private String bannerType;

    @XmlElement(name="bannertype2")
    private String bannerType2;

    @XmlElement(name="colors")
    private String colors;

    @XmlElement(name="language")
    private String language;

    @XmlElement(name="rating")
    private float rating;

    @XmlElement(name="ratingcount")
    private int ratingCount;

    @XmlElement(name="seriesname")
    private String seriesName;

    @XmlElement(name="thumbnailpath")
    private String thumbnailPath;

    @XmlElement(name="vignettepath")
    private String vignettePath;

    @XmlElement(name="season")
    private String season;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBannerPath() {
        return bannerPath;
    }

    public void setBannerPath(String bannerPath) {
        this.bannerPath = bannerPath;
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public String getBannerType2() {
        return bannerType2;
    }

    public void setBannerType2(String bannerType2) {
        this.bannerType2 = bannerType2;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    public String getVignettePath() {
        return vignettePath;
    }

    public void setVignettePath(String vignettePath) {
        this.vignettePath = vignettePath;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
