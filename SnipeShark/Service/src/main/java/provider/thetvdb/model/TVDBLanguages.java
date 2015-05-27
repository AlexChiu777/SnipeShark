package provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name="languages")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBLanguages {

    @XmlElement(name="language")
    private List<TVDBLanguage> languageList;

    public List<TVDBLanguage> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<TVDBLanguage> languageList) {
        this.languageList = languageList;
    }
}
