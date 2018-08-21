
package mx.itesm.pw2.soapjavaclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.itesm.pw2.soapjavaclient package. 
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

    private final static QName _SaludoResponse_QNAME = new QName("http://ServicioWebException/", "saludoResponse");
    private final static QName _ServicioWebException_QNAME = new QName("http://ServicioWebException/", "ServicioWebException");
    private final static QName _Saludo_QNAME = new QName("http://ServicioWebException/", "saludo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.itesm.pw2.soapjavaclient
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
     * Create an instance of {@link Saludo }
     * 
     */
    public Saludo createSaludo() {
        return new Saludo();
    }

    /**
     * Create an instance of {@link SaludoResponse }
     * 
     */
    public SaludoResponse createSaludoResponse() {
        return new SaludoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicioWebException/", name = "saludoResponse")
    public JAXBElement<SaludoResponse> createSaludoResponse(SaludoResponse value) {
        return new JAXBElement<SaludoResponse>(_SaludoResponse_QNAME, SaludoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioWebException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicioWebException/", name = "ServicioWebException")
    public JAXBElement<ServicioWebException> createServicioWebException(ServicioWebException value) {
        return new JAXBElement<ServicioWebException>(_ServicioWebException_QNAME, ServicioWebException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicioWebException/", name = "saludo")
    public JAXBElement<Saludo> createSaludo(Saludo value) {
        return new JAXBElement<Saludo>(_Saludo_QNAME, Saludo.class, null, value);
    }

}
