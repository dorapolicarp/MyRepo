/*
 * An XML document type.
 * Localname: any
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AnyDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one any(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AnyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.AnyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "any");
    
    
    /**
     * Gets the "any" element
     */
    public org.w3.x2001.xmlSchema.AnyDocument.Any getAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.AnyDocument.Any target = null;
            target = (org.w3.x2001.xmlSchema.AnyDocument.Any)get_store().find_element_user(ANY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "any" element
     */
    public void setAny(org.w3.x2001.xmlSchema.AnyDocument.Any any)
    {
        generatedSetterHelperImpl(any, ANY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "any" element
     */
    public org.w3.x2001.xmlSchema.AnyDocument.Any addNewAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.AnyDocument.Any target = null;
            target = (org.w3.x2001.xmlSchema.AnyDocument.Any)get_store().add_element_user(ANY$0);
            return target;
        }
    }
    /**
     * An XML any(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class AnyImpl extends org.w3.x2001.xmlSchema.impl.WildcardImpl implements org.w3.x2001.xmlSchema.AnyDocument.Any
    {
        private static final long serialVersionUID = 1L;
        
        public AnyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MINOCCURS$0 = 
            new javax.xml.namespace.QName("", "minOccurs");
        private static final javax.xml.namespace.QName MAXOCCURS$2 = 
            new javax.xml.namespace.QName("", "maxOccurs");
        
        
        /**
         * Gets the "minOccurs" attribute
         */
        public java.math.BigInteger getMinOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINOCCURS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINOCCURS$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "minOccurs" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MINOCCURS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(MINOCCURS$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "minOccurs" attribute
         */
        public boolean isSetMinOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MINOCCURS$0) != null;
            }
        }
        
        /**
         * Sets the "minOccurs" attribute
         */
        public void setMinOccurs(java.math.BigInteger minOccurs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINOCCURS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINOCCURS$0);
                }
                target.setBigIntegerValue(minOccurs);
            }
        }
        
        /**
         * Sets (as xml) the "minOccurs" attribute
         */
        public void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MINOCCURS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(MINOCCURS$0);
                }
                target.set(minOccurs);
            }
        }
        
        /**
         * Unsets the "minOccurs" attribute
         */
        public void unsetMinOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MINOCCURS$0);
            }
        }
        
        /**
         * Gets the "maxOccurs" attribute
         */
        public java.lang.Object getMaxOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXOCCURS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXOCCURS$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxOccurs" attribute
         */
        public org.w3.x2001.xmlSchema.AllNNI xgetMaxOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AllNNI target = null;
                target = (org.w3.x2001.xmlSchema.AllNNI)get_store().find_attribute_user(MAXOCCURS$2);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.AllNNI)get_default_attribute_value(MAXOCCURS$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "maxOccurs" attribute
         */
        public boolean isSetMaxOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAXOCCURS$2) != null;
            }
        }
        
        /**
         * Sets the "maxOccurs" attribute
         */
        public void setMaxOccurs(java.lang.Object maxOccurs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXOCCURS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXOCCURS$2);
                }
                target.setObjectValue(maxOccurs);
            }
        }
        
        /**
         * Sets (as xml) the "maxOccurs" attribute
         */
        public void xsetMaxOccurs(org.w3.x2001.xmlSchema.AllNNI maxOccurs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AllNNI target = null;
                target = (org.w3.x2001.xmlSchema.AllNNI)get_store().find_attribute_user(MAXOCCURS$2);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.AllNNI)get_store().add_attribute_user(MAXOCCURS$2);
                }
                target.set(maxOccurs);
            }
        }
        
        /**
         * Unsets the "maxOccurs" attribute
         */
        public void unsetMaxOccurs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAXOCCURS$2);
            }
        }
    }
}
