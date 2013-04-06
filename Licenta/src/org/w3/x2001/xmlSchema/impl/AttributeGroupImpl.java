/*
 * XML Type:  attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AttributeGroup
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML attributeGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class AttributeGroupImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.AttributeGroup
{
    private static final long serialVersionUID = 1L;
    
    public AttributeGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attribute");
    private static final javax.xml.namespace.QName ATTRIBUTEGROUP$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    private static final javax.xml.namespace.QName ANYATTRIBUTE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName REF$8 = 
        new javax.xml.namespace.QName("", "ref");
    
    
    /**
     * Gets array of all "attribute" elements
     */
    public org.w3.x2001.xmlSchema.Attribute[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$0, targetList);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
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
            return get_store().count_elements(ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.w3.x2001.xmlSchema.Attribute[] attributeArray)
    {
        check_orphaned();
        arraySetterHelper(attributeArray, ATTRIBUTE$0);
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.w3.x2001.xmlSchema.Attribute attribute)
    {
        generatedSetterHelperImpl(attribute, ATTRIBUTE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().insert_element_user(ATTRIBUTE$0, i);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().add_element_user(ATTRIBUTE$0);
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
            get_store().remove_element(ATTRIBUTE$0, i);
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
            get_store().find_all_element_users(ATTRIBUTEGROUP$2, targetList);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().find_element_user(ATTRIBUTEGROUP$2, i);
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
            return get_store().count_elements(ATTRIBUTEGROUP$2);
        }
    }
    
    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.w3.x2001.xmlSchema.AttributeGroupRef[] attributeGroupArray)
    {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, ATTRIBUTEGROUP$2);
    }
    
    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.AttributeGroupRef attributeGroup)
    {
        generatedSetterHelperImpl(attributeGroup, ATTRIBUTEGROUP$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().insert_element_user(ATTRIBUTEGROUP$2, i);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().add_element_user(ATTRIBUTEGROUP$2);
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
            get_store().remove_element(ATTRIBUTEGROUP$2, i);
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
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().find_element_user(ANYATTRIBUTE$4, 0);
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
            return get_store().count_elements(ANYATTRIBUTE$4) != 0;
        }
    }
    
    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute)
    {
        generatedSetterHelperImpl(anyAttribute, ANYATTRIBUTE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().add_element_user(ANYATTRIBUTE$4);
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
            get_store().remove_element(ANYATTRIBUTE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$6);
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
            return get_store().find_attribute_user(NAME$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$6);
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
            get_store().remove_attribute(NAME$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$8);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$8);
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
            return get_store().find_attribute_user(REF$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$8);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(REF$8);
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
            get_store().remove_attribute(REF$8);
        }
    }
}
