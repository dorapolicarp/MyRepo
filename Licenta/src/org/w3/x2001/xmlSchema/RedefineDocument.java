/*
 * An XML document type.
 * Localname: redefine
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RedefineDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * A document containing one redefine(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface RedefineDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RedefineDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("redefine3f55doctype");
    
    /**
     * Gets the "redefine" element
     */
    org.w3.x2001.xmlSchema.RedefineDocument.Redefine getRedefine();
    
    /**
     * Sets the "redefine" element
     */
    void setRedefine(org.w3.x2001.xmlSchema.RedefineDocument.Redefine redefine);
    
    /**
     * Appends and returns a new empty "redefine" element
     */
    org.w3.x2001.xmlSchema.RedefineDocument.Redefine addNewRedefine();
    
    /**
     * An XML redefine(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Redefine extends org.w3.x2001.xmlSchema.OpenAttrs
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Redefine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("redefine9e9felemtype");
        
        /**
         * Gets array of all "annotation" elements
         */
        org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] getAnnotationArray();
        
        /**
         * Gets ith "annotation" element
         */
        org.w3.x2001.xmlSchema.AnnotationDocument.Annotation getAnnotationArray(int i);
        
        /**
         * Returns number of "annotation" element
         */
        int sizeOfAnnotationArray();
        
        /**
         * Sets array of all "annotation" element
         */
        void setAnnotationArray(org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] annotationArray);
        
        /**
         * Sets ith "annotation" element
         */
        void setAnnotationArray(int i, org.w3.x2001.xmlSchema.AnnotationDocument.Annotation annotation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        org.w3.x2001.xmlSchema.AnnotationDocument.Annotation insertNewAnnotation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        org.w3.x2001.xmlSchema.AnnotationDocument.Annotation addNewAnnotation();
        
        /**
         * Removes the ith "annotation" element
         */
        void removeAnnotation(int i);
        
        /**
         * Gets array of all "simpleType" elements
         */
        org.w3.x2001.xmlSchema.TopLevelSimpleType[] getSimpleTypeArray();
        
        /**
         * Gets ith "simpleType" element
         */
        org.w3.x2001.xmlSchema.TopLevelSimpleType getSimpleTypeArray(int i);
        
        /**
         * Returns number of "simpleType" element
         */
        int sizeOfSimpleTypeArray();
        
        /**
         * Sets array of all "simpleType" element
         */
        void setSimpleTypeArray(org.w3.x2001.xmlSchema.TopLevelSimpleType[] simpleTypeArray);
        
        /**
         * Sets ith "simpleType" element
         */
        void setSimpleTypeArray(int i, org.w3.x2001.xmlSchema.TopLevelSimpleType simpleType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        org.w3.x2001.xmlSchema.TopLevelSimpleType insertNewSimpleType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
         */
        org.w3.x2001.xmlSchema.TopLevelSimpleType addNewSimpleType();
        
        /**
         * Removes the ith "simpleType" element
         */
        void removeSimpleType(int i);
        
        /**
         * Gets array of all "complexType" elements
         */
        org.w3.x2001.xmlSchema.TopLevelComplexType[] getComplexTypeArray();
        
        /**
         * Gets ith "complexType" element
         */
        org.w3.x2001.xmlSchema.TopLevelComplexType getComplexTypeArray(int i);
        
        /**
         * Returns number of "complexType" element
         */
        int sizeOfComplexTypeArray();
        
        /**
         * Sets array of all "complexType" element
         */
        void setComplexTypeArray(org.w3.x2001.xmlSchema.TopLevelComplexType[] complexTypeArray);
        
        /**
         * Sets ith "complexType" element
         */
        void setComplexTypeArray(int i, org.w3.x2001.xmlSchema.TopLevelComplexType complexType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "complexType" element
         */
        org.w3.x2001.xmlSchema.TopLevelComplexType insertNewComplexType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "complexType" element
         */
        org.w3.x2001.xmlSchema.TopLevelComplexType addNewComplexType();
        
        /**
         * Removes the ith "complexType" element
         */
        void removeComplexType(int i);
        
        /**
         * Gets array of all "group" elements
         */
        org.w3.x2001.xmlSchema.NamedGroup[] getGroupArray();
        
        /**
         * Gets ith "group" element
         */
        org.w3.x2001.xmlSchema.NamedGroup getGroupArray(int i);
        
        /**
         * Returns number of "group" element
         */
        int sizeOfGroupArray();
        
        /**
         * Sets array of all "group" element
         */
        void setGroupArray(org.w3.x2001.xmlSchema.NamedGroup[] groupArray);
        
        /**
         * Sets ith "group" element
         */
        void setGroupArray(int i, org.w3.x2001.xmlSchema.NamedGroup group);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        org.w3.x2001.xmlSchema.NamedGroup insertNewGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "group" element
         */
        org.w3.x2001.xmlSchema.NamedGroup addNewGroup();
        
        /**
         * Removes the ith "group" element
         */
        void removeGroup(int i);
        
        /**
         * Gets array of all "attributeGroup" elements
         */
        org.w3.x2001.xmlSchema.NamedAttributeGroup[] getAttributeGroupArray();
        
        /**
         * Gets ith "attributeGroup" element
         */
        org.w3.x2001.xmlSchema.NamedAttributeGroup getAttributeGroupArray(int i);
        
        /**
         * Returns number of "attributeGroup" element
         */
        int sizeOfAttributeGroupArray();
        
        /**
         * Sets array of all "attributeGroup" element
         */
        void setAttributeGroupArray(org.w3.x2001.xmlSchema.NamedAttributeGroup[] attributeGroupArray);
        
        /**
         * Sets ith "attributeGroup" element
         */
        void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.NamedAttributeGroup attributeGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
         */
        org.w3.x2001.xmlSchema.NamedAttributeGroup insertNewAttributeGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
         */
        org.w3.x2001.xmlSchema.NamedAttributeGroup addNewAttributeGroup();
        
        /**
         * Removes the ith "attributeGroup" element
         */
        void removeAttributeGroup(int i);
        
        /**
         * Gets the "schemaLocation" attribute
         */
        java.lang.String getSchemaLocation();
        
        /**
         * Gets (as xml) the "schemaLocation" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetSchemaLocation();
        
        /**
         * Sets the "schemaLocation" attribute
         */
        void setSchemaLocation(java.lang.String schemaLocation);
        
        /**
         * Sets (as xml) the "schemaLocation" attribute
         */
        void xsetSchemaLocation(org.apache.xmlbeans.XmlAnyURI schemaLocation);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.RedefineDocument.Redefine newInstance() {
              return (org.w3.x2001.xmlSchema.RedefineDocument.Redefine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.RedefineDocument.Redefine newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.RedefineDocument.Redefine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.RedefineDocument newInstance() {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.RedefineDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.RedefineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
