/**
 * CrossSellingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling.stub;

public class CrossSellingServiceLocator extends org.apache.axis.client.Service implements de.epages.ws.crossselling.stub.CrossSellingService {

/**
 * epages Cross Selling Service
 */

    public CrossSellingServiceLocator() {
    }


    public CrossSellingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrossSellingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for port_CrossSelling
    private java.lang.String port_CrossSelling_address = "http://localhost/epages/Store.soap";

    public java.lang.String getport_CrossSellingAddress() {
        return port_CrossSelling_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String port_CrossSellingWSDDServiceName = "port_CrossSelling";

    public java.lang.String getport_CrossSellingWSDDServiceName() {
        return port_CrossSellingWSDDServiceName;
    }

    public void setport_CrossSellingWSDDServiceName(java.lang.String name) {
        port_CrossSellingWSDDServiceName = name;
    }

    public de.epages.ws.crossselling.stub.Port_CrossSelling getport_CrossSelling() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(port_CrossSelling_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getport_CrossSelling(endpoint);
    }

    public de.epages.ws.crossselling.stub.Port_CrossSelling getport_CrossSelling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.epages.ws.crossselling.stub.Bind_CrossSelling_SOAPStub _stub = new de.epages.ws.crossselling.stub.Bind_CrossSelling_SOAPStub(portAddress, this);
            _stub.setPortName(getport_CrossSellingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setport_CrossSellingEndpointAddress(java.lang.String address) {
        port_CrossSelling_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.epages.ws.crossselling.stub.Port_CrossSelling.class.isAssignableFrom(serviceEndpointInterface)) {
                de.epages.ws.crossselling.stub.Bind_CrossSelling_SOAPStub _stub = new de.epages.ws.crossselling.stub.Bind_CrossSelling_SOAPStub(new java.net.URL(port_CrossSelling_address), this);
                _stub.setPortName(getport_CrossSellingWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("port_CrossSelling".equals(inputPortName)) {
            return getport_CrossSelling();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "CrossSellingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "port_CrossSelling"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("port_CrossSelling".equals(portName)) {
            setport_CrossSellingEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
