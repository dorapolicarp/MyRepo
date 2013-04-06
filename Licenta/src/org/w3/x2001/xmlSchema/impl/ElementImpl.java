/*
 * XML Type:  element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Element
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML element(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class ElementImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.Element
{
    private static final long serialVersionUID = 1L;
    
    public ElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLETYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
    private static final javax.xml.namespace.QName COMPLEXTYPE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexType");
    private static final javax.xml.namespace.QName UNIQUE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unique");
    private static final javax.xml.namespace.QName KEY$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "key");
    private static final javax.xml.namespace.QName KEYREF$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "keyref");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName REF$12 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName TYPE$14 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName SUBSTITUTIONGROUP$16 = 
        new javax.xml.namespace.QName("", "substitutionGroup");
    private static final javax.xml.namespace.QName MINOCCURS$18 = 
        new javax.xml.namespace.QName("", "minOccurs");
    private static final javax.xml.namespace.QName MAXOCCURS$20 = 
        new javax.xml.namespace.QName("", "maxOccurs");
    private static final javax.xml.namespace.QName DEFAULT$22 = 
        new javax.xml.namespace.QName("", "default");
    private static final javax.xml.namespace.QName FIXED$24 = 
        new javax.xml.namespace.QName("", "fixed");
    private static final javax.xml.namespace.QName NILLABLE$26 = 
        new javax.xml.namespace.QName("", "nillable");
    private static final javax.xml.namespace.QName ABSTRACT$28 = 
        new javax.xml.namespace.QName("", "abstract");
    private static final javax.xml.namespace.QName FINAL$30 = 
        new javax.xml.namespace.QName("", "final");
    private static final javax.xml.namespace.QName BLOCK$32 = 
        new javax.xml.namespace.QName("", "block");
    private static final javax.xml.namespace.QName FORM$34 = 
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
     * Gets the "complexType" element
     */
    public org.w3.x2001.xmlSchema.LocalComplexType getComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.LocalComplexType target = null;
            target = (org.w3.x2001.xmlSchema.LocalComplexType)get_store().find_element_user(COMPLEXTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complexType" element
     */
    public boolean isSetComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEXTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "complexType" element
     */
    public void setComplexType(org.w3.x2001.xmlSchema.LocalComplexType complexType)
    {
        generatedSetterHelperImpl(complexType, COMPLEXTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complexType" element
     */
    public org.w3.x2001.xmlSchema.LocalComplexType addNewComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.LocalComplexType target = null;
            target = (org.w3.x2001.xmlSchema.LocalComplexType)get_store().add_element_user(COMPLEXTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "complexType" element
     */
    public void unsetComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEXTYPE$2, 0);
        }
    }
    
    /**
     * Gets array of all "unique" elements
     */
    public org.w3.x2001.xmlSchema.Keybase[] getUniqueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNIQUE$4, targetList);
            org.w3.x2001.xmlSchema.Keybase[] result = new org.w3.x2001.xmlSchema.Keybase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unique" element
     */
    public org.w3.x2001.xmlSchema.Keybase getUniqueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().find_element_user(UNIQUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "unique" element
     */
    public int sizeOfUniqueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUE$4);
        }
    }
    
    /**
     * Sets array of all "unique" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUniqueArray(org.w3.x2001.xmlSchema.Keybase[] uniqueArray)
    {
        check_orphaned();
        arraySetterHelper(uniqueArray, UNIQUE$4);
    }
    
    /**
     * Sets ith "unique" element
     */
    public void setUniqueArray(int i, org.w3.x2001.xmlSchema.Keybase unique)
    {
        generatedSetterHelperImpl(unique, UNIQUE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unique" element
     */
    public org.w3.x2001.xmlSchema.Keybase insertNewUnique(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().insert_element_user(UNIQUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unique" element
     */
    public org.w3.x2001.xmlSchema.Keybase addNewUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().add_element_user(UNIQUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "unique" element
     */
    public void removeUnique(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUE$4, i);
        }
    }
    
    /**
     * Gets array of all "key" elements
     */
    public org.w3.x2001.xmlSchema.Keybase[] getKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEY$6, targetList);
            org.w3.x2001.xmlSchema.Keybase[] result = new org.w3.x2001.xmlSchema.Keybase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "key" element
     */
    public org.w3.x2001.xmlSchema.Keybase getKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().find_element_user(KEY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "key" element
     */
    public int sizeOfKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEY$6);
        }
    }
    
    /**
     * Sets array of all "key" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyArray(org.w3.x2001.xmlSchema.Keybase[] keyArray)
    {
        check_orphaned();
        arraySetterHelper(keyArray, KEY$6);
    }
    
    /**
     * Sets ith "key" element
     */
    public void setKeyArray(int i, org.w3.x2001.xmlSchema.Keybase key)
    {
        generatedSetterHelperImpl(key, KEY$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "key" element
     */
    public org.w3.x2001.xmlSchema.Keybase insertNewKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().insert_element_user(KEY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "key" element
     */
    public org.w3.x2001.xmlSchema.Keybase addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().add_element_user(KEY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "key" element
     */
    public void removeKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEY$6, i);
        }
    }
    
    /**
     * Gets array of all "keyref" elements
     */
    public org.w3.x2001.xmlSchema.KeyrefDocument.Keyref[] getKeyrefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYREF$8, targetList);
            org.w3.x2001.xmlSchema.KeyrefDocument.Keyref[] result = new org.w3.x2001.xmlSchema.KeyrefDocument.Keyref[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyref" element
     */
    public org.w3.x2001.xmlSchema.KeyrefDocument.Keyref getKeyrefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.KeyrefDocument.Keyref target = null;
            target = (org.w3.x2001.xmlSchema.KeyrefDocument.Keyref)get_store().find_element_user(KEYREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyref" element
     */
    public int sizeOfKeyrefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYREF$8);
        }
    }
    
    /**
     * Sets array of all "keyref" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyrefArray(org.w3.x2001.xmlSchema.KeyrefDocument.Keyref[] keyrefArray)
    {
        check_orphaned();
        arraySetterHelper(keyrefArray, KEYREF$8);
    }
    
    /**
     * Sets ith "keyref" element
     */
    public void setKeyrefArray(int i, org.w3.x2001.xmlSchema.KeyrefDocument.Keyref keyref)
    {
        generatedSetterHelperImpl(keyref, KEYREF$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyref" element
     */
    public org.w3.x2001.xmlSchema.KeyrefDocument.Keyref insertNewKeyref(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.KeyrefDocument.Keyref target = null;
            target = (org.w3.x2001.xmlSchema.KeyrefDocument.Keyref)get_store().insert_element_user(KEYREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyref" element
     */
    public org.w3.x2001.xmlSchema.KeyrefDocument.Keyref addNewKeyref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.KeyrefDocument.Keyref target = null;
            target = (org.w3.x2001.xmlSchema.KeyrefDocument.Keyref)get_store().add_element_user(KEYREF$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyref" element
     */
    public void removeKeyref(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYREF$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$10);
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
            return get_store().find_attribute_user(NAME$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$10);
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
            get_store().remove_attribute(NAME$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$12);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$12);
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
            return get_store().find_attribute_user(REF$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$12);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(REF$12);
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
            get_store().remove_attribute(REF$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$14);
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
            return get_store().find_attribute_user(TYPE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$14);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$14);
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
            get_store().remove_attribute(TYPE$14);
        }
    }
    
    /**
     * Gets the "substitutionGroup" attribute
     */
    public javax.xml.namespace.QName getSubstitutionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSTITUTIONGROUP$16);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "substitutionGroup" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSubstitutionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SUBSTITUTIONGROUP$16);
            return target;
        }
    }
    
    /**
     * True if has "substitutionGroup" attribute
     */
    public boolean isSetSubstitutionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBSTITUTIONGROUP$16) != null;
        }
    }
    
    /**
     * Sets the "substitutionGroup" attribute
     */
    public void setSubstitutionGroup(javax.xml.namespace.QName substitutionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSTITUTIONGROUP$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBSTITUTIONGROUP$16);
            }
            target.setQNameValue(substitutionGroup);
        }
    }
    
    /**
     * Sets (as xml) the "substitutionGroup" attribute
     */
    public void xsetSubstitutionGroup(org.apache.xmlbeans.XmlQName substitutionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SUBSTITUTIONGROUP$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SUBSTITUTIONGROUP$16);
            }
            target.set(substitutionGroup);
        }
    }
    
    /**
     * Unsets the "substitutionGroup" attribute
     */
    public void unsetSubstitutionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBSTITUTIONGROUP$16);
        }
    }
    
    /**
     * Gets the "minOccurs" attribute
     */
    public java.math.BigInteger getMinOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINOCCURS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINOCCURS$18);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MINOCCURS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(MINOCCURS$18);
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
            return get_store().find_attribute_user(MINOCCURS$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINOCCURS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINOCCURS$18);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MINOCCURS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(MINOCCURS$18);
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
            get_store().remove_attribute(MINOCCURS$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXOCCURS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXOCCURS$20);
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
            target = (org.w3.x2001.xmlSchema.AllNNI)get_store().find_attribute_user(MAXOCCURS$20);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.AllNNI)get_default_attribute_value(MAXOCCURS$20);
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
            return get_store().find_attribute_user(MAXOCCURS$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXOCCURS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXOCCURS$20);
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
            target = (org.w3.x2001.xmlSchema.AllNNI)get_store().find_attribute_user(MAXOCCURS$20);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.AllNNI)get_store().add_attribute_user(MAXOCCURS$20);
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
            get_store().remove_attribute(MAXOCCURS$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$22);
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
            return get_store().find_attribute_user(DEFAULT$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$22);
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
            get_store().remove_attribute(DEFAULT$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIXED$24);
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
            return get_store().find_attribute_user(FIXED$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIXED$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIXED$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIXED$24);
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
            get_store().remove_attribute(FIXED$24);
        }
    }
    
    /**
     * Gets the "nillable" attribute
     */
    public boolean getNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILLABLE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NILLABLE$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nillable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NILLABLE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NILLABLE$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "nillable" attribute
     */
    public boolean isSetNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NILLABLE$26) != null;
        }
    }
    
    /**
     * Sets the "nillable" attribute
     */
    public void setNillable(boolean nillable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILLABLE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILLABLE$26);
            }
            target.setBooleanValue(nillable);
        }
    }
    
    /**
     * Sets (as xml) the "nillable" attribute
     */
    public void xsetNillable(org.apache.xmlbeans.XmlBoolean nillable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NILLABLE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NILLABLE$26);
            }
            target.set(nillable);
        }
    }
    
    /**
     * Unsets the "nillable" attribute
     */
    public void unsetNillable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NILLABLE$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$28);
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
            return get_store().find_attribute_user(ABSTRACT$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$28);
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
            get_store().remove_attribute(ABSTRACT$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$30);
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
            target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().find_attribute_user(FINAL$30);
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
            return get_store().find_attribute_user(FINAL$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$30);
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
            target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().find_attribute_user(FINAL$30);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.DerivationSet)get_store().add_attribute_user(FINAL$30);
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
            get_store().remove_attribute(FINAL$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCK$32);
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
    public org.w3.x2001.xmlSchema.BlockSet xgetBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.BlockSet target = null;
            target = (org.w3.x2001.xmlSchema.BlockSet)get_store().find_attribute_user(BLOCK$32);
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
            return get_store().find_attribute_user(BLOCK$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCK$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLOCK$32);
            }
            target.setObjectValue(block);
        }
    }
    
    /**
     * Sets (as xml) the "block" attribute
     */
    public void xsetBlock(org.w3.x2001.xmlSchema.BlockSet block)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.BlockSet target = null;
            target = (org.w3.x2001.xmlSchema.BlockSet)get_store().find_attribute_user(BLOCK$32);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.BlockSet)get_store().add_attribute_user(BLOCK$32);
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
            get_store().remove_attribute(BLOCK$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORM$34);
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
            target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(FORM$34);
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
            return get_store().find_attribute_user(FORM$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORM$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORM$34);
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
            target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(FORM$34);
            if (target == null)
            {
                target = (org.w3.x2001.xmlSchema.FormChoice)get_store().add_attribute_user(FORM$34);
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
            get_store().remove_attribute(FORM$34);
        }
    }
}
