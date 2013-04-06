/*
 * An XML document type.
 * Localname: field
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one field(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class FieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.FieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "field");
    
    
    /**
     * Gets the "field" element
     */
    public org.w3.x2001.xmlSchema.FieldDocument.Field getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FieldDocument.Field target = null;
            target = (org.w3.x2001.xmlSchema.FieldDocument.Field)get_store().find_element_user(FIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field" element
     */
    public void setField(org.w3.x2001.xmlSchema.FieldDocument.Field field)
    {
        generatedSetterHelperImpl(field, FIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field" element
     */
    public org.w3.x2001.xmlSchema.FieldDocument.Field addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FieldDocument.Field target = null;
            target = (org.w3.x2001.xmlSchema.FieldDocument.Field)get_store().add_element_user(FIELD$0);
            return target;
        }
    }
    /**
     * An XML field(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class FieldImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.FieldDocument.Field
    {
        private static final long serialVersionUID = 1L;
        
        public FieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName XPATH$0 = 
            new javax.xml.namespace.QName("", "xpath");
        
        
        /**
         * Gets the "xpath" attribute
         */
        public java.lang.String getXpath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XPATH$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "xpath" attribute
         */
        public org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath xgetXpath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath target = null;
                target = (org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath)get_store().find_attribute_user(XPATH$0);
                return target;
            }
        }
        
        /**
         * Sets the "xpath" attribute
         */
        public void setXpath(java.lang.String xpath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XPATH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XPATH$0);
                }
                target.setStringValue(xpath);
            }
        }
        
        /**
         * Sets (as xml) the "xpath" attribute
         */
        public void xsetXpath(org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath xpath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath target = null;
                target = (org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath)get_store().find_attribute_user(XPATH$0);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath)get_store().add_attribute_user(XPATH$0);
                }
                target.set(xpath);
            }
        }
        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.FieldDocument$Field$Xpath.
         */
        public static class XpathImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.w3.x2001.xmlSchema.FieldDocument.Field.Xpath
        {
            private static final long serialVersionUID = 1L;
            
            public XpathImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected XpathImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
