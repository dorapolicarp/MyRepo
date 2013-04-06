/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * A document containing one schema(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface SchemaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchemaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("schema0782doctype");
    
    /**
     * Gets the "schema" element
     */
    org.w3.x2001.xmlSchema.SchemaDocument.Schema getSchema();
    
    /**
     * Sets the "schema" element
     */
    void setSchema(org.w3.x2001.xmlSchema.SchemaDocument.Schema schema);
    
    /**
     * Appends and returns a new empty "schema" element
     */
    org.w3.x2001.xmlSchema.SchemaDocument.Schema addNewSchema();
    
    /**
     * An XML schema(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Schema extends org.w3.x2001.xmlSchema.OpenAttrs
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Schema.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("schemad77felemtype");
        
        /**
         * Gets array of all "include" elements
         */
        org.w3.x2001.xmlSchema.IncludeDocument.Include[] getIncludeArray();
        
        /**
         * Gets ith "include" element
         */
        org.w3.x2001.xmlSchema.IncludeDocument.Include getIncludeArray(int i);
        
        /**
         * Returns number of "include" element
         */
        int sizeOfIncludeArray();
        
        /**
         * Sets array of all "include" element
         */
        void setIncludeArray(org.w3.x2001.xmlSchema.IncludeDocument.Include[] includeArray);
        
        /**
         * Sets ith "include" element
         */
        void setIncludeArray(int i, org.w3.x2001.xmlSchema.IncludeDocument.Include include);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        org.w3.x2001.xmlSchema.IncludeDocument.Include insertNewInclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        org.w3.x2001.xmlSchema.IncludeDocument.Include addNewInclude();
        
        /**
         * Removes the ith "include" element
         */
        void removeInclude(int i);
        
        /**
         * Gets array of all "import" elements
         */
        org.w3.x2001.xmlSchema.ImportDocument.Import[] getImportArray();
        
        /**
         * Gets ith "import" element
         */
        org.w3.x2001.xmlSchema.ImportDocument.Import getImportArray(int i);
        
        /**
         * Returns number of "import" element
         */
        int sizeOfImportArray();
        
        /**
         * Sets array of all "import" element
         */
        void setImportArray(org.w3.x2001.xmlSchema.ImportDocument.Import[] ximportArray);
        
        /**
         * Sets ith "import" element
         */
        void setImportArray(int i, org.w3.x2001.xmlSchema.ImportDocument.Import ximport);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        org.w3.x2001.xmlSchema.ImportDocument.Import insertNewImport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        org.w3.x2001.xmlSchema.ImportDocument.Import addNewImport();
        
        /**
         * Removes the ith "import" element
         */
        void removeImport(int i);
        
        /**
         * Gets array of all "redefine" elements
         */
        org.w3.x2001.xmlSchema.RedefineDocument.Redefine[] getRedefineArray();
        
        /**
         * Gets ith "redefine" element
         */
        org.w3.x2001.xmlSchema.RedefineDocument.Redefine getRedefineArray(int i);
        
        /**
         * Returns number of "redefine" element
         */
        int sizeOfRedefineArray();
        
        /**
         * Sets array of all "redefine" element
         */
        void setRedefineArray(org.w3.x2001.xmlSchema.RedefineDocument.Redefine[] redefineArray);
        
        /**
         * Sets ith "redefine" element
         */
        void setRedefineArray(int i, org.w3.x2001.xmlSchema.RedefineDocument.Redefine redefine);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "redefine" element
         */
        org.w3.x2001.xmlSchema.RedefineDocument.Redefine insertNewRedefine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "redefine" element
         */
        org.w3.x2001.xmlSchema.RedefineDocument.Redefine addNewRedefine();
        
        /**
         * Removes the ith "redefine" element
         */
        void removeRedefine(int i);
        
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
         * Gets array of all "element" elements
         */
        org.w3.x2001.xmlSchema.TopLevelElement[] getElementArray();
        
        /**
         * Gets ith "element" element
         */
        org.w3.x2001.xmlSchema.TopLevelElement getElementArray(int i);
        
        /**
         * Returns number of "element" element
         */
        int sizeOfElementArray();
        
        /**
         * Sets array of all "element" element
         */
        void setElementArray(org.w3.x2001.xmlSchema.TopLevelElement[] elementArray);
        
        /**
         * Sets ith "element" element
         */
        void setElementArray(int i, org.w3.x2001.xmlSchema.TopLevelElement element);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "element" element
         */
        org.w3.x2001.xmlSchema.TopLevelElement insertNewElement(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "element" element
         */
        org.w3.x2001.xmlSchema.TopLevelElement addNewElement();
        
        /**
         * Removes the ith "element" element
         */
        void removeElement(int i);
        
        /**
         * Gets array of all "attribute" elements
         */
        org.w3.x2001.xmlSchema.TopLevelAttribute[] getAttributeArray();
        
        /**
         * Gets ith "attribute" element
         */
        org.w3.x2001.xmlSchema.TopLevelAttribute getAttributeArray(int i);
        
        /**
         * Returns number of "attribute" element
         */
        int sizeOfAttributeArray();
        
        /**
         * Sets array of all "attribute" element
         */
        void setAttributeArray(org.w3.x2001.xmlSchema.TopLevelAttribute[] attributeArray);
        
        /**
         * Sets ith "attribute" element
         */
        void setAttributeArray(int i, org.w3.x2001.xmlSchema.TopLevelAttribute attribute);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attribute" element
         */
        org.w3.x2001.xmlSchema.TopLevelAttribute insertNewAttribute(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attribute" element
         */
        org.w3.x2001.xmlSchema.TopLevelAttribute addNewAttribute();
        
        /**
         * Removes the ith "attribute" element
         */
        void removeAttribute(int i);
        
        /**
         * Gets array of all "notation" elements
         */
        org.w3.x2001.xmlSchema.NotationDocument.Notation[] getNotationArray();
        
        /**
         * Gets ith "notation" element
         */
        org.w3.x2001.xmlSchema.NotationDocument.Notation getNotationArray(int i);
        
        /**
         * Returns number of "notation" element
         */
        int sizeOfNotationArray();
        
        /**
         * Sets array of all "notation" element
         */
        void setNotationArray(org.w3.x2001.xmlSchema.NotationDocument.Notation[] notationArray);
        
        /**
         * Sets ith "notation" element
         */
        void setNotationArray(int i, org.w3.x2001.xmlSchema.NotationDocument.Notation notation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "notation" element
         */
        org.w3.x2001.xmlSchema.NotationDocument.Notation insertNewNotation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "notation" element
         */
        org.w3.x2001.xmlSchema.NotationDocument.Notation addNewNotation();
        
        /**
         * Removes the ith "notation" element
         */
        void removeNotation(int i);
        
        /**
         * Gets the "targetNamespace" attribute
         */
        java.lang.String getTargetNamespace();
        
        /**
         * Gets (as xml) the "targetNamespace" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace();
        
        /**
         * True if has "targetNamespace" attribute
         */
        boolean isSetTargetNamespace();
        
        /**
         * Sets the "targetNamespace" attribute
         */
        void setTargetNamespace(java.lang.String targetNamespace);
        
        /**
         * Sets (as xml) the "targetNamespace" attribute
         */
        void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace);
        
        /**
         * Unsets the "targetNamespace" attribute
         */
        void unsetTargetNamespace();
        
        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlToken xgetVersion();
        
        /**
         * True if has "version" attribute
         */
        boolean isSetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlToken version);
        
        /**
         * Unsets the "version" attribute
         */
        void unsetVersion();
        
        /**
         * Gets the "finalDefault" attribute
         */
        java.lang.Object getFinalDefault();
        
        /**
         * Gets (as xml) the "finalDefault" attribute
         */
        org.w3.x2001.xmlSchema.FullDerivationSet xgetFinalDefault();
        
        /**
         * True if has "finalDefault" attribute
         */
        boolean isSetFinalDefault();
        
        /**
         * Sets the "finalDefault" attribute
         */
        void setFinalDefault(java.lang.Object finalDefault);
        
        /**
         * Sets (as xml) the "finalDefault" attribute
         */
        void xsetFinalDefault(org.w3.x2001.xmlSchema.FullDerivationSet finalDefault);
        
        /**
         * Unsets the "finalDefault" attribute
         */
        void unsetFinalDefault();
        
        /**
         * Gets the "blockDefault" attribute
         */
        java.lang.Object getBlockDefault();
        
        /**
         * Gets (as xml) the "blockDefault" attribute
         */
        org.w3.x2001.xmlSchema.BlockSet xgetBlockDefault();
        
        /**
         * True if has "blockDefault" attribute
         */
        boolean isSetBlockDefault();
        
        /**
         * Sets the "blockDefault" attribute
         */
        void setBlockDefault(java.lang.Object blockDefault);
        
        /**
         * Sets (as xml) the "blockDefault" attribute
         */
        void xsetBlockDefault(org.w3.x2001.xmlSchema.BlockSet blockDefault);
        
        /**
         * Unsets the "blockDefault" attribute
         */
        void unsetBlockDefault();
        
        /**
         * Gets the "attributeFormDefault" attribute
         */
        org.w3.x2001.xmlSchema.FormChoice.Enum getAttributeFormDefault();
        
        /**
         * Gets (as xml) the "attributeFormDefault" attribute
         */
        org.w3.x2001.xmlSchema.FormChoice xgetAttributeFormDefault();
        
        /**
         * True if has "attributeFormDefault" attribute
         */
        boolean isSetAttributeFormDefault();
        
        /**
         * Sets the "attributeFormDefault" attribute
         */
        void setAttributeFormDefault(org.w3.x2001.xmlSchema.FormChoice.Enum attributeFormDefault);
        
        /**
         * Sets (as xml) the "attributeFormDefault" attribute
         */
        void xsetAttributeFormDefault(org.w3.x2001.xmlSchema.FormChoice attributeFormDefault);
        
        /**
         * Unsets the "attributeFormDefault" attribute
         */
        void unsetAttributeFormDefault();
        
        /**
         * Gets the "elementFormDefault" attribute
         */
        org.w3.x2001.xmlSchema.FormChoice.Enum getElementFormDefault();
        
        /**
         * Gets (as xml) the "elementFormDefault" attribute
         */
        org.w3.x2001.xmlSchema.FormChoice xgetElementFormDefault();
        
        /**
         * True if has "elementFormDefault" attribute
         */
        boolean isSetElementFormDefault();
        
        /**
         * Sets the "elementFormDefault" attribute
         */
        void setElementFormDefault(org.w3.x2001.xmlSchema.FormChoice.Enum elementFormDefault);
        
        /**
         * Sets (as xml) the "elementFormDefault" attribute
         */
        void xsetElementFormDefault(org.w3.x2001.xmlSchema.FormChoice elementFormDefault);
        
        /**
         * Unsets the "elementFormDefault" attribute
         */
        void unsetElementFormDefault();
        
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
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.SchemaDocument.Schema newInstance() {
              return (org.w3.x2001.xmlSchema.SchemaDocument.Schema) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.SchemaDocument.Schema newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.SchemaDocument.Schema) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.SchemaDocument newInstance() {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.SchemaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.SchemaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
