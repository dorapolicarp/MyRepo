/*
 * An XML document type.
 * Localname: restriction
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RestrictionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema;


/**
 * A document containing one restriction(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface RestrictionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestrictionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("restriction0049doctype");
    
    /**
     * Gets the "restriction" element
     */
    org.w3.x2001.xmlSchema.RestrictionDocument.Restriction getRestriction();
    
    /**
     * Sets the "restriction" element
     */
    void setRestriction(org.w3.x2001.xmlSchema.RestrictionDocument.Restriction restriction);
    
    /**
     * Appends and returns a new empty "restriction" element
     */
    org.w3.x2001.xmlSchema.RestrictionDocument.Restriction addNewRestriction();
    
    /**
     * An XML restriction(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Restriction extends org.w3.x2001.xmlSchema.Annotated
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Restriction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s074985EFE4BCD563FC15DE11E5DA0167").resolveHandle("restrictionad11elemtype");
        
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
         * Gets array of all "minExclusive" elements
         */
        org.w3.x2001.xmlSchema.Facet[] getMinExclusiveArray();
        
        /**
         * Gets ith "minExclusive" element
         */
        org.w3.x2001.xmlSchema.Facet getMinExclusiveArray(int i);
        
        /**
         * Returns number of "minExclusive" element
         */
        int sizeOfMinExclusiveArray();
        
        /**
         * Sets array of all "minExclusive" element
         */
        void setMinExclusiveArray(org.w3.x2001.xmlSchema.Facet[] minExclusiveArray);
        
        /**
         * Sets ith "minExclusive" element
         */
        void setMinExclusiveArray(int i, org.w3.x2001.xmlSchema.Facet minExclusive);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "minExclusive" element
         */
        org.w3.x2001.xmlSchema.Facet insertNewMinExclusive(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "minExclusive" element
         */
        org.w3.x2001.xmlSchema.Facet addNewMinExclusive();
        
        /**
         * Removes the ith "minExclusive" element
         */
        void removeMinExclusive(int i);
        
        /**
         * Gets array of all "minInclusive" elements
         */
        org.w3.x2001.xmlSchema.Facet[] getMinInclusiveArray();
        
        /**
         * Gets ith "minInclusive" element
         */
        org.w3.x2001.xmlSchema.Facet getMinInclusiveArray(int i);
        
        /**
         * Returns number of "minInclusive" element
         */
        int sizeOfMinInclusiveArray();
        
        /**
         * Sets array of all "minInclusive" element
         */
        void setMinInclusiveArray(org.w3.x2001.xmlSchema.Facet[] minInclusiveArray);
        
        /**
         * Sets ith "minInclusive" element
         */
        void setMinInclusiveArray(int i, org.w3.x2001.xmlSchema.Facet minInclusive);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "minInclusive" element
         */
        org.w3.x2001.xmlSchema.Facet insertNewMinInclusive(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "minInclusive" element
         */
        org.w3.x2001.xmlSchema.Facet addNewMinInclusive();
        
        /**
         * Removes the ith "minInclusive" element
         */
        void removeMinInclusive(int i);
        
        /**
         * Gets array of all "maxExclusive" elements
         */
        org.w3.x2001.xmlSchema.Facet[] getMaxExclusiveArray();
        
        /**
         * Gets ith "maxExclusive" element
         */
        org.w3.x2001.xmlSchema.Facet getMaxExclusiveArray(int i);
        
        /**
         * Returns number of "maxExclusive" element
         */
        int sizeOfMaxExclusiveArray();
        
        /**
         * Sets array of all "maxExclusive" element
         */
        void setMaxExclusiveArray(org.w3.x2001.xmlSchema.Facet[] maxExclusiveArray);
        
        /**
         * Sets ith "maxExclusive" element
         */
        void setMaxExclusiveArray(int i, org.w3.x2001.xmlSchema.Facet maxExclusive);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "maxExclusive" element
         */
        org.w3.x2001.xmlSchema.Facet insertNewMaxExclusive(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "maxExclusive" element
         */
        org.w3.x2001.xmlSchema.Facet addNewMaxExclusive();
        
        /**
         * Removes the ith "maxExclusive" element
         */
        void removeMaxExclusive(int i);
        
        /**
         * Gets array of all "maxInclusive" elements
         */
        org.w3.x2001.xmlSchema.Facet[] getMaxInclusiveArray();
        
        /**
         * Gets ith "maxInclusive" element
         */
        org.w3.x2001.xmlSchema.Facet getMaxInclusiveArray(int i);
        
        /**
         * Returns number of "maxInclusive" element
         */
        int sizeOfMaxInclusiveArray();
        
        /**
         * Sets array of all "maxInclusive" element
         */
        void setMaxInclusiveArray(org.w3.x2001.xmlSchema.Facet[] maxInclusiveArray);
        
        /**
         * Sets ith "maxInclusive" element
         */
        void setMaxInclusiveArray(int i, org.w3.x2001.xmlSchema.Facet maxInclusive);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "maxInclusive" element
         */
        org.w3.x2001.xmlSchema.Facet insertNewMaxInclusive(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "maxInclusive" element
         */
        org.w3.x2001.xmlSchema.Facet addNewMaxInclusive();
        
        /**
         * Removes the ith "maxInclusive" element
         */
        void removeMaxInclusive(int i);
        
        /**
         * Gets array of all "totalDigits" elements
         */
        org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[] getTotalDigitsArray();
        
        /**
         * Gets ith "totalDigits" element
         */
        org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits getTotalDigitsArray(int i);
        
        /**
         * Returns number of "totalDigits" element
         */
        int sizeOfTotalDigitsArray();
        
        /**
         * Sets array of all "totalDigits" element
         */
        void setTotalDigitsArray(org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[] totalDigitsArray);
        
        /**
         * Sets ith "totalDigits" element
         */
        void setTotalDigitsArray(int i, org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits totalDigits);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "totalDigits" element
         */
        org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits insertNewTotalDigits(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "totalDigits" element
         */
        org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits addNewTotalDigits();
        
        /**
         * Removes the ith "totalDigits" element
         */
        void removeTotalDigits(int i);
        
        /**
         * Gets array of all "fractionDigits" elements
         */
        org.w3.x2001.xmlSchema.NumFacet[] getFractionDigitsArray();
        
        /**
         * Gets ith "fractionDigits" element
         */
        org.w3.x2001.xmlSchema.NumFacet getFractionDigitsArray(int i);
        
        /**
         * Returns number of "fractionDigits" element
         */
        int sizeOfFractionDigitsArray();
        
        /**
         * Sets array of all "fractionDigits" element
         */
        void setFractionDigitsArray(org.w3.x2001.xmlSchema.NumFacet[] fractionDigitsArray);
        
        /**
         * Sets ith "fractionDigits" element
         */
        void setFractionDigitsArray(int i, org.w3.x2001.xmlSchema.NumFacet fractionDigits);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fractionDigits" element
         */
        org.w3.x2001.xmlSchema.NumFacet insertNewFractionDigits(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fractionDigits" element
         */
        org.w3.x2001.xmlSchema.NumFacet addNewFractionDigits();
        
        /**
         * Removes the ith "fractionDigits" element
         */
        void removeFractionDigits(int i);
        
        /**
         * Gets array of all "length" elements
         */
        org.w3.x2001.xmlSchema.NumFacet[] getLengthArray();
        
        /**
         * Gets ith "length" element
         */
        org.w3.x2001.xmlSchema.NumFacet getLengthArray(int i);
        
        /**
         * Returns number of "length" element
         */
        int sizeOfLengthArray();
        
        /**
         * Sets array of all "length" element
         */
        void setLengthArray(org.w3.x2001.xmlSchema.NumFacet[] lengthArray);
        
        /**
         * Sets ith "length" element
         */
        void setLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet length);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "length" element
         */
        org.w3.x2001.xmlSchema.NumFacet insertNewLength(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "length" element
         */
        org.w3.x2001.xmlSchema.NumFacet addNewLength();
        
        /**
         * Removes the ith "length" element
         */
        void removeLength(int i);
        
        /**
         * Gets array of all "minLength" elements
         */
        org.w3.x2001.xmlSchema.NumFacet[] getMinLengthArray();
        
        /**
         * Gets ith "minLength" element
         */
        org.w3.x2001.xmlSchema.NumFacet getMinLengthArray(int i);
        
        /**
         * Returns number of "minLength" element
         */
        int sizeOfMinLengthArray();
        
        /**
         * Sets array of all "minLength" element
         */
        void setMinLengthArray(org.w3.x2001.xmlSchema.NumFacet[] minLengthArray);
        
        /**
         * Sets ith "minLength" element
         */
        void setMinLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet minLength);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "minLength" element
         */
        org.w3.x2001.xmlSchema.NumFacet insertNewMinLength(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "minLength" element
         */
        org.w3.x2001.xmlSchema.NumFacet addNewMinLength();
        
        /**
         * Removes the ith "minLength" element
         */
        void removeMinLength(int i);
        
        /**
         * Gets array of all "maxLength" elements
         */
        org.w3.x2001.xmlSchema.NumFacet[] getMaxLengthArray();
        
        /**
         * Gets ith "maxLength" element
         */
        org.w3.x2001.xmlSchema.NumFacet getMaxLengthArray(int i);
        
        /**
         * Returns number of "maxLength" element
         */
        int sizeOfMaxLengthArray();
        
        /**
         * Sets array of all "maxLength" element
         */
        void setMaxLengthArray(org.w3.x2001.xmlSchema.NumFacet[] maxLengthArray);
        
        /**
         * Sets ith "maxLength" element
         */
        void setMaxLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet maxLength);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "maxLength" element
         */
        org.w3.x2001.xmlSchema.NumFacet insertNewMaxLength(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "maxLength" element
         */
        org.w3.x2001.xmlSchema.NumFacet addNewMaxLength();
        
        /**
         * Removes the ith "maxLength" element
         */
        void removeMaxLength(int i);
        
        /**
         * Gets array of all "enumeration" elements
         */
        org.w3.x2001.xmlSchema.NoFixedFacet[] getEnumerationArray();
        
        /**
         * Gets ith "enumeration" element
         */
        org.w3.x2001.xmlSchema.NoFixedFacet getEnumerationArray(int i);
        
        /**
         * Returns number of "enumeration" element
         */
        int sizeOfEnumerationArray();
        
        /**
         * Sets array of all "enumeration" element
         */
        void setEnumerationArray(org.w3.x2001.xmlSchema.NoFixedFacet[] enumerationArray);
        
        /**
         * Sets ith "enumeration" element
         */
        void setEnumerationArray(int i, org.w3.x2001.xmlSchema.NoFixedFacet enumeration);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "enumeration" element
         */
        org.w3.x2001.xmlSchema.NoFixedFacet insertNewEnumeration(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "enumeration" element
         */
        org.w3.x2001.xmlSchema.NoFixedFacet addNewEnumeration();
        
        /**
         * Removes the ith "enumeration" element
         */
        void removeEnumeration(int i);
        
        /**
         * Gets array of all "whiteSpace" elements
         */
        org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[] getWhiteSpaceArray();
        
        /**
         * Gets ith "whiteSpace" element
         */
        org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace getWhiteSpaceArray(int i);
        
        /**
         * Returns number of "whiteSpace" element
         */
        int sizeOfWhiteSpaceArray();
        
        /**
         * Sets array of all "whiteSpace" element
         */
        void setWhiteSpaceArray(org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[] whiteSpaceArray);
        
        /**
         * Sets ith "whiteSpace" element
         */
        void setWhiteSpaceArray(int i, org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace whiteSpace);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "whiteSpace" element
         */
        org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace insertNewWhiteSpace(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "whiteSpace" element
         */
        org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace();
        
        /**
         * Removes the ith "whiteSpace" element
         */
        void removeWhiteSpace(int i);
        
        /**
         * Gets array of all "pattern" elements
         */
        org.w3.x2001.xmlSchema.PatternDocument.Pattern[] getPatternArray();
        
        /**
         * Gets ith "pattern" element
         */
        org.w3.x2001.xmlSchema.PatternDocument.Pattern getPatternArray(int i);
        
        /**
         * Returns number of "pattern" element
         */
        int sizeOfPatternArray();
        
        /**
         * Sets array of all "pattern" element
         */
        void setPatternArray(org.w3.x2001.xmlSchema.PatternDocument.Pattern[] patternArray);
        
        /**
         * Sets ith "pattern" element
         */
        void setPatternArray(int i, org.w3.x2001.xmlSchema.PatternDocument.Pattern pattern);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pattern" element
         */
        org.w3.x2001.xmlSchema.PatternDocument.Pattern insertNewPattern(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pattern" element
         */
        org.w3.x2001.xmlSchema.PatternDocument.Pattern addNewPattern();
        
        /**
         * Removes the ith "pattern" element
         */
        void removePattern(int i);
        
        /**
         * Gets the "base" attribute
         */
        javax.xml.namespace.QName getBase();
        
        /**
         * Gets (as xml) the "base" attribute
         */
        org.apache.xmlbeans.XmlQName xgetBase();
        
        /**
         * True if has "base" attribute
         */
        boolean isSetBase();
        
        /**
         * Sets the "base" attribute
         */
        void setBase(javax.xml.namespace.QName base);
        
        /**
         * Sets (as xml) the "base" attribute
         */
        void xsetBase(org.apache.xmlbeans.XmlQName base);
        
        /**
         * Unsets the "base" attribute
         */
        void unsetBase();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2001.xmlSchema.RestrictionDocument.Restriction newInstance() {
              return (org.w3.x2001.xmlSchema.RestrictionDocument.Restriction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.xmlSchema.RestrictionDocument.Restriction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.xmlSchema.RestrictionDocument.Restriction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.xmlSchema.RestrictionDocument newInstance() {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2001.xmlSchema.RestrictionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.xmlSchema.RestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
