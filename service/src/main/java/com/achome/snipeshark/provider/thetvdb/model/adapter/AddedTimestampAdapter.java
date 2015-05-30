package com.achome.snipeshark.provider.thetvdb.model.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex on 5/26/2015.
 */
public class AddedTimestampAdapter extends XmlAdapter<String, Date> {

        private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        @Override
        public String marshal(Date v) throws Exception {
        return dateFormat.format(v);
    }

        @Override
        public Date unmarshal(String v) throws Exception {
        return dateFormat.parse(v);
    }

}
