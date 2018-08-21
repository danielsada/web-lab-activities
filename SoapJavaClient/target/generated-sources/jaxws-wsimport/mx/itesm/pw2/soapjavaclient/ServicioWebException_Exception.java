
package mx.itesm.pw2.soapjavaclient;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServicioWebException", targetNamespace = "http://ServicioWebException/")
public class ServicioWebException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServicioWebException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServicioWebException_Exception(String message, ServicioWebException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServicioWebException_Exception(String message, ServicioWebException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: mx.itesm.pw2.soapjavaclient.ServicioWebException
     */
    public ServicioWebException getFaultInfo() {
        return faultInfo;
    }

}
