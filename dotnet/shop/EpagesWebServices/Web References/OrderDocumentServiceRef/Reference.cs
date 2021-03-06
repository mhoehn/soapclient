//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.18444
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

namespace EpagesWebServices.OrderDocumentServiceRef {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.Xml.Serialization;
    using System.ComponentModel;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="bind_OrderDocument_SOAP", Namespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TGetCreditNotes_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TGetPackingSlips_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TGetInvoices_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TCreate_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TCreate_Input))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TDelete_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TExists_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TLocalizedValue))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TAttribute))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TTaxLineItem))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TProductLineItemOut))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TGetInfo_Return))]
    public partial class OrderDocumentService : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        /// <remarks/>
        public OrderDocumentService() {
            this.Url = "http://localhost/epages/Store.soap";
        }
        
        public OrderDocumentService(string url) {
            this.Url = url;
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#getInfo", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("OrderDocuments")]
        public TGetInfo_Return[] getInfo(string[] OrderDocuments, string[] Attributes, string[] LanguageCodes) {
            object[] results = this.Invoke("getInfo", new object[] {
                        OrderDocuments,
                        Attributes,
                        LanguageCodes});
            return ((TGetInfo_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetInfo(string[] OrderDocuments, string[] Attributes, string[] LanguageCodes, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getInfo", new object[] {
                        OrderDocuments,
                        Attributes,
                        LanguageCodes}, callback, asyncState);
        }
        
        /// <remarks/>
        public TGetInfo_Return[] EndgetInfo(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TGetInfo_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#exists", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("OrderDocuments")]
        public TExists_Return[] exists(string[] OrderDocuments) {
            object[] results = this.Invoke("exists", new object[] {
                        OrderDocuments});
            return ((TExists_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult Beginexists(string[] OrderDocuments, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("exists", new object[] {
                        OrderDocuments}, callback, asyncState);
        }
        
        /// <remarks/>
        public TExists_Return[] Endexists(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TExists_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#delete", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("OrderDocuments")]
        public TDelete_Return[] delete(string[] OrderDocuments) {
            object[] results = this.Invoke("delete", new object[] {
                        OrderDocuments});
            return ((TDelete_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult Begindelete(string[] OrderDocuments, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("delete", new object[] {
                        OrderDocuments}, callback, asyncState);
        }
        
        /// <remarks/>
        public TDelete_Return[] Enddelete(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TDelete_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#create", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("OrderDocuments")]
        public TCreate_Return[] create(TCreate_Input[] OrderDocuments) {
            object[] results = this.Invoke("create", new object[] {
                        OrderDocuments});
            return ((TCreate_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult Begincreate(TCreate_Input[] OrderDocuments, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("create", new object[] {
                        OrderDocuments}, callback, asyncState);
        }
        
        /// <remarks/>
        public TCreate_Return[] Endcreate(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TCreate_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#getInvoices", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Orders")]
        public TGetInvoices_Return[] getInvoices(string[] Orders) {
            object[] results = this.Invoke("getInvoices", new object[] {
                        Orders});
            return ((TGetInvoices_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetInvoices(string[] Orders, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getInvoices", new object[] {
                        Orders}, callback, asyncState);
        }
        
        /// <remarks/>
        public TGetInvoices_Return[] EndgetInvoices(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TGetInvoices_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#getPackingSlips", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Orders")]
        public TGetPackingSlips_Return[] getPackingSlips(string[] Orders) {
            object[] results = this.Invoke("getPackingSlips", new object[] {
                        Orders});
            return ((TGetPackingSlips_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetPackingSlips(string[] Orders, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getPackingSlips", new object[] {
                        Orders}, callback, asyncState);
        }
        
        /// <remarks/>
        public TGetPackingSlips_Return[] EndgetPackingSlips(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TGetPackingSlips_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/OrderDocumentService/2005/01#getCreditNotes", RequestNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01", ResponseNamespace="urn://epages.de/WebService/OrderDocumentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Orders")]
        public TGetCreditNotes_Return[] getCreditNotes(string[] Orders) {
            object[] results = this.Invoke("getCreditNotes", new object[] {
                        Orders});
            return ((TGetCreditNotes_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetCreditNotes(string[] Orders, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getCreditNotes", new object[] {
                        Orders}, callback, asyncState);
        }
        
        /// <remarks/>
        public TGetCreditNotes_Return[] EndgetCreditNotes(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TGetCreditNotes_Return[])(results[0]));
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TGetInfo_Return {
        
        /// <remarks/>
        public string Path;
        
        /// <remarks/>
        public string Alias;
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public string Order;
        
        /// <remarks/>
        public bool Issued;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool IssuedSpecified;
        
        /// <remarks/>
        public System.DateTime IssueDate;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool IssueDateSpecified;
        
        /// <remarks/>
        public TAddress Address;
        
        /// <remarks/>
        public TAddress ShopAddress;
        
        /// <remarks/>
        public TLineItemContainerOut LineItemContainer;
        
        /// <remarks/>
        public TAttribute[] Attributes;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/ShopTypes/2005/01")]
    public partial class TAddress {
        
        /// <remarks/>
        public string DisplayName;
        
        /// <remarks/>
        public string AddressExtension;
        
        /// <remarks/>
        public string Street;
        
        /// <remarks/>
        public string Zipcode;
        
        /// <remarks/>
        public string City;
        
        /// <remarks/>
        public string State;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapElementAttribute(DataType="integer")]
        public string CountryID;
        
        /// <remarks/>
        public string EMail;
        
        /// <remarks/>
        public string Phone;
        
        /// <remarks/>
        public string Fax;
        
        /// <remarks/>
        public System.DateTime VerifiedOn;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool VerifiedOnSpecified;
        
        /// <remarks/>
        public string Salutation;
        
        /// <remarks/>
        public string Title;
        
        /// <remarks/>
        public string FirstName;
        
        /// <remarks/>
        public string MiddleName;
        
        /// <remarks/>
        public string LastName;
        
        /// <remarks/>
        public string EMailPrivate;
        
        /// <remarks/>
        public string EMailBusiness;
        
        /// <remarks/>
        public string PhonePrivate;
        
        /// <remarks/>
        public string PhoneBusiness;
        
        /// <remarks/>
        public string PhoneCell;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapElementAttribute(DataType="integer")]
        public string Gender;
        
        /// <remarks/>
        public string Company;
        
        /// <remarks/>
        public string Department;
        
        /// <remarks/>
        public string JobTitle;
        
        /// <remarks/>
        public System.DateTime Birthday;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool BirthdaySpecified;
        
        /// <remarks/>
        public string VATID;
        
        /// <remarks/>
        public string BankCode;
        
        /// <remarks/>
        public string BankName;
        
        /// <remarks/>
        public string BankAccountNo;
        
        /// <remarks/>
        public string BankAccountHolder;
        
        /// <remarks/>
        public string URL;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TGetCreditNotes_Return {
        
        /// <remarks/>
        public string Order;
        
        /// <remarks/>
        public string[] CreditNotes;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/EpagesTypes/2005/01")]
    public partial class TError {
        
        /// <remarks/>
        public string Message;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TGetPackingSlips_Return {
        
        /// <remarks/>
        public string Order;
        
        /// <remarks/>
        public string[] PackingSlips;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TGetInvoices_Return {
        
        /// <remarks/>
        public string Order;
        
        /// <remarks/>
        public string[] Invoices;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TCreate_Return {
        
        /// <remarks/>
        public string Alias;
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public string Order;
        
        /// <remarks/>
        public string Path;
        
        /// <remarks/>
        public bool created;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool createdSpecified;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TCreate_Input {
        
        /// <remarks/>
        public string Alias;
        
        /// <remarks/>
        public string Order;
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public bool Issued;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool IssuedSpecified;
        
        /// <remarks/>
        public System.DateTime IssueDate;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool IssueDateSpecified;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TDelete_Return {
        
        /// <remarks/>
        public string Path;
        
        /// <remarks/>
        public bool deleted;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool deletedSpecified;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TExists_Return {
        
        /// <remarks/>
        public string Path;
        
        /// <remarks/>
        public bool exists;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool existsSpecified;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/EpagesTypes/2005/01")]
    public partial class TLocalizedValue {
        
        /// <remarks/>
        public string LanguageCode;
        
        /// <remarks/>
        public string Value;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/EpagesTypes/2005/01")]
    public partial class TAttribute {
        
        /// <remarks/>
        public string Name;
        
        /// <remarks/>
        public string Value;
        
        /// <remarks/>
        public TLocalizedValue[] LocalizedValues;
        
        /// <remarks/>
        public string Type;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TShippingLineItem {
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public string Name;
        
        /// <remarks/>
        public string SKU;
        
        /// <remarks/>
        public string ShippingMethod;
        
        /// <remarks/>
        public string TaxClass;
        
        /// <remarks/>
        public float LineItemPrice;
        
        /// <remarks/>
        public float BasePrice;
        
        /// <remarks/>
        public float Quantity;
        
        /// <remarks/>
        public float Discount;
        
        /// <remarks/>
        public float TaxRate;
        
        /// <remarks/>
        public float TaxAmount;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TPaymentLineItem {
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public string Name;
        
        /// <remarks/>
        public string SKU;
        
        /// <remarks/>
        public string PaymentMethod;
        
        /// <remarks/>
        public string PaymentType;
        
        /// <remarks/>
        public string TaxClass;
        
        /// <remarks/>
        public float LineItemPrice;
        
        /// <remarks/>
        public float BasePrice;
        
        /// <remarks/>
        public float Quantity;
        
        /// <remarks/>
        public float Discount;
        
        /// <remarks/>
        public float TaxRate;
        
        /// <remarks/>
        public float TaxAmount;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TTaxLineItem {
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public string Name;
        
        /// <remarks/>
        public string SKU;
        
        /// <remarks/>
        public string TaxArea;
        
        /// <remarks/>
        public string TaxMatrix;
        
        /// <remarks/>
        public string TaxClass;
        
        /// <remarks/>
        public float LineItemPrice;
        
        /// <remarks/>
        public float BasePrice;
        
        /// <remarks/>
        public float Quantity;
        
        /// <remarks/>
        public float Discount;
        
        /// <remarks/>
        public float TaxRate;
        
        /// <remarks/>
        public float TaxAmount;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TProductLineItemOut {
        
        /// <remarks/>
        public string Class;
        
        /// <remarks/>
        public string Name;
        
        /// <remarks/>
        public string SKU;
        
        /// <remarks/>
        public string Product;
        
        /// <remarks/>
        public string TaxClass;
        
        /// <remarks/>
        public float LineItemPrice;
        
        /// <remarks/>
        public float BasePrice;
        
        /// <remarks/>
        public float Quantity;
        
        /// <remarks/>
        public float Discount;
        
        /// <remarks/>
        public float TaxRate;
        
        /// <remarks/>
        public float TaxAmount;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/OrderDocumentTypes/2005/01")]
    public partial class TLineItemContainerOut {
        
        /// <remarks/>
        public string LocaleID;
        
        /// <remarks/>
        public string LanguageCode;
        
        /// <remarks/>
        public string CurrencyID;
        
        /// <remarks/>
        public string TaxArea;
        
        /// <remarks/>
        public string TaxAreaName;
        
        /// <remarks/>
        public string TaxModel;
        
        /// <remarks/>
        public float GrandTotal;
        
        /// <remarks/>
        public float TotalBeforeTax;
        
        /// <remarks/>
        public float TotalTax;
        
        /// <remarks/>
        public TProductLineItemOut[] ProductLineItems;
        
        /// <remarks/>
        public TTaxLineItem[] TaxLineItems;
        
        /// <remarks/>
        public TPaymentLineItem PaymentLineItem;
        
        /// <remarks/>
        public TShippingLineItem ShippingLineItem;
    }
}
