/*
 * XML Type:  facet
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Facet
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML facet(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class FacetImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.Facet
{
    private static final long serialVersionUID = 1L;
    
    public FacetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName FIXED$2 = 
        new javax.xml.namespace.QName("", "fixed");
    
    
    /**
     * Gets the "value" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
    {
        generatedSetterHelperImpl(value, VALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Gets the "fixed" attribute
     */
    public boolean getFixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIXED$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fixed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIXED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIXED$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "fixed" attribute
     */
    public boolean isSetFixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIXED$2) != null;
        }
    }
    
    /**
     * Sets the "fixed" attribute
     */
    public void setFixed(boolean fixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIXED$2);
            }
            target.setBooleanValue(fixed);
        }
    }
    
    /**
     * Sets (as xml) the "fixed" attribute
     */
    public void xsetFixed(org.apache.xmlbeans.XmlBoolean fixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIXED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIXED$2);
            }
            target.set(fixed);
        }
    }
    
    /**
     * Unsets the "fixed" attribute
     */
    public void unsetFixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIXED$2);
        }
    }
}
