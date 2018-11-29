
package org.gs4tr.projectdirector.ws.service.services.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.gs4tr.projectdirector.model.dto.xsd.ProjectAClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProjectAClientServicePortType", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProjectAClientServicePortType {


    /**
     * 
     * @param name
     * @return
     *     returns org.gs4tr.projectdirector.ws.service.services.impl.ProjectAClient
     */
    @WebMethod(action = "urn:findByName")
    @WebResult(targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    @RequestWrapper(localName = "findByName", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindByName")
    @ResponseWrapper(localName = "findByNameResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindByNameResponse")
    public ProjectAClient findByName(
        @WebParam(name = "name", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        String name);

    /**
     * 
     * @param organizationName
     * @return
     *     returns java.util.List<org.gs4tr.projectdirector.ws.service.services.impl.ProjectAClient>
     */
    @WebMethod(action = "urn:findByOrganizationName")
    @WebResult(targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    @RequestWrapper(localName = "findByOrganizationName", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindByOrganizationName")
    @ResponseWrapper(localName = "findByOrganizationNameResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindByOrganizationNameResponse")
    public List<ProjectAClient> findByOrganizationName(
        @WebParam(name = "organizationName", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        String organizationName);

}
