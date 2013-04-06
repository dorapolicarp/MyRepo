/*
 * XML Type:  realGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RealGroup
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML realGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface RealGroup extends org.w3.x2001.xmlSchema.Group
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RealGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("realgroup1f64type");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.RealGroup newInstance() {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RealGroup parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.RealGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.RealGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.RealGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
