/*
 * XML Type:  simpleType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SimpleType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML simpleType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class SimpleTypeImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.SimpleType
{
    private static final long serialVersionUID = 1L;
    
    public SimpleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTRICTION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "restriction");
    private static final javax.xml.namespace.QName LIST$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "list");
    private static final javax.xml.namespace.QName UNION$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "union");
    private static final javax.xml.namespace.QName FINAL$6 = 
        new javax.xml.namespace.QName("", "final");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "restriction" element
     */
    public org.w3.x2001.xmlSchema.RestrictionDocument.Restriction getRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.RestrictionDocument.Restriction target = null;
            target = (org.w3.x2001.xmlSchema.RestrictionDocument.Restriction)get_store().find_element_user(RESTRICTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "restriction" element
     */
    public boolean isSetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICTION$0) != 0;
        }
    }
    
    /**
     * Sets the "restriction" element
     */
    public void setRestriction(org.w3.x2001.xmlSchema.RestrictionDocument.Restriction restriction)
    {
        generatedSetterHelperImpl(restriction, RESTRICTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "restriction" element
     */
    public org.w3.x2001.xmlSchema.RestrictionDocument.Restriction addNewRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.RestrictionDocument.Restriction target = null;
            target = (org.w3.x2001.xmlSchema.RestrictionDocument.Restriction)get_store().add_element_user(RESTRICTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "restriction" element
     */
    public void unsetRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICTION$0, 0);
        }
    }
    
    /**
     * Gets the "list" element
     */
    public org.w3.x2001.xmlSchema.ListDocument.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ListDocument.List target = null;
            target = (org.w3.x2001.xmlSchema.ListDocument.List)get_store().find_element_user(LIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "list" element
     */
    public boolean isSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$2) != 0;
        }
    }
    
    /**
     * Sets the "list" element
     */
    public void setList(org.w3.x2001.xmlSchema.ListDocument.List list)
    {
        generatedSetterHelperImpl(list, LIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.ListDocument.List)get_store().add_element_user(LIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "list" element
     */
    public void unsetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$2, 0);
        }
    }
    
    /**
     * Gets the "union" element
     */
    public org.w3.x2001.xmlSchema.UnionDocument.Union getUnion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.UnionDocument.Union target = null;
            target = (org.w3.x2001.xmlSchema.UnionDocument.Union)get_store().find_element_user(UNION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "union" element
     */
    public boolean isSetUnion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNION$4) != 0;
        }
    }
    
    /**
     * Sets the "union" element
     */
    public void setUnion(org.w3.x2001.xmlSchema.UnionDocument.Union union)
    {
        generatedSetterHelperImpl(union, UNION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "union" element
     */
    public org.w3.x2001.xmlSchema.UnionDocument.Union addNewUnion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.UnionDocument.Union target = null;
            target = (org.w3.x2001.xmlSchema.UnionDocument.Union)get_store().add_element_user(UNION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "union" element
     */
    public void unsetUnion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNION$4, 0);
        }
    }
    
    /**
     * Gets the "final" attribute
     */
    public java.lang.Object getFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "final" attribute
     */
    public org.w3.x2001.xmlSchema.SimpleDerivationSet xgetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SimpleDerivationSet target = null;
            target = (org.w3.x2001.xmlSchema.SimpleDerivationSet)get_store().find_attribute_user(FINAL$6);
            return target;
        }
    }
    
    /**
     * True if has "final" attribute
     */
    public boolean isSetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FINAL$6) != null;
        }
    }
    
    /**
     * Sets the "final" attribute
     */
    public void setFinal(java.lang.Object xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$6);
            }
            target.setObjectValue(xfinal);
        }
    }
    
    /**
     * Sets (as xml) the "final" attribute
     */
    public void xsetFinal(org.w3.x2001.xmlSchema.SimpleDerivationSet xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SimpleDerivationSet target = null;
            target = (org.w3.x2001.xmlSchema.SimpleDerivationSet)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.SimpleDerivationSet)get_store().add_attribute_user(FINAL$6);
            }
            target.set(xfinal);
        }
    }
    
    /**
     * Unsets the "final" attribute
     */
    public void unsetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FINAL$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$8);
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
            return get_store().find_attribute_user(NAME$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$8);
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
            get_store().remove_attribute(NAME$8);
        }
    }
}
