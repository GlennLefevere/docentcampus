//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.12 at 02:15:27 PM CEST 
//


package com.mycompany.hr.schemas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.hr.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.hr.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocentResponse }
     * 
     */
    public GetDocentResponse createGetDocentResponse() {
        return new GetDocentResponse();
    }

    /**
     * Create an instance of {@link DocentCampus }
     * 
     */
    public DocentCampus createDocentCampus() {
        return new DocentCampus();
    }

    /**
     * Create an instance of {@link RemoveCampusResponse }
     * 
     */
    public RemoveCampusResponse createRemoveCampusResponse() {
        return new RemoveCampusResponse();
    }

    /**
     * Create an instance of {@link RemoveCampusRequest }
     * 
     */
    public RemoveCampusRequest createRemoveCampusRequest() {
        return new RemoveCampusRequest();
    }

    /**
     * Create an instance of {@link GetDocentRequest }
     * 
     */
    public GetDocentRequest createGetDocentRequest() {
        return new GetDocentRequest();
    }

}
