/*
 * XML Type:  attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Attribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * An XML attribute(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Attribute extends org.w3.x2001.xmlSchema.Annotated
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("attribute83a9type");
    
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
     * Gets the "use" attribute
     */
    org.w3.x2001.xmlSchema.Attribute.Use.Enum getUse();
    
    /**
     * Gets (as xml) the "use" attribute
     */
    org.w3.x2001.xmlSchema.Attribute.Use xgetUse();
    
    /**
     * True if has "use" attribute
     */
    boolean isSetUse();
    
    /**
     * Sets the "use" attribute
     */
    void setUse(org.w3.x2001.xmlSchema.Attribute.Use.Enum use);
    
    /**
     * Sets (as xml) the "use" attribute
     */
    void xsetUse(org.w3.x2001.xmlSchema.Attribute.Use use);
    
    /**
     * Unsets the "use" attribute
     */
    void unsetUse();
    
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
     * An XML use(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.Attribute$Use.
     */
    public interface Use extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Use.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("usea41aattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum PROHIBITED = Enum.forString("prohibited");
        static final Enum OPTIONAL = Enum.forString("optional");
        static final Enum REQUIRED = Enum.forString("required");
        
        static final int INT_PROHIBITED = Enum.INT_PROHIBITED;
        static final int INT_OPTIONAL = Enum.INT_OPTIONAL;
        static final int INT_REQUIRED = Enum.INT_REQUIRED;
        
        /**
         * Enumeration value class for org.w3.x2001.xmlSchema.Attribute$Use.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_PROHIBITED
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_PROHIBITED = 1;
            static final int INT_OPTIONAL = 2;
            static final int INT_REQUIRED = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("prohibited", INT_PROHIBITED),
                    new Enum("optional", INT_OPTIONAL),
                    new Enum("required", INT_REQUIRED),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.Attribute.Use newValue(java.lang.Object obj) {
              return (org.w3.x2001.xmlSchema.Attribute.Use) type.newValue( obj ); }
            
            public static org.w3.x2001.xmlSchema.Attribute.Use newInstance() {
              return (org.w3.x2001.xmlSchema.Attribute.Use) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.Attribute.Use newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.Attribute.Use) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.Attribute newInstance() {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.Attribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.Attribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.Attribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.Attribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.Attribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.Attribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
