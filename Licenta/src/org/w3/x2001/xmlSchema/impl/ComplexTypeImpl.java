/*
 * XML Type:  complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ComplexType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML complexType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class ComplexTypeImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.ComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLECONTENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleContent");
    private static final javax.xml.namespace.QName COMPLEXCONTENT$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexContent");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "group");
    private static final javax.xml.namespace.QName ALL$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "all");
    private static final javax.xml.namespace.QName CHOICE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "choice");
    private static final javax.xml.namespace.QName SEQUENCE$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "sequence");
    private static final javax.xml.namespace.QName ATTRIBUTE$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attribute");
    private static final javax.xml.namespace.QName ATTRIBUTEGROUP$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    private static final javax.xml.namespace.QName ANYATTRIBUTE$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    private static final javax.xml.namespace.QName NAME$18 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName MIXED$20 = 
        new javax.xml.namespace.QName("", "mixed");
    private static final javax.xml.namespace.QName ABSTRACT$22 = 
        new javax.xml.namespace.QName("", "abstract");
    private static final javax.xml.namespace.QName FINAL$24 = 
        new javax.xml.namespace.QName("", "final");
    private static final javax.xml.namespace.QName BLOCK$26 = 
        new javax.xml.namespace.QName("", "block");
    
    
    /**
     * Gets the "simpleContent" element
     */
    public org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent getSimpleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent target = null;
            target = (org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent)get_store().find_element_user(SIMPLECONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "simpleContent" element
     */
    public boolean isSetSimpleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIMPLECONTENT$0) != 0;
        }
    }
    
    /**
     * Sets the "simpleContent" element
     */
    public void setSimpleContent(org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent simpleContent)
    {
        generatedSetterHelperImpl(simpleContent, SIMPLECONTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simpleContent" element
     */
    public org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent addNewSimpleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent target = null;
            target = (org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent)get_store().add_element_user(SIMPLECONTENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "simpleContent" element
     */
    public void unsetSimpleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIMPLECONTENT$0, 0);
        }
    }
    
    /**
     * Gets the "complexContent" element
     */
    public org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent getComplexContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent target = null;
            target = (org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent)get_store().find_element_user(COMPLEXCONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complexContent" element
     */
    public boolean isSetComplexContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEXCONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "complexContent" element
     */
    public void setComplexContent(org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent complexContent)
    {
        generatedSetterHelperImpl(complexContent, COMPLEXCONTENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complexContent" element
     */
    public org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent addNewComplexContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent target = null;
            target = (org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent)get_store().add_element_user(COMPLEXCONTENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "complexContent" element
     */
    public void unsetComplexContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEXCONTENT$2, 0);
        }
    }
    
    /**
     * Gets the "group" element
     */
    public org.w3.x2001.xmlSchema.GroupRef getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.GroupRef target = null;
            target = (org.w3.x2001.xmlSchema.GroupRef)get_store().find_element_user(GROUP$4, 0);
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
            return get_store().count_elements(GROUP$4) != 0;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(org.w3.x2001.xmlSchema.GroupRef group)
    {
        generatedSetterHelperImpl(group, GROUP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.GroupRef)get_store().add_element_user(GROUP$4);
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
            get_store().remove_element(GROUP$4, 0);
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
            target = (org.w3.x2001.xmlSchema.All)get_store().find_element_user(ALL$6, 0);
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
            return get_store().count_elements(ALL$6) != 0;
        }
    }
    
    /**
     * Sets the "all" element
     */
    public void setAll(org.w3.x2001.xmlSchema.All all)
    {
        generatedSetterHelperImpl(all, ALL$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.All)get_store().add_element_user(ALL$6);
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
            get_store().remove_element(ALL$6, 0);
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
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(CHOICE$8, 0);
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
            return get_store().count_elements(CHOICE$8) != 0;
        }
    }
    
    /**
     * Sets the "choice" element
     */
    public void setChoice(org.w3.x2001.xmlSchema.ExplicitGroup choice)
    {
        generatedSetterHelperImpl(choice, CHOICE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(CHOICE$8);
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
            get_store().remove_element(CHOICE$8, 0);
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
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(SEQUENCE$10, 0);
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
            return get_store().count_elements(SEQUENCE$10) != 0;
        }
    }
    
    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.w3.x2001.xmlSchema.ExplicitGroup sequence)
    {
        generatedSetterHelperImpl(sequence, SEQUENCE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(SEQUENCE$10);
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
            get_store().remove_element(SEQUENCE$10, 0);
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
            get_store().find_all_element_users(ATTRIBUTE$12, targetList);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().find_element_user(ATTRIBUTE$12, i);
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
            return get_store().count_elements(ATTRIBUTE$12);
        }
    }
    
    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.w3.x2001.xmlSchema.Attribute[] attributeArray)
    {
        check_orphaned();
        arraySetterHelper(attributeArray, ATTRIBUTE$12);
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.w3.x2001.xmlSchema.Attribute attribute)
    {
        generatedSetterHelperImpl(attribute, ATTRIBUTE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().insert_element_user(ATTRIBUTE$12, i);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().add_element_user(ATTRIBUTE$12);
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
            get_store().remove_element(ATTRIBUTE$12, i);
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
            get_store().find_all_element_users(ATTRIBUTEGROUP$14, targetList);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().find_element_user(ATTRIBUTEGROUP$14, i);
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
            return get_store().count_elements(ATTRIBUTEGROUP$14);
        }
    }
    
    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.w3.x2001.xmlSchema.AttributeGroupRef[] attributeGroupArray)
    {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, ATTRIBUTEGROUP$14);
    }
    
    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.AttributeGroupRef attributeGroup)
    {
        generatedSetterHelperImpl(attributeGroup, ATTRIBUTEGROUP$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().insert_element_user(ATTRIBUTEGROUP$14, i);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().add_element_user(ATTRIBUTEGROUP$14);
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
            get_store().remove_element(ATTRIBUTEGROUP$14, i);
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
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().find_element_user(ANYATTRIBUTE$16, 0);
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
            return get_store().count_elements(ANYATTRIBUTE$16) != 0;
        }
    }
    
    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute)
    {
        generatedSetterHelperImpl(anyAttribute, ANYATTRIBUTE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().add_element_user(ANYATTRIBUTE$16);
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
            get_store().remove_element(ANYATTRIBUTE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$18);
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
            return get_store().find_attribute_user(NAME$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$18);
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
            get_store().remove_attribute(NAME$18);
        }
    }
    
    /**
     * Gets the "mixed" attribute
     */
    public boolean getMixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIXED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MIXED$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mixed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MIXED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MIXED$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "mixed" attribute
     */
    public boolean isSetMixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIXED$20) != null;
        }
    }
    
    /**
     * Sets the "mixed" attribute
     */
    public void setMixed(boolean mixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIXED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIXED$20);
            }
            target.setBooleanValue(mixed);
        }
    }
    
    /**
     * Sets (as xml) the "mixed" attribute
     */
    public void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MIXED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MIXED$20);
            }
            target.set(mixed);
        }
    }
    
    /**
     * Unsets the "mixed" attribute
     */
    public void unsetMixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIXED$20);
        }
    }
    
    /**
     * Gets the "abstract" attribute
     */
    public boolean getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "abstract" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "abstract" attribute
     */
    public boolean isSetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABSTRACT$22) != null;
        }
    }
    
    /**
     * Sets the "abstract" attribute
     */
    public void setAbstract(boolean xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$22);
            }
            target.setBooleanValue(xabstract);
        }
    }
    
    /**
     * Sets (as xml) the "abstract" attribute
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$22);
            }
            target.set(xabstract);
        }
    }
    
    /**
     * Unsets the "abstract" attribute
     */
    public void unsetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABSTRACT$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$24);
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
    public org.w3.x2001.xmlSchema.DerivationSet xgetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.DerivationSet target = null;
            target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().find_attribute_user(FINAL$24);
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
            return get_store().find_attribute_user(FINAL$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$24);
            }
            target.setObjectValue(xfinal);
        }
    }
    
    /**
     * Sets (as xml) the "final" attribute
     */
    public void xsetFinal(org.w3.x2001.xmlSchema.DerivationSet xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.DerivationSet target = null;
            target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().find_attribute_user(FINAL$24);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().add_attribute_user(FINAL$24);
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
            get_store().remove_attribute(FINAL$24);
        }
    }
    
    /**
     * Gets the "block" attribute
     */
    public java.lang.Object getBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCK$26);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "block" attribute
     */
    public org.w3.x2001.xmlSchema.DerivationSet xgetBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.DerivationSet target = null;
            target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().find_attribute_user(BLOCK$26);
            return target;
        }
    }
    
    /**
     * True if has "block" attribute
     */
    public boolean isSetBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLOCK$26) != null;
        }
    }
    
    /**
     * Sets the "block" attribute
     */
    public void setBlock(java.lang.Object block)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCK$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLOCK$26);
            }
            target.setObjectValue(block);
        }
    }
    
    /**
     * Sets (as xml) the "block" attribute
     */
    public void xsetBlock(org.w3.x2001.xmlSchema.DerivationSet block)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.DerivationSet target = null;
            target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().find_attribute_user(BLOCK$26);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().add_attribute_user(BLOCK$26);
            }
            target.set(block);
        }
    }
    
    /**
     * Unsets the "block" attribute
     */
    public void unsetBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLOCK$26);
        }
    }
}
