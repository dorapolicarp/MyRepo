/*
 * XML Type:  element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Element
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML element(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Element extends org.w3.x2001.xmlSchema.Annotated
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Element.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("elementd189type");
    
    /**
     * Gets the "simpleType" element
     */
    org.w3.x2001.xmlSchema.LocalSimpleType getSimpleType();
    
    /**
     * True if has "simpleType" element
     */
    boolean isSetSimpleType();
    
    /**
     * Sets the "simpleType" element
     */
    void setSimpleType(org.w3.x2001.xmlSchema.LocalSimpleType simpleType);
    
    /**
     * Appends and returns a new empty "simpleType" element
     */
    org.w3.x2001.xmlSchema.LocalSimpleType addNewSimpleType();
    
    /**
     * Unsets the "simpleType" element
     */
    void unsetSimpleType();
    
    /**
     * Gets the "complexType" element
     */
    org.w3.x2001.xmlSchema.LocalComplexType getComplexType();
    
    /**
     * True if has "complexType" element
     */
    boolean isSetComplexType();
    
    /**
     * Sets the "complexType" element
     */
    void setComplexType(org.w3.x2001.xmlSchema.LocalComplexType complexType);
    
    /**
     * Appends and returns a new empty "complexType" element
     */
    org.w3.x2001.xmlSchema.LocalComplexType addNewComplexType();
    
    /**
     * Unsets the "complexType" element
     */
    void unsetComplexType();
    
    /**
     * Gets array of all "unique" elements
     */
    org.w3.x2001.xmlSchema.Keybase[] getUniqueArray();
    
    /**
     * Gets ith "unique" element
     */
    org.w3.x2001.xmlSchema.Keybase getUniqueArray(int i);
    
    /**
     * Returns number of "unique" element
     */
    int sizeOfUniqueArray();
    
    /**
     * Sets array of all "unique" element
     */
    void setUniqueArray(org.w3.x2001.xmlSchema.Keybase[] uniqueArray);
    
    /**
     * Sets ith "unique" element
     */
    void setUniqueArray(int i, org.w3.x2001.xmlSchema.Keybase unique);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unique" element
     */
    org.w3.x2001.xmlSchema.Keybase insertNewUnique(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unique" element
     */
    org.w3.x2001.xmlSchema.Keybase addNewUnique();
    
    /**
     * Removes the ith "unique" element
     */
    void removeUnique(int i);
    
    /**
     * Gets array of all "key" elements
     */
    org.w3.x2001.xmlSchema.Keybase[] getKeyArray();
    
    /**
     * Gets ith "key" element
     */
    org.w3.x2001.xmlSchema.Keybase getKeyArray(int i);
    
    /**
     * Returns number of "key" element
     */
    int sizeOfKeyArray();
    
    /**
     * Sets array of all "key" element
     */
    void setKeyArray(org.w3.x2001.xmlSchema.Keybase[] keyArray);
    
    /**
     * Sets ith "key" element
     */
    void setKeyArray(int i, org.w3.x2001.xmlSchema.Keybase key);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "key" element
     */
    org.w3.x2001.xmlSchema.Keybase insertNewKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "key" element
     */
    org.w3.x2001.xmlSchema.Keybase addNewKey();
    
    /**
     * Removes the ith "key" element
     */
    void removeKey(int i);
    
    /**
     * Gets array of all "keyref" elements
     */
    org.w3.x2001.xmlSchema.KeyrefDocument.Keyref[] getKeyrefArray();
    
    /**
     * Gets ith "keyref" element
     */
    org.w3.x2001.xmlSchema.KeyrefDocument.Keyref getKeyrefArray(int i);
    
    /**
     * Returns number of "keyref" element
     */
    int sizeOfKeyrefArray();
    
    /**
     * Sets array of all "keyref" element
     */
    void setKeyrefArray(org.w3.x2001.xmlSchema.KeyrefDocument.Keyref[] keyrefArray);
    
    /**
     * Sets ith "keyref" element
     */
    void setKeyrefArray(int i, org.w3.x2001.xmlSchema.KeyrefDocument.Keyref keyref);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyref" element
     */
    org.w3.x2001.xmlSchema.KeyrefDocument.Keyref insertNewKeyref(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyref" element
     */
    org.w3.x2001.xmlSchema.KeyrefDocument.Keyref addNewKeyref();
    
    /**
     * Removes the ith "keyref" element
     */
    void removeKeyref(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "ref" attribute
     */
    javax.xml.namespace.QName getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlQName xgetRef();
    
    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(javax.xml.namespace.QName ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.apache.xmlbeans.XmlQName ref);
    
    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();
    
    /**
     * Gets the "type" attribute
     */
    javax.xml.namespace.QName getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlQName xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(javax.xml.namespace.QName type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlQName type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "substitutionGroup" attribute
     */
    javax.xml.namespace.QName getSubstitutionGroup();
    
    /**
     * Gets (as xml) the "substitutionGroup" attribute
     */
    org.apache.xmlbeans.XmlQName xgetSubstitutionGroup();
    
    /**
     * True if has "substitutionGroup" attribute
     */
    boolean isSetSubstitutionGroup();
    
    /**
     * Sets the "substitutionGroup" attribute
     */
    void setSubstitutionGroup(javax.xml.namespace.QName substitutionGroup);
    
    /**
     * Sets (as xml) the "substitutionGroup" attribute
     */
    void xsetSubstitutionGroup(org.apache.xmlbeans.XmlQName substitutionGroup);
    
    /**
     * Unsets the "substitutionGroup" attribute
     */
    void unsetSubstitutionGroup();
    
    /**
     * Gets the "minOccurs" attribute
     */
    java.math.BigInteger getMinOccurs();
    
    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs();
    
    /**
     * True if has "minOccurs" attribute
     */
    boolean isSetMinOccurs();
    
    /**
     * Sets the "minOccurs" attribute
     */
    void setMinOccurs(java.math.BigInteger minOccurs);
    
    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs);
    
    /**
     * Unsets the "minOccurs" attribute
     */
    void unsetMinOccurs();
    
    /**
     * Gets the "maxOccurs" attribute
     */
    java.lang.Object getMaxOccurs();
    
    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    org.w3.x2001.xmlSchema.AllNNI xgetMaxOccurs();
    
    /**
     * True if has "maxOccurs" attribute
     */
    boolean isSetMaxOccurs();
    
    /**
     * Sets the "maxOccurs" attribute
     */
    void setMaxOccurs(java.lang.Object maxOccurs);
    
    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    void xsetMaxOccurs(org.w3.x2001.xmlSchema.AllNNI maxOccurs);
    
    /**
     * Unsets the "maxOccurs" attribute
     */
    void unsetMaxOccurs();
    
    /**
     * Gets the "default" attribute
     */
    java.lang.String getDefault();
    
    /**
     * Gets (as xml) the "default" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefault();
    
    /**
     * True if has "default" attribute
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" attribute
     */
    void setDefault(java.lang.String xdefault);
    
    /**
     * Sets (as xml) the "default" attribute
     */
    void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
    
    /**
     * Unsets the "default" attribute
     */
    void unsetDefault();
    
    /**
     * Gets the "fixed" attribute
     */
    java.lang.String getFixed();
    
    /**
     * Gets (as xml) the "fixed" attribute
     */
    org.apache.xmlbeans.XmlString xgetFixed();
    
    /**
     * True if has "fixed" attribute
     */
    boolean isSetFixed();
    
    /**
     * Sets the "fixed" attribute
     */
    void setFixed(java.lang.String fixed);
    
    /**
     * Sets (as xml) the "fixed" attribute
     */
    void xsetFixed(org.apache.xmlbeans.XmlString fixed);
    
    /**
     * Unsets the "fixed" attribute
     */
    void unsetFixed();
    
    /**
     * Gets the "nillable" attribute
     */
    boolean getNillable();
    
    /**
     * Gets (as xml) the "nillable" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNillable();
    
    /**
     * True if has "nillable" attribute
     */
    boolean isSetNillable();
    
    /**
     * Sets the "nillable" attribute
     */
    void setNillable(boolean nillable);
    
    /**
     * Sets (as xml) the "nillable" attribute
     */
    void xsetNillable(org.apache.xmlbeans.XmlBoolean nillable);
    
    /**
     * Unsets the "nillable" attribute
     */
    void unsetNillable();
    
    /**
     * Gets the "abstract" attribute
     */
    boolean getAbstract();
    
    /**
     * Gets (as xml) the "abstract" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAbstract();
    
    /**
     * True if has "abstract" attribute
     */
    boolean isSetAbstract();
    
    /**
     * Sets the "abstract" attribute
     */
    void setAbstract(boolean xabstract);
    
    /**
     * Sets (as xml) the "abstract" attribute
     */
    void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);
    
    /**
     * Unsets the "abstract" attribute
     */
    void unsetAbstract();
    
    /**
     * Gets the "final" attribute
     */
    java.lang.Object getFinal();
    
    /**
     * Gets (as xml) the "final" attribute
     */
    org.w3.x2001.xmlSchema.DerivationSet xgetFinal();
    
    /**
     * True if has "final" attribute
     */
    boolean isSetFinal();
    
    /**
     * Sets the "final" attribute
     */
    void setFinal(java.lang.Object xfinal);
    
    /**
     * Sets (as xml) the "final" attribute
     */
    void xsetFinal(org.w3.x2001.xmlSchema.DerivationSet xfinal);
    
    /**
     * Unsets the "final" attribute
     */
    void unsetFinal();
    
    /**
     * Gets the "block" attribute
     */
    java.lang.Object getBlock();
    
    /**
     * Gets (as xml) the "block" attribute
     */
    org.w3.x2001.xmlSchema.BlockSet xgetBlock();
    
    /**
     * True if has "block" attribute
     */
    boolean isSetBlock();
    
    /**
     * Sets the "block" attribute
     */
    void setBlock(java.lang.Object block);
    
    /**
     * Sets (as xml) the "block" attribute
     */
    void xsetBlock(org.w3.x2001.xmlSchema.BlockSet block);
    
    /**
     * Unsets the "block" attribute
     */
    void unsetBlock();
    
    /**
     * Gets the "form" attribute
     */
    org.w3.x2001.xmlSchema.FormChoice.Enum getForm();
    
    /**
     * Gets (as xml) the "form" attribute
     */
    org.w3.x2001.xmlSchema.FormChoice xgetForm();
    
    /**
     * True if has "form" attribute
     */
    boolean isSetForm();
    
    /**
     * Sets the "form" attribute
     */
    void setForm(org.w3.x2001.xmlSchema.FormChoice.Enum form);
    
    /**
     * Sets (as xml) the "form" attribute
     */
    void xsetForm(org.w3.x2001.xmlSchema.FormChoice form);
    
    /**
     * Unsets the "form" attribute
     */
    void unsetForm();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.w3.x2001.xmlSchema.Element newInstance() {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.w3.x2001.xmlSchema.Element newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.Element parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.Element parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Element parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.Element parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.Element parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.Element) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
