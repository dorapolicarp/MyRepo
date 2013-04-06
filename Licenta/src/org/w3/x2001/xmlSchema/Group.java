/*
 * XML Type:  group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Group
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML group(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Group extends org.w3.x2001.xmlSchema.Annotated
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Group.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("group7ca6type");
    
    /**
     * Gets array of all "element" elements
     */
    org.w3.x2001.xmlSchema.LocalElement[] getElementArray();
    
    /**
     * Gets ith "element" element
     */
    org.w3.x2001.xmlSchema.LocalElement getElementArray(int i);
    
    /**
     * Returns number of "element" element
     */
    int sizeOfElementArray();
    
    /**
     * Sets array of all "element" element
     */
    void setElementArray(org.w3.x2001.xmlSchema.LocalElement[] elementArray);
    
    /**
     * Sets ith "element" element
     */
    void setElementArray(int i, org.w3.x2001.xmlSchema.LocalElement element);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    org.w3.x2001.xmlSchema.LocalElement insertNewElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    org.w3.x2001.xmlSchema.LocalElement addNewElement();
    
    /**
     * Removes the ith "element" element
     */
    void removeElement(int i);
    
    /**
     * Gets array of all "group" elements
     */
    org.w3.x2001.xmlSchema.GroupRef[] getGroupArray();
    
    /**
     * Gets ith "group" element
     */
    org.w3.x2001.xmlSchema.GroupRef getGroupArray(int i);
    
    /**
     * Returns number of "group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "group" element
     */
    void setGroupArray(org.w3.x2001.xmlSchema.GroupRef[] groupArray);
    
    /**
     * Sets ith "group" element
     */
    void setGroupArray(int i, org.w3.x2001.xmlSchema.GroupRef group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    org.w3.x2001.xmlSchema.GroupRef insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    org.w3.x2001.xmlSchema.GroupRef addNewGroup();
    
    /**
     * Removes the ith "group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets array of all "all" elements
     */
    org.w3.x2001.xmlSchema.All[] getAllArray();
    
    /**
     * Gets ith "all" element
     */
    org.w3.x2001.xmlSchema.All getAllArray(int i);
    
    /**
     * Returns number of "all" element
     */
    int sizeOfAllArray();
    
    /**
     * Sets array of all "all" element
     */
    void setAllArray(org.w3.x2001.xmlSchema.All[] allArray);
    
    /**
     * Sets ith "all" element
     */
    void setAllArray(int i, org.w3.x2001.xmlSchema.All all);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "all" element
     */
    org.w3.x2001.xmlSchema.All insertNewAll(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "all" element
     */
    org.w3.x2001.xmlSchema.All addNewAll();
    
    /**
     * Removes the ith "all" element
     */
    void removeAll(int i);
    
    /**
     * Gets array of all "choice" elements
     */
    org.w3.x2001.xmlSchema.ExplicitGroup[] getChoiceArray();
    
    /**
     * Gets ith "choice" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup getChoiceArray(int i);
    
    /**
     * Returns number of "choice" element
     */
    int sizeOfChoiceArray();
    
    /**
     * Sets array of all "choice" element
     */
    void setChoiceArray(org.w3.x2001.xmlSchema.ExplicitGroup[] choiceArray);
    
    /**
     * Sets ith "choice" element
     */
    void setChoiceArray(int i, org.w3.x2001.xmlSchema.ExplicitGroup choice);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup insertNewChoice(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup addNewChoice();
    
    /**
     * Removes the ith "choice" element
     */
    void removeChoice(int i);
    
    /**
     * Gets array of all "sequence" elements
     */
    org.w3.x2001.xmlSchema.ExplicitGroup[] getSequenceArray();
    
    /**
     * Gets ith "sequence" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup getSequenceArray(int i);
    
    /**
     * Returns number of "sequence" element
     */
    int sizeOfSequenceArray();
    
    /**
     * Sets array of all "sequence" element
     */
    void setSequenceArray(org.w3.x2001.xmlSchema.ExplicitGroup[] sequenceArray);
    
    /**
     * Sets ith "sequence" element
     */
    void setSequenceArray(int i, org.w3.x2001.xmlSchema.ExplicitGroup sequence);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sequence" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup insertNewSequence(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sequence" element
     */
    org.w3.x2001.xmlSchema.ExplicitGroup addNewSequence();
    
    /**
     * Removes the ith "sequence" element
     */
    void removeSequence(int i);
    
    /**
     * Gets array of all "any" elements
     */
    org.w3.x2001.xmlSchema.AnyDocument.Any[] getAnyArray();
    
    /**
     * Gets ith "any" element
     */
    org.w3.x2001.xmlSchema.AnyDocument.Any getAnyArray(int i);
    
    /**
     * Returns number of "any" element
     */
    int sizeOfAnyArray();
    
    /**
     * Sets array of all "any" element
     */
    void setAnyArray(org.w3.x2001.xmlSchema.AnyDocument.Any[] anyArray);
    
    /**
     * Sets ith "any" element
     */
    void setAnyArray(int i, org.w3.x2001.xmlSchema.AnyDocument.Any any);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "any" element
     */
    org.w3.x2001.xmlSchema.AnyDocument.Any insertNewAny(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "any" element
     */
    org.w3.x2001.xmlSchema.AnyDocument.Any addNewAny();
    
    /**
     * Removes the ith "any" element
     */
    void removeAny(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.w3.x2001.xmlSchema.Group newInstance() {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.w3.x2001.xmlSchema.Group newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.Group parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.Group parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Group parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.Group parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.Group parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
