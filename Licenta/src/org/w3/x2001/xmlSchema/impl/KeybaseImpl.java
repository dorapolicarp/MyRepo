/*
 * XML Type:  keybase
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.Keybase
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML keybase(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class KeybaseImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.Keybase
{
    private static final long serialVersionUID = 1L;
    
    public KeybaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTOR$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "selector");
    private static final javax.xml.namespace.QName FIELD$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "field");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    
    
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
     * Gets array of all "field" elements
     */
    public org.w3.x2001.xmlSchema.FieldDocument.Field[] getFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELD$2, targetList);
            org.w3.x2001.xmlSchema.FieldDocument.Field[] result = new org.w3.x2001.xmlSchema.FieldDocument.Field[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "field" element
     */
    public org.w3.x2001.xmlSchema.FieldDocument.Field getFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FieldDocument.Field target = null;
            target = (org.w3.x2001.xmlSchema.FieldDocument.Field)get_store().find_element_user(FIELD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "field" element
     */
    public int sizeOfFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELD$2);
        }
    }
    
    /**
     * Sets array of all "field" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFieldArray(org.w3.x2001.xmlSchema.FieldDocument.Field[] fieldArray)
    {
        check_orphaned();
        arraySetterHelper(fieldArray, FIELD$2);
    }
    
    /**
     * Sets ith "field" element
     */
    public void setFieldArray(int i, org.w3.x2001.xmlSchema.FieldDocument.Field field)
    {
        generatedSetterHelperImpl(field, FIELD$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "field" element
     */
    public org.w3.x2001.xmlSchema.FieldDocument.Field insertNewField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FieldDocument.Field target = null;
            target = (org.w3.x2001.xmlSchema.FieldDocument.Field)get_store().insert_element_user(FIELD$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "field" element
     */
    public org.w3.x2001.xmlSchema.FieldDocument.Field addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.FieldDocument.Field target = null;
            target = (org.w3.x2001.xmlSchema.FieldDocument.Field)get_store().add_element_user(FIELD$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "field" element
     */
    public void removeField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELD$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
}
