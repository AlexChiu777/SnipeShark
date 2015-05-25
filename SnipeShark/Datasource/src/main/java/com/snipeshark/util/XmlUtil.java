package com.snipeshark.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.FileInputStream;
import java.io.StringReader;

/**
 * Created by Alex on 5/24/2015.
 */
public class XmlUtil<T> {
    //gets an object, unmarshall it and gives the corresponding class back
    //overridden class so that xml inputs are case insensitive

    final Class<T> typeParameterClass;

    public XmlUtil(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public T getXmlObject(String xml) {
        T t = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(typeParameterClass);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            //make a reader
            StringReader reader = new StringReader(xml);

            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLStreamReader xsr = xif.createXMLStreamReader(reader);
            xsr = new MyStreamReaderDelegate(xsr);


            t = (T) jaxbUnmarshaller.unmarshal(xsr);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }

    private static class MyStreamReaderDelegate extends StreamReaderDelegate {

        public MyStreamReaderDelegate(XMLStreamReader xsr) {
            super(xsr);
        }

        @Override
        public String getAttributeLocalName(int index) {
            return super.getAttributeLocalName(index).toLowerCase();
        }

        @Override
        public String getLocalName() {
            return super.getLocalName().toLowerCase();
        }

    }


}
