/*
 * An XML document type.
 * Localname: include
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.IncludeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one include(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class IncludeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.IncludeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "include");
    
    
    /**
     * Gets the "include" element
     */
    public org.w3.x2001.xmlSchema.IncludeDocument.Include getInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.IncludeDocument.Include target = null;
            target = (org.w3.x2001.xmlSchema.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "include" element
     */
    public void setInclude(org.w3.x2001.xmlSchema.IncludeDocument.Include include)
    {
        generatedSetterHelperImpl(include, INCLUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "include" element
     */
    public org.w3.x2001.xmlSchema.IncludeDocument.Include addNewInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.IncludeDocument.Include target = null;
            target = (org.w3.x2001.xmlSchema.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
            return target;
        }
    }
    /**
     * An XML include(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class IncludeImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.IncludeDocument.Include
    {
        private static final long serialVersionUID = 1L;
        
        public IncludeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCHEMALOCATION$0 = 
            new javax.xml.namespace.QName("", "schemaLocation");
        
        
        /**
         * Gets the "schemaLocation" attribute
         */
        public java.lang.String getSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "schemaLocation" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMALOCATION$0);
                return target;
            }
        }
        
        /**
         * Sets the "schemaLocation" attribute
         */
        public void setSchemaLocation(java.lang.String schemaLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMALOCATION$0);
                }
                target.setStringValue(schemaLocation);
            }
        }
        
        /**
         * Sets (as xml) the "schemaLocation" attribute
         */
        public void xsetSchemaLocation(org.apache.xmlbeans.XmlAnyURI schemaLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMALOCATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SCHEMALOCATION$0);
                }
                target.set(schemaLocation);
            }
        }
    }
}
