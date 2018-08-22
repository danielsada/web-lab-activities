
package mx.itesm.pg2.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.itesm.pg2.client package. 
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

    private final static QName _LesserResponse_QNAME = new QName("http://pg2.itesm.mx/", "lesserResponse");
    private final static QName _Lesser_QNAME = new QName("http://pg2.itesm.mx/", "lesser");
    private final static QName _ServicioWebException_QNAME = new QName("http://pg2.itesm.mx/", "ServicioWebException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.itesm.pg2.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicioWebException }
     * 
     */
    public ServicioWebException createServicioWebException() {
        return new ServicioWebException();
    }

    /**
     * Create an instance of {@link Lesser }
     * 
     */
    public Lesser createLesser() {
        return new Lesser();
    }

    /**
     * Create an instance of {@link LesserResponse }
     * 
     */
    public LesserResponse createLesserResponse() {
        return new LesserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LesserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pg2.itesm.mx/", name = "lesserResponse")
    public JAXBElement<LesserResponse> createLesserResponse(LesserResponse value) {
        return new JAXBElement<LesserResponse>(_LesserResponse_QNAME, LesserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lesser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pg2.itesm.mx/", name = "lesser")
    public JAXBElement<Lesser> createLesser(Lesser value) {
        return new JAXBElement<Lesser>(_Lesser_QNAME, Lesser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioWebException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pg2.itesm.mx/", name = "ServicioWebException")
    public JAXBElement<ServicioWebException> createServicioWebException(ServicioWebException value) {
        return new JAXBElement<ServicioWebException>(_ServicioWebException_QNAME, ServicioWebException.class, null, value);
    }

}
