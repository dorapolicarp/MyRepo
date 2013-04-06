/*
 * An XML document type.
 * Localname: list
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ListDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one list(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.ListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "list");
    
    
    /**
     * Gets the "list" element
     */
    public org.w3.x2001.xmlSchema.ListDocument.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ListDocument.List target = null;
            target = (org.w3.x2001.xmlSchema.ListDocument.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "list" element
     */
    public void setList(org.w3.x2001.xmlSchema.ListDocument.List list)
    {
        generatedSetterHelperImpl(list, LIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "list" element
     */
    public org.w3.x2001.xmlSchema.ListDocument.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ListDocument.List target = null;
            target = (org.w3.x2001.xmlSchema.ListDocument.List)get_store().add_element_user(LIST$0);
            return target;
        }
    }
    /**
     * An XML list(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class ListImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.ListDocument.List
    {
        private static final long serialVersionUID = 1L;
        
        public ListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLETYPE$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
        private static final javax.xml.namespace.QName ITEMTYPE$2 = 
            new javax.xml.namespace.QName("", "itemType");
        
        
        /**
         * Gets the "simpleType" element
         */
        public org.w3.x2001.xmlSchema.LocalSimpleType getSimpleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.LocalSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.LocalSimpleType)get_store().find_element_user(SIMPLETYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "simpleType" element
         */
        public boolean isSetSimpleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIMPLETYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "simpleType" element
         */
        public void setSimpleType(org.w3.x2001.xmlSchema.LocalSimpleType simpleType)
        {
            generatedSetterHelperImpl(simpleType, SIMPLETYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "simpleType" element
         */
        public org.w3.x2001.xmlSchema.LocalSimpleType addNewSimpleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.LocalSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.LocalSimpleType)get_store().add_element_user(SIMPLETYPE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "simpleType" element
         */
        public void unsetSimpleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIMPLETYPE$0, 0);
            }
        }
        
        /**
         * Gets the "itemType" attribute
         */
        public javax.xml.namespace.QName getItemType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMTYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "itemType" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetItemType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMTYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "itemType" attribute
         */
        public boolean isSetItemType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ITEMTYPE$2) != null;
            }
        }
        
        /**
         * Sets the "itemType" attribute
         */
        public void setItemType(javax.xml.namespace.QName itemType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMTYPE$2);
                }
                target.setQNameValue(itemType);
            }
        }
        
        /**
         * Sets (as xml) the "itemType" attribute
         */
        public void xsetItemType(org.apache.xmlbeans.XmlQName itemType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ITEMTYPE$2);
                }
                target.set(itemType);
            }
        }
        
        /**
         * Unsets the "itemType" attribute
         */
        public void unsetItemType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ITEMTYPE$2);
            }
        }
    }
}
