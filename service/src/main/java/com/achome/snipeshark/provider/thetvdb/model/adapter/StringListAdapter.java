package com.achome.snipeshark.provider.thetvdb.model.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Alex on 5/26/2015.
 */
public class StringListAdapter extends XmlAdapter<String, List<String>> {

    @Override
    public String marshal(List<String> v) throws Exception {
        String content = null;
        for (String x: v) {
            if (content == null) {
                content = x;
            } else {
                content = content + "|" + x;
            }
        }
        return content;
    }

    @Override
    public List<String> unmarshal(String v) throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(v, "|");
        List<String> list = new ArrayList<String>();
        while (tokenizer.hasMoreElements()) {
            list.add((String)tokenizer.nextElement());
        }

        return list;
    }
}
