/*
 * XML Type:  complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ComplexType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML complexType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface ComplexType extends org.w3.x2001.xmlSchema.Annotated
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("complextype5dbbtype");
    
    /**
     * Gets the "simpleContent" element
     */
    org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent getSimpleContent();
    
    /**
     * True if has "simpleContent" element
     */
    boolean isSetSimpleContent();
    
    /**
     * Sets the "simpleContent" element
     */
    void setSimpleContent(org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent simpleContent);
    
    /**
     * Appends and returns a new empty "simpleContent" element
     */
    org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent addNewSimpleContent();
    
    /**
     * Unsets the "simpleContent" element
     */
    void unsetSimpleContent();
    
    /**
     * Gets the "complexContent" element
     */
    org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent getComplexContent();
    
    /**
     * True if has "complexContent" element
     */
    boolean isSetComplexContent();
    
    /**
     * Sets the "complexContent" element
     */
    void setComplexContent(org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent complexContent);
    
    /**
     * Appends and returns a new empty "complexContent" element
     */
    org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent addNewComplexContent();
    
    /**
     * Unsets the "complexContent" element
     */
    void unsetComplexContent();
    
    /**
     * Gets the "group" element
     */
    org.w3.x2001.xmlSchema.GroupRef getGroup();
    
    /**
     * True if has "group" element
     */
    boolean isSetGroup();
    
    /**
     * Sets the "group" element
     */
    void setGroup(org.w3.x2001.xmlSchema.GroupRef group);
    
    /**
     * Appends and returns a new empty "group" element
     */
    org.w3.x2001.xmlSchema.GroupRef addNewGroup();
    
    /**
     * Unsets the "group" element
     */
    void unsetGroup();
    
    /**
     * Gets the "all" element
     */
    org.w3.x2001.xmlSchema.All getAll();
    
    /**
     * True if has "all" element
     */
    boolean isSetAll();
    
    /**
     * Sets the "all" element
     */
    void setAll(org.w3.x2001.xmlSchema.All all);
    
    /**
     * Appends and returns a new empty "all" element
     */
    org.w3.x2001.xmlSchema.All addNewAll();
    
    /**
     * Unsets the "all" element
     */
    void unsetAll();
    
    /**
     * Gets the "choice" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup getChoice();
    
    /**
     * True if has "choice" element
     */
    boolean isSetChoice();
    
    /**
     * Sets the "choice" element
     */
    void setChoice(org.w3.x2001.xmlSchema.ExplicitGroup choice);
    
    /**
     * Appends and returns a new empty "choice" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup addNewChoice();
    
    /**
     * Unsets the "choice" element
     */
    void unsetChoice();
    
    /**
     * Gets the "sequence" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup getSequence();
    
    /**
     * True if has "sequence" element
     */
    boolean isSetSequence();
    
    /**
     * Sets the "sequence" element
     */
    void setSequence(org.w3.x2001.xmlSchema.ExplicitGroup sequence);
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup addNewSequence();
    
    /**
     * Unsets the "sequence" element
     */
    void unsetSequence();
    
    /**
     * Gets array of all "attribute" elements
     */
    org.w3.x2001.xmlSchema.Attribute[] getAttributeArray();
    
    /**
     * Gets ith "attribute" element
     */
    org.w3.x2001.xmlSchema.Attribute getAttributeArray(int i);
    
    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();
    
    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(org.w3.x2001.xmlSchema.Attribute[] attributeArray);
    
    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, org.w3.x2001.xmlSchema.Attribute attribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    org.w3.x2001.xmlSchema.Attribute insertNewAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    org.w3.x2001.xmlSchema.Attribute addNewAttribute();
    
    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);
    
    /**
     * Gets array of all "attributeGroup" elements
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef[] getAttributeGroupArray();
    
    /**
     * Gets ith "attributeGroup" element
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef getAttributeGroupArray(int i);
    
    /**
     * Returns number of "attributeGroup" element
     */
    int sizeOfAttributeGroupArray();
    
    /**
     * Sets array of all "attributeGroup" element
     */
    void setAttributeGroupArray(org.w3.x2001.xmlSchema.AttributeGroupRef[] attributeGroupArray);
    
    /**
     * Sets ith "attributeGroup" element
     */
    void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.AttributeGroupRef attributeGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef insertNewAttributeGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    org.w3.x2001.xmlSchema.AttributeGroupRef addNewAttributeGroup();
    
    /**
     * Removes the ith "attributeGroup" element
     */
    void removeAttributeGroup(int i);
    
    /**
     * Gets the "anyAttribute" element
     */
    org.w3.x2001.xmlSchema.Wildcard getAnyAttribute();
    
    /**
     * True if has "anyAttribute" element
     */
    boolean isSetAnyAttribute();
    
    /**
     * Sets the "anyAttribute" element
     */
    void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute);
    
    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    org.w3.x2001.xmlSchema.Wildcard addNewAnyAttribute();
    
    /**
     * Unsets the "anyAttribute" element
     */
    void unsetAnyAttribute();
    
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
     * Gets the "mixed" attribute
     */
    boolean getMixed();
    
    /**
     * Gets (as xml) the "mixed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMixed();
    
    /**
     * True if has "mixed" attribute
     */
    boolean isSetMixed();
    
    /**
     * Sets the "mixed" attribute
     */
    void setMixed(boolean mixed);
    
    /**
     * Sets (as xml) the "mixed" attribute
     */
    void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed);
    
    /**
     * Unsets the "mixed" attribute
     */
    void unsetMixed();
    
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
    org.w3.x2001.xmlSchema.DerivationSet xgetBlock();
    
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
    void xsetBlock(org.w3.x2001.xmlSchema.DerivationSet block);
    
    /**
     * Unsets the "block" attribute
     */
    void unsetBlock();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.w3.x2001.xmlSchema.ComplexType newInstance() {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.w3.x2001.xmlSchema.ComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.ComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.ComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.ComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.ComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
