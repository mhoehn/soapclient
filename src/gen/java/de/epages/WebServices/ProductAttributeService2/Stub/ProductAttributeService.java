/**
 * ProductAttributeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductAttributeService2.Stub;

public interface ProductAttributeService extends javax.xml.rpc.Service {

/**
 * epages5 Tax Class Service
 */
    public java.lang.String getport_ProductAttributeAddress();

    public de.epages.WebServices.ProductAttributeService2.Stub.Port_ProductAttribute_PortType getport_ProductAttribute() throws javax.xml.rpc.ServiceException;

    public de.epages.WebServices.ProductAttributeService2.Stub.Port_ProductAttribute_PortType getport_ProductAttribute(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}