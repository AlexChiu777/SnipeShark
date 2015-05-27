package provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Alex on 5/26/2015.
 */
@XmlRootElement(name="banner")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBUpdateBanner {
    @XmlElement(name="series")
    private long series;

    @XmlElement(name="format")
    private String format;

    @XmlElement(name="language")
    private String language;

    @XmlElement(name="path")
    private String path;

    @XmlElement(name="time")
    private long time;

    @XmlElement(name="type")
    private String type;

    public long getSeries() {
        return series;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
