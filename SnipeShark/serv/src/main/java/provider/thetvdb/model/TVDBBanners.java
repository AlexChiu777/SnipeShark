package provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name="banners")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBBanners {
    @XmlElement(name="banner")
    private List<TVDBBanner> bannerList;

    public List<TVDBBanner> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<TVDBBanner> bannerList) {
        this.bannerList = bannerList;
    }
}
