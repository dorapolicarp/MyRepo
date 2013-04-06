/*
 * An XML document type.
 * Localname: keyref
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.KeyrefDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one keyref(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class KeyrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.KeyrefDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyrefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYREF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "keyref");
    
    
    /**
     * Gets the "keyref" element
     */
    public org.w3.x2001.xmlSchema.KeyrefDocument.Keyref getKeyref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.KeyrefDocument.Keyref target = null;
            target = (org.w3.x2001.xmlSchema.KeyrefDocument.Keyref)get_store().find_element_user(KEYREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keyref" element
     */
    public void setKeyref(org.w3.x2001.xmlSchema.KeyrefDocument.Keyref keyref)
    {
        generatedSetterHelperImpl(keyref, KEYREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "keyref" element
     */
    public org.w3.x2001.xmlSchema.KeyrefDocument.Keyref addNewKeyref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.KeyrefDocument.Keyref target = null;
            target = (org.w3.x2001.xmlSchema.KeyrefDocument.Keyref)get_store().add_element_user(KEYREF$0);
            return target;
        }
    }
    /**
     * An XML keyref(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class KeyrefImpl extends org.w3.x2001.xmlSchema.impl.KeybaseImpl implements org.w3.x2001.xmlSchema.KeyrefDocument.Keyref
    {
        private static final long serialVersionUID = 1L;
        
        public KeyrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFER$0 = 
            new javax.xml.namespace.QName("", "refer");
        
        
        /**
         * Gets the "refer" attribute
         */
        public javax.xml.namespace.QName getRefer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "refer" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetRefer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REFER$0);
                return target;
            }
        }
        
        /**
         * Sets the "refer" attribute
         */
        public void setRefer(javax.xml.namespace.QName refer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFER$0);
                }
                target.setQNameValue(refer);
            }
        }
        
        /**
         * Sets (as xml) the "refer" attribute
         */
        public void xsetRefer(org.apache.xmlbeans.XmlQName refer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REFER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(REFER$0);
                }
                target.set(refer);
            }
        }
    }
}
