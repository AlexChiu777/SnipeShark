package com.achome.snipeshark.util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by Alex on 6/7/2015.
 */
public class JsonUtil <T>{
    //gets an object, unmarshall it and gives the corresponding class back
    //overridden class so that xml inputs are case insensitive

    final Class<T> typeParameterClass;

    public JsonUtil(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public T getConvertedJSON(String json) {
        ObjectMapper mapper = new ObjectMapper();

        T returnObject = null;

        try {
            returnObject = mapper.readValue(json, typeParameterClass);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnObject;
    }
}
