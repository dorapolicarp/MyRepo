/*
 * An XML document type.
 * Localname: selector
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one selector(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SelectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.SelectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SelectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTOR$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "selector");
    
    
    /**
     * Gets the "selector" element
     */
    public org.w3.x2001.xmlSchema.SelectorDocument.Selector getSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SelectorDocument.Selector target = null;
            target = (org.w3.x2001.xmlSchema.SelectorDocument.Selector)get_store().find_element_user(SELECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "selector" element
     */
    public void setSelector(org.w3.x2001.xmlSchema.SelectorDocument.Selector selector)
    {
        generatedSetterHelperImpl(selector, SELECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "selector" element
     */
    public org.w3.x2001.xmlSchema.SelectorDocument.Selector addNewSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SelectorDocument.Selector target = null;
            target = (org.w3.x2001.xmlSchema.SelectorDocument.Selector)get_store().add_element_user(SELECTOR$0);
            return target;
        }
    }
    /**
     * An XML selector(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class SelectorImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.SelectorDocument.Selector
    {
        private static final long serialVersionUID = 1L;
        
        public SelectorImpl(org.apache.xmlbeans.SchemaType sType)
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
        public org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath xgetXpath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath target = null;
                target = (org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath)get_store().find_attribute_user(XPATH$0);
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
        public void xsetXpath(org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath xpath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath target = null;
                target = (org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath)get_store().find_attribute_user(XPATH$0);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath)get_store().add_attribute_user(XPATH$0);
                }
                target.set(xpath);
            }
        }
        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.SelectorDocument$Selector$Xpath.
         */
        public static class XpathImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.w3.x2001.xmlSchema.SelectorDocument.Selector.Xpath
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
