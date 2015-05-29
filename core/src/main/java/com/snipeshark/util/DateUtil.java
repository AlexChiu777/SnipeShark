package com.snipeshark.util;

/**
 * Created by Alex on 5/27/2015.
 */
public class DateUtil {
    private static DateUtil instance = new DateUtil();
    protected DateUtil() {
    }

    public static DateUtil getInstance() {
        return instance;
    }
}
