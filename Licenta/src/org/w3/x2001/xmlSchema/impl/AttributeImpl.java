/*
 * XML Type:  attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Attribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML attribute(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class AttributeImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.Attribute
{
    private static final long serialVersionUID = 1L;
    
    public AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLETYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName REF$4 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName USE$8 = 
        new javax.xml.namespace.QName("", "use");
    private static final javax.xml.namespace.QName DEFAULT$10 = 
        new javax.xml.namespace.QName("", "default");
    private static final javax.xml.namespace.QName FIXED$12 = 
        new javax.xml.namespace.QName("", "fixed");
    private static final javax.xml.namespace.QName FORM$14 = 
        new javax.xml.namespace.QName("", "form");
    
    
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
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public javax.xml.namespace.QName getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$4);
            return target;
        }
    }
    
    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REF$4) != null;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(javax.xml.namespace.QName ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
            }
            target.setQNameValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.apache.xmlbeans.XmlQName ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(REF$4);
            }
            target.set(ref);
        }
    }
    
    /**
     * Unsets the "ref" attribute
     */
    public void unsetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REF$4);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setQNameValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$6);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public org.w3.x2001.xmlSchema.Attribute.Use.Enum getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.xmlSchema.Attribute.Use.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public org.w3.x2001.xmlSchema.Attribute.Use xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Attribute.Use target = null;
            target = (org.w3.x2001.xmlSchema.Attribute.Use)get_store().find_attribute_user(USE$8);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.Attribute.Use)get_default_attribute_value(USE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "use" attribute
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USE$8) != null;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(org.w3.x2001.xmlSchema.Attribute.Use.Enum use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$8);
            }
            target.setEnumValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(org.w3.x2001.xmlSchema.Attribute.Use use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Attribute.Use target = null;
            target = (org.w3.x2001.xmlSchema.Attribute.Use)get_store().find_attribute_user(USE$8);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.Attribute.Use)get_store().add_attribute_user(USE$8);
            }
            target.set(use);
        }
    }
    
    /**
     * Unsets the "use" attribute
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USE$8);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$10);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$10) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$10);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$10);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$10);
        }
    }
    
    /**
     * Gets the "fixed" attribute
     */
    public java.lang.String getFixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fixed" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIXED$12);
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
            return get_store().find_attribute_user(FIXED$12) != null;
        }
    }
    
    /**
     * Sets the "fixed" attribute
     */
    public void setFixed(java.lang.String fixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIXED$12);
            }
            target.setStringValue(fixed);
        }
    }
    
    /**
     * Sets (as xml) the "fixed" attribute
     */
    public void xsetFixed(org.apache.xmlbeans.XmlString fixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIXED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIXED$12);
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
            get_store().remove_attribute(FIXED$12);
        }
    }
    
    /**
     * Gets the "form" attribute
     */
    public org.w3.x2001.xmlSchema.FormChoice.Enum getForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORM$14);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.xmlSchema.FormChoice.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "form" attribute
     */
    public org.w3.x2001.xmlSchema.FormChoice xgetForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FormChoice target = null;
            target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(FORM$14);
            return target;
        }
    }
    
    /**
     * True if has "form" attribute
     */
    public boolean isSetForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORM$14) != null;
        }
    }
    
    /**
     * Sets the "form" attribute
     */
    public void setForm(org.w3.x2001.xmlSchema.FormChoice.Enum form)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORM$14);
            }
            target.setEnumValue(form);
        }
    }
    
    /**
     * Sets (as xml) the "form" attribute
     */
    public void xsetForm(org.w3.x2001.xmlSchema.FormChoice form)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FormChoice target = null;
            target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(FORM$14);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.FormChoice)get_store().add_attribute_user(FORM$14);
            }
            target.set(form);
        }
    }
    
    /**
     * Unsets the "form" attribute
     */
    public void unsetForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORM$14);
        }
    }
    /**
     * An XML use(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.Attribute$Use.
     */
    public static class UseImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.xmlSchema.Attribute.Use
    {
        private static final long serialVersionUID = 1L;
        
        public UseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
