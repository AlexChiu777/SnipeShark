package com.snipeshark.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Alex on 5/27/2015.
 */
public class StringUtil {
    private static StringUtil instance = new StringUtil();
    protected StringUtil() {
    }

    public static StringUtil getInstance() {
        return instance;
    }

    public static List<String> convertStringWithDelimiterToList(String s, String delim) {
        List<String> stringList = new ArrayList<String>();
        StringTokenizer stringTokenizer = new StringTokenizer(s, delim);

        while (stringTokenizer.hasMoreElements()) {
            stringList.add((String)stringTokenizer.nextElement());
        }

        return stringList;
    }
}
