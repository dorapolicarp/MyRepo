/*
 * XML Type:  extensionType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ExtensionType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML extensionType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class ExtensionTypeImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.ExtensionType
{
    private static final long serialVersionUID = 1L;
    
    public ExtensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "group");
    private static final javax.xml.namespace.QName ALL$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "all");
    private static final javax.xml.namespace.QName CHOICE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "choice");
    private static final javax.xml.namespace.QName SEQUENCE$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "sequence");
    private static final javax.xml.namespace.QName ATTRIBUTE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attribute");
    private static final javax.xml.namespace.QName ATTRIBUTEGROUP$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    private static final javax.xml.namespace.QName ANYATTRIBUTE$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    private static final javax.xml.namespace.QName BASE$14 = 
        new javax.xml.namespace.QName("", "base");
    
    
    /**
     * Gets the "group" element
     */
    public org.w3.x2001.xmlSchema.GroupRef getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.GroupRef target = null;
            target = (org.w3.x2001.xmlSchema.GroupRef)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "group" element
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$0) != 0;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(org.w3.x2001.xmlSchema.GroupRef group)
    {
        generatedSetterHelperImpl(group, GROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public org.w3.x2001.xmlSchema.GroupRef addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.GroupRef target = null;
            target = (org.w3.x2001.xmlSchema.GroupRef)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "group" element
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$0, 0);
        }
    }
    
    /**
     * Gets the "all" element
     */
    public org.w3.x2001.xmlSchema.All getAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.All target = null;
            target = (org.w3.x2001.xmlSchema.All)get_store().find_element_user(ALL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "all" element
     */
    public boolean isSetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALL$2) != 0;
        }
    }
    
    /**
     * Sets the "all" element
     */
    public void setAll(org.w3.x2001.xmlSchema.All all)
    {
        generatedSetterHelperImpl(all, ALL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "all" element
     */
    public org.w3.x2001.xmlSchema.All addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.All target = null;
            target = (org.w3.x2001.xmlSchema.All)get_store().add_element_user(ALL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "all" element
     */
    public void unsetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALL$2, 0);
        }
    }
    
    /**
     * Gets the "choice" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup getChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(CHOICE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "choice" element
     */
    public boolean isSetChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHOICE$4) != 0;
        }
    }
    
    /**
     * Sets the "choice" element
     */
    public void setChoice(org.w3.x2001.xmlSchema.ExplicitGroup choice)
    {
        generatedSetterHelperImpl(choice, CHOICE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "choice" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup addNewChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(CHOICE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "choice" element
     */
    public void unsetChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHOICE$4, 0);
        }
    }
    
    /**
     * Gets the "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup getSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(SEQUENCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sequence" element
     */
    public boolean isSetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCE$6) != 0;
        }
    }
    
    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.w3.x2001.xmlSchema.ExplicitGroup sequence)
    {
        generatedSetterHelperImpl(sequence, SEQUENCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup addNewSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(SEQUENCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sequence" element
     */
    public void unsetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCE$6, 0);
        }
    }
    
    /**
     * Gets array of all "attribute" elements
     */
    public org.w3.x2001.xmlSchema.Attribute[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$8, targetList);
            org.w3.x2001.xmlSchema.Attribute[] result = new org.w3.x2001.xmlSchema.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attribute" element
     */
    public org.w3.x2001.xmlSchema.Attribute getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Attribute target = null;
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().find_element_user(ATTRIBUTE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$8);
        }
    }
    
    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.w3.x2001.xmlSchema.Attribute[] attributeArray)
    {
        check_orphaned();
        arraySetterHelper(attributeArray, ATTRIBUTE$8);
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.w3.x2001.xmlSchema.Attribute attribute)
    {
        generatedSetterHelperImpl(attribute, ATTRIBUTE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public org.w3.x2001.xmlSchema.Attribute insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Attribute target = null;
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().insert_element_user(ATTRIBUTE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public org.w3.x2001.xmlSchema.Attribute addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Attribute target = null;
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().add_element_user(ATTRIBUTE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$8, i);
        }
    }
    
    /**
     * Gets array of all "attributeGroup" elements
     */
    public org.w3.x2001.xmlSchema.AttributeGroupRef[] getAttributeGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEGROUP$10, targetList);
            org.w3.x2001.xmlSchema.AttributeGroupRef[] result = new org.w3.x2001.xmlSchema.AttributeGroupRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attributeGroup" element
     */
    public org.w3.x2001.xmlSchema.AttributeGroupRef getAttributeGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.AttributeGroupRef target = null;
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().find_element_user(ATTRIBUTEGROUP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attributeGroup" element
     */
    public int sizeOfAttributeGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEGROUP$10);
        }
    }
    
    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.w3.x2001.xmlSchema.AttributeGroupRef[] attributeGroupArray)
    {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, ATTRIBUTEGROUP$10);
    }
    
    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.AttributeGroupRef attributeGroup)
    {
        generatedSetterHelperImpl(attributeGroup, ATTRIBUTEGROUP$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    public org.w3.x2001.xmlSchema.AttributeGroupRef insertNewAttributeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.AttributeGroupRef target = null;
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().insert_element_user(ATTRIBUTEGROUP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    public org.w3.x2001.xmlSchema.AttributeGroupRef addNewAttributeGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.AttributeGroupRef target = null;
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().add_element_user(ATTRIBUTEGROUP$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "attributeGroup" element
     */
    public void removeAttributeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEGROUP$10, i);
        }
    }
    
    /**
     * Gets the "anyAttribute" element
     */
    public org.w3.x2001.xmlSchema.Wildcard getAnyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Wildcard target = null;
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().find_element_user(ANYATTRIBUTE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anyAttribute" element
     */
    public boolean isSetAnyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANYATTRIBUTE$12) != 0;
        }
    }
    
    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute)
    {
        generatedSetterHelperImpl(anyAttribute, ANYATTRIBUTE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.w3.x2001.xmlSchema.Wildcard addNewAnyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Wildcard target = null;
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().add_element_user(ANYATTRIBUTE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "anyAttribute" element
     */
    public void unsetAnyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANYATTRIBUTE$12, 0);
        }
    }
    
    /**
     * Gets the "base" attribute
     */
    public javax.xml.namespace.QName getBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$14);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "base" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BASE$14);
            return target;
        }
    }
    
    /**
     * Sets the "base" attribute
     */
    public void setBase(javax.xml.namespace.QName base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$14);
            }
            target.setQNameValue(base);
        }
    }
    
    /**
     * Sets (as xml) the "base" attribute
     */
    public void xsetBase(org.apache.xmlbeans.XmlQName base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BASE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(BASE$14);
            }
            target.set(base);
        }
    }
}
