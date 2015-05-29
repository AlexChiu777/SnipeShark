package provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Alex on 5/24/2015.
 */
@XmlRootElement(name="mirrors")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mirrors {
    @XmlElement(name="mirror")
    private List<Mirror> mirrors = null;

    public List<Mirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<Mirror> mirrors) {
        this.mirrors = mirrors;
    }

    @Override
    public String toString() {
        return "Mirrors{" +
                "mirrors=" + mirrors +
                '}';
    }
}
