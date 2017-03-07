
package pt.ulisboa.tecnico.sdis.store.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "docAlreadyExists", targetNamespace = "urn:pt:ulisboa:tecnico:sdis:store:ws")
public class DocAlreadyExists_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DocAlreadyExists faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DocAlreadyExists_Exception(String message, DocAlreadyExists faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DocAlreadyExists_Exception(String message, DocAlreadyExists faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pt.ulisboa.tecnico.sdis.store.ws.DocAlreadyExists
     */
    public DocAlreadyExists getFaultInfo() {
        return faultInfo;
    }

}
