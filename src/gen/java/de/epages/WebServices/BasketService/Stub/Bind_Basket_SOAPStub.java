/**
 * Bind_Basket_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.BasketService.Stub;

public class Bind_Basket_SOAPStub extends org.apache.axis.client.Stub implements de.epages.WebServices.BasketService.Stub.Port_Basket_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Baskets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_GetInfo_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_AttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AddressAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_AttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LineItemAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_AttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_GetInfo_Out"));
        oper.setReturnClass(de.epages.WebServices.BasketService.Stub.TGetInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Baskets"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Baskets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Exists_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Exists_Out"));
        oper.setReturnClass(de.epages.WebServices.BasketService.Stub.TExists_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Baskets"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Baskets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Delete_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Delete_Out"));
        oper.setReturnClass(de.epages.WebServices.BasketService.Stub.TDelete_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Baskets"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Baskets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Update_In"), de.epages.WebServices.BasketService.Stub.TUpdate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Update_Out"));
        oper.setReturnClass(de.epages.WebServices.BasketService.Stub.TUpdate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Baskets"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Baskets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Create_In"), de.epages.WebServices.BasketService.Stub.TCreate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Create_Out"));
        oper.setReturnClass(de.epages.WebServices.BasketService.Stub.TCreate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Baskets"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TBasketPath"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LineItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdateLineItem_Input"), de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdateLineItem_Return"));
        oper.setReturnClass(de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "LineItem"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

    }

    public Bind_Basket_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_Basket_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_Basket_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_AttributeNames_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Create_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TCreate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCreate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Create_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TCreate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCreate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Delete_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Delete_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TDelete_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TDelete_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Exists_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Exists_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TExists_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TExists_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_GetInfo_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_GetInfo_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TGetInfo_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGetInfo_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_LanguageCodes_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Update_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TUpdate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "type_Update_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TUpdate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TBaseLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TBaseLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCouponLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TCouponLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCreate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TCreate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCreate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TCreate_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TDelete_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TDelete_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TEcoParticipationLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TEcoParticipationLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TExists_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TExists_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGetInfo_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TGetInfo_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGiftCouponLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TGiftCouponLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGlobalValueDiscountLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TGlobalValueDiscountLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TLineItemContainerIn");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TLineItemContainerIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TLineItemContainerOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TLineItemContainerOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfBaseLineItems");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TBaseLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TBaseLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfCouponLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TCouponLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCouponLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfEcoParticipationLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TEcoParticipationLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TEcoParticipationLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfGiftCouponLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TGiftCouponLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGiftCouponLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfGlobalValueDiscountLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TGlobalValueDiscountLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGlobalValueDiscountLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfPaymentDiscountLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TPaymentDiscountLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TPaymentDiscountLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfProductLineItemsIn");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TProductLineItemIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TProductLineItemIn");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfProductLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TProductLineItemOut[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TProductLineItemOut");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfShippingOptionLineItemsOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TShippingOptionLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TShippingOptionLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TListOfTaxLineItems");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TTaxLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TTaxLineItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TPaymentDiscountLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TPaymentDiscountLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TPaymentLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TPaymentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TProductLineItemIn");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TProductLineItemIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TProductLineItemOut");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TProductLineItemOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TShippingLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TShippingLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TShippingOptionLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TShippingOptionLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TTaxLineItem");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TTaxLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TUpdate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TUpdate_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdateLineItem_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdateLineItem_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "ListOfAttributes");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "ListOfLocalizedValues");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TLocalizedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TLocalizedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.BasketService.Stub.TAddressNamed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public de.epages.WebServices.BasketService.Stub.TGetInfo_Return[] getInfo(java.lang.String[] baskets, java.lang.String[] attributes, java.lang.String[] addressAttributes, java.lang.String[] lineItemAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/BasketService/2013/11#getInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "getInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baskets, attributes, addressAttributes, lineItemAttributes, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.BasketService.Stub.TGetInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.BasketService.Stub.TGetInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.BasketService.Stub.TGetInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.BasketService.Stub.TExists_Return[] exists(java.lang.String[] baskets) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/BasketService/2013/11#exists");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baskets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.BasketService.Stub.TExists_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.BasketService.Stub.TExists_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.BasketService.Stub.TExists_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.BasketService.Stub.TDelete_Return[] delete(java.lang.String[] baskets) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/BasketService/2013/11#delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baskets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.BasketService.Stub.TDelete_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.BasketService.Stub.TDelete_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.BasketService.Stub.TDelete_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.BasketService.Stub.TUpdate_Return[] update(de.epages.WebServices.BasketService.Stub.TUpdate_Input[] baskets) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/BasketService/2013/11#update");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baskets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.BasketService.Stub.TUpdate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.BasketService.Stub.TUpdate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.BasketService.Stub.TUpdate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.BasketService.Stub.TCreate_Return[] create(de.epages.WebServices.BasketService.Stub.TCreate_Input[] baskets) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/BasketService/2013/11#create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baskets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.BasketService.Stub.TCreate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.BasketService.Stub.TCreate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.BasketService.Stub.TCreate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return updateLineItem(java.lang.String TBasketPath, de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Input lineItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/BasketService/2013/11#updateLineItem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketService/2013/11", "updateLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TBasketPath, lineItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.BasketService.Stub.TUpdateLineItem_Return.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
