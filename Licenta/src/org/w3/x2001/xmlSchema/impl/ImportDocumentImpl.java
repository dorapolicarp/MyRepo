/*
 * An XML document type.
 * Localname: import
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ImportDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one import(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ImportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.ImportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "import");
    
    
    /**
     * Gets the "import" element
     */
    public org.w3.x2001.xmlSchema.ImportDocument.Import getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ImportDocument.Import target = null;
            target = (org.w3.x2001.xmlSchema.ImportDocument.Import)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "import" element
     */
    public void setImport(org.w3.x2001.xmlSchema.ImportDocument.Import ximport)
    {
        generatedSetterHelperImpl(ximport, IMPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "import" element
     */
    public org.w3.x2001.xmlSchema.ImportDocument.Import addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ImportDocument.Import target = null;
            target = (org.w3.x2001.xmlSchema.ImportDocument.Import)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    /**
     * An XML import(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class ImportImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.ImportDocument.Import
    {
        private static final long serialVersionUID = 1L;
        
        public ImportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMESPACE$0 = 
            new javax.xml.namespace.QName("", "namespace");
        private static final javax.xml.namespace.QName SCHEMALOCATION$2 = 
            new javax.xml.namespace.QName("", "schemaLocation");
        
        
        /**
         * Gets the "namespace" attribute
         */
        public java.lang.String getNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "namespace" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$0);
                return target;
            }
        }
        
        /**
         * True if has "namespace" attribute
         */
        public boolean isSetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAMESPACE$0) != null;
            }
        }
        
        /**
         * Sets the "namespace" attribute
         */
        public void setNamespace(java.lang.String namespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$0);
                }
                target.setStringValue(namespace);
            }
        }
        
        /**
         * Sets (as xml) the "namespace" attribute
         */
        public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$0);
                }
                target.set(namespace);
            }
        }
        
        /**
         * Unsets the "namespace" attribute
         */
        public void unsetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAMESPACE$0);
            }
        }
        
        /**
         * Gets the "schemaLocation" attribute
         */
        public java.lang.String getSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$2);
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
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMALOCATION$2);
                return target;
            }
        }
        
        /**
         * True if has "schemaLocation" attribute
         */
        public boolean isSetSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCHEMALOCATION$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMALOCATION$2);
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
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMALOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SCHEMALOCATION$2);
                }
                target.set(schemaLocation);
            }
        }
        
        /**
         * Unsets the "schemaLocation" attribute
         */
        public void unsetSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCHEMALOCATION$2);
            }
        }
    }
}
