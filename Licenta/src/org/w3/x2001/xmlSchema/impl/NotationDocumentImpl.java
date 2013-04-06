/*
 * An XML document type.
 * Localname: notation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.NotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one notation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class NotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.NotationDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTATION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "notation");
    
    
    /**
     * Gets the "notation" element
     */
    public org.w3.x2001.xmlSchema.NotationDocument.Notation getNotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NotationDocument.Notation target = null;
            target = (org.w3.x2001.xmlSchema.NotationDocument.Notation)get_store().find_element_user(NOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notation" element
     */
    public void setNotation(org.w3.x2001.xmlSchema.NotationDocument.Notation notation)
    {
        generatedSetterHelperImpl(notation, NOTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notation" element
     */
    public org.w3.x2001.xmlSchema.NotationDocument.Notation addNewNotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NotationDocument.Notation target = null;
            target = (org.w3.x2001.xmlSchema.NotationDocument.Notation)get_store().add_element_user(NOTATION$0);
            return target;
        }
    }
    /**
     * An XML notation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class NotationImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.NotationDocument.Notation
    {
        private static final long serialVersionUID = 1L;
        
        public NotationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PUBLIC$2 = 
            new javax.xml.namespace.QName("", "public");
        private static final javax.xml.namespace.QName SYSTEM$4 = 
            new javax.xml.namespace.QName("", "system");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlNCName xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNCName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "public" attribute
         */
        public java.lang.String getPublic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLIC$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "public" attribute
         */
        public org.w3.x2001.xmlSchema.Public xgetPublic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.Public target = null;
                target = (org.w3.x2001.xmlSchema.Public)get_store().find_attribute_user(PUBLIC$2);
                return target;
            }
        }
        
        /**
         * True if has "public" attribute
         */
        public boolean isSetPublic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLIC$2) != null;
            }
        }
        
        /**
         * Sets the "public" attribute
         */
        public void setPublic(java.lang.String xpublic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLIC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLIC$2);
                }
                target.setStringValue(xpublic);
            }
        }
        
        /**
         * Sets (as xml) the "public" attribute
         */
        public void xsetPublic(org.w3.x2001.xmlSchema.Public xpublic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.Public target = null;
                target = (org.w3.x2001.xmlSchema.Public)get_store().find_attribute_user(PUBLIC$2);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.Public)get_store().add_attribute_user(PUBLIC$2);
                }
                target.set(xpublic);
            }
        }
        
        /**
         * Unsets the "public" attribute
         */
        public void unsetPublic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLIC$2);
            }
        }
        
        /**
         * Gets the "system" attribute
         */
        public java.lang.String getSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "system" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SYSTEM$4);
                return target;
            }
        }
        
        /**
         * True if has "system" attribute
         */
        public boolean isSetSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYSTEM$4) != null;
            }
        }
        
        /**
         * Sets the "system" attribute
         */
        public void setSystem(java.lang.String system)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEM$4);
                }
                target.setStringValue(system);
            }
        }
        
        /**
         * Sets (as xml) the "system" attribute
         */
        public void xsetSystem(org.apache.xmlbeans.XmlAnyURI system)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SYSTEM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SYSTEM$4);
                }
                target.set(system);
            }
        }
        
        /**
         * Unsets the "system" attribute
         */
        public void unsetSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYSTEM$4);
            }
        }
    }
}
