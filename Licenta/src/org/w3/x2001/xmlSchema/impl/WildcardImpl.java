/*
 * XML Type:  wildcard
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Wildcard
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML wildcard(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class WildcardImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.Wildcard
{
    private static final long serialVersionUID = 1L;
    
    public WildcardImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMESPACE$0 = 
        new javax.xml.namespace.QName("", "namespace");
    private static final javax.xml.namespace.QName PROCESSCONTENTS$2 = 
        new javax.xml.namespace.QName("", "processContents");
    
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.Object getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAMESPACE$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.w3.x2001.xmlSchema.NamespaceList xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamespaceList target = null;
            target = (org.w3.x2001.xmlSchema.NamespaceList)get_store().find_attribute_user(NAMESPACE$0);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.NamespaceList)get_default_attribute_value(NAMESPACE$0);
            }
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
    public void setNamespace(java.lang.Object namespace)
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
            target.setObjectValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.w3.x2001.xmlSchema.NamespaceList namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamespaceList target = null;
            target = (org.w3.x2001.xmlSchema.NamespaceList)get_store().find_attribute_user(NAMESPACE$0);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.NamespaceList)get_store().add_attribute_user(NAMESPACE$0);
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
     * Gets the "processContents" attribute
     */
    public org.w3.x2001.xmlSchema.Wildcard.ProcessContents.Enum getProcessContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSCONTENTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROCESSCONTENTS$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.xmlSchema.Wildcard.ProcessContents.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "processContents" attribute
     */
    public org.w3.x2001.xmlSchema.Wildcard.ProcessContents xgetProcessContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Wildcard.ProcessContents target = null;
            target = (org.w3.x2001.xmlSchema.Wildcard.ProcessContents)get_store().find_attribute_user(PROCESSCONTENTS$2);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.Wildcard.ProcessContents)get_default_attribute_value(PROCESSCONTENTS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "processContents" attribute
     */
    public boolean isSetProcessContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROCESSCONTENTS$2) != null;
        }
    }
    
    /**
     * Sets the "processContents" attribute
     */
    public void setProcessContents(org.w3.x2001.xmlSchema.Wildcard.ProcessContents.Enum processContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSCONTENTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESSCONTENTS$2);
            }
            target.setEnumValue(processContents);
        }
    }
    
    /**
     * Sets (as xml) the "processContents" attribute
     */
    public void xsetProcessContents(org.w3.x2001.xmlSchema.Wildcard.ProcessContents processContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Wildcard.ProcessContents target = null;
            target = (org.w3.x2001.xmlSchema.Wildcard.ProcessContents)get_store().find_attribute_user(PROCESSCONTENTS$2);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.Wildcard.ProcessContents)get_store().add_attribute_user(PROCESSCONTENTS$2);
            }
            target.set(processContents);
        }
    }
    
    /**
     * Unsets the "processContents" attribute
     */
    public void unsetProcessContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROCESSCONTENTS$2);
        }
    }
    /**
     * An XML processContents(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.Wildcard$ProcessContents.
     */
    public static class ProcessContentsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.xmlSchema.Wildcard.ProcessContents
    {
        private static final long serialVersionUID = 1L;
        
        public ProcessContentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProcessContentsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
