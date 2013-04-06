/*
 * An XML document type.
 * Localname: union
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.UnionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * A document containing one union(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface UnionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("union5866doctype");
    
    /**
     * Gets the "union" element
     */
    org.w3.x2001.xmlSchema.UnionDocument.Union getUnion();
    
    /**
     * Sets the "union" element
     */
    void setUnion(org.w3.x2001.xmlSchema.UnionDocument.Union union);
    
    /**
     * Appends and returns a new empty "union" element
     */
    org.w3.x2001.xmlSchema.UnionDocument.Union addNewUnion();
    
    /**
     * An XML union(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Union extends org.w3.x2001.xmlSchema.Annotated
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Union.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("union498belemtype");
        
        /**
         * Gets array of all "simpleType" elements
         */
        org.w3.x2001.xmlSchema.LocalSimpleType[] getSimpleTypeArray();
        
        /**
         * Gets ith "simpleType" element
         */
        org.w3.x2001.xmlSchema.LocalSimpleType getSimpleTypeArray(int i);
        
        /**
         * Returns number of "simpleType" element
         */
        int sizeOfSimpleTypeArray();
        
        /**
         * Sets array of all "simpleType" element
         */
        void setSimpleTypeArray(org.w3.x2001.xmlSchema.LocalSimpleType[] simpleTypeArray);
        
        /**
         * Sets ith "simpleType" element
         */
        void setSimpleTypeArray(int i, org.w3.x2001.xmlSchema.LocalSimpleType simpleType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        org.w3.x2001.xmlSchema.LocalSimpleType insertNewSimpleType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
         */
        org.w3.x2001.xmlSchema.LocalSimpleType addNewSimpleType();
        
        /**
         * Removes the ith "simpleType" element
         */
        void removeSimpleType(int i);
        
        /**
         * Gets the "memberTypes" attribute
         */
        java.util.List getMemberTypes();
        
        /**
         * Gets (as xml) the "memberTypes" attribute
         */
        org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes xgetMemberTypes();
        
        /**
         * True if has "memberTypes" attribute
         */
        boolean isSetMemberTypes();
        
        /**
         * Sets the "memberTypes" attribute
         */
        void setMemberTypes(java.util.List memberTypes);
        
        /**
         * Sets (as xml) the "memberTypes" attribute
         */
        void xsetMemberTypes(org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes memberTypes);
        
        /**
         * Unsets the "memberTypes" attribute
         */
        void unsetMemberTypes();
        
        /**
         * An XML memberTypes(@).
         *
         * This is a list type whose items are org.apache.xmlbeans.XmlQName.
         */
        public interface MemberTypes extends org.apache.xmlbeans.XmlAnySimpleType
        {
            java.util.List getListValue();
            java.util.List xgetListValue();
            void setListValue(java.util.List list);
            /** @deprecated */
            java.util.List listValue();
            /** @deprecated */
            java.util.List xlistValue();
            /** @deprecated */
            void set(java.util.List list);
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MemberTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("membertypes2404attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes newValue(java.lang.Object obj) {
                  return (org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes) type.newValue( obj ); }
                
                public static org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes newInstance() {
                  return (org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.UnionDocument.Union newInstance() {
              return (org.w3.x2001.xmlSchema.UnionDocument.Union) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.UnionDocument.Union newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.UnionDocument.Union) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.UnionDocument newInstance() {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.UnionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.UnionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.UnionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.UnionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
