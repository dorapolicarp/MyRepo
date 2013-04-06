/*
 * XML Type:  realGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RealGroup
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML realGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class RealGroupImpl extends org.w3.x2001.xmlSchema.impl.GroupImpl implements org.w3.x2001.xmlSchema.RealGroup
{
    private static final long serialVersionUID = 1L;
    
    public RealGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALL$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "all");
    private static final javax.xml.namespace.QName CHOICE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "choice");
    private static final javax.xml.namespace.QName SEQUENCE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "sequence");
    
    
    /**
     * Gets array of all "all" elements
     */
    public org.w3.x2001.xmlSchema.All[] getAllArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALL$0, targetList);
            org.w3.x2001.xmlSchema.All[] result = new org.w3.x2001.xmlSchema.All[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "all" element
     */
    public org.w3.x2001.xmlSchema.All getAllArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.All target = null;
            target = (org.w3.x2001.xmlSchema.All)get_store().find_element_user(ALL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "all" element
     */
    public int sizeOfAllArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALL$0);
        }
    }
    
    /**
     * Sets array of all "all" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAllArray(org.w3.x2001.xmlSchema.All[] allArray)
    {
        check_orphaned();
        arraySetterHelper(allArray, ALL$0);
    }
    
    /**
     * Sets ith "all" element
     */
    public void setAllArray(int i, org.w3.x2001.xmlSchema.All all)
    {
        generatedSetterHelperImpl(all, ALL$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "all" element
     */
    public org.w3.x2001.xmlSchema.All insertNewAll(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.All target = null;
            target = (org.w3.x2001.xmlSchema.All)get_store().insert_element_user(ALL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "all" element
     */
    public org.w3.x2001.xmlSchema.All addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.All target = null;
            target = (org.w3.x2001.xmlSchema.All)get_store().add_element_user(ALL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "all" element
     */
    public void removeAll(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALL$0, i);
        }
    }
    
    /**
     * Gets array of all "choice" elements
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup[] getChoiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHOICE$2, targetList);
            org.w3.x2001.xmlSchema.ExplicitGroup[] result = new org.w3.x2001.xmlSchema.ExplicitGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "choice" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup getChoiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(CHOICE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "choice" element
     */
    public int sizeOfChoiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHOICE$2);
        }
    }
    
    /**
     * Sets array of all "choice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChoiceArray(org.w3.x2001.xmlSchema.ExplicitGroup[] choiceArray)
    {
        check_orphaned();
        arraySetterHelper(choiceArray, CHOICE$2);
    }
    
    /**
     * Sets ith "choice" element
     */
    public void setChoiceArray(int i, org.w3.x2001.xmlSchema.ExplicitGroup choice)
    {
        generatedSetterHelperImpl(choice, CHOICE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup insertNewChoice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().insert_element_user(CHOICE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup addNewChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(CHOICE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "choice" element
     */
    public void removeChoice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHOICE$2, i);
        }
    }
    
    /**
     * Gets array of all "sequence" elements
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup[] getSequenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEQUENCE$4, targetList);
            org.w3.x2001.xmlSchema.ExplicitGroup[] result = new org.w3.x2001.xmlSchema.ExplicitGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup getSequenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(SEQUENCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sequence" element
     */
    public int sizeOfSequenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCE$4);
        }
    }
    
    /**
     * Sets array of all "sequence" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSequenceArray(org.w3.x2001.xmlSchema.ExplicitGroup[] sequenceArray)
    {
        check_orphaned();
        arraySetterHelper(sequenceArray, SEQUENCE$4);
    }
    
    /**
     * Sets ith "sequence" element
     */
    public void setSequenceArray(int i, org.w3.x2001.xmlSchema.ExplicitGroup sequence)
    {
        generatedSetterHelperImpl(sequence, SEQUENCE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup insertNewSequence(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().insert_element_user(SEQUENCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup addNewSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(SEQUENCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "sequence" element
     */
    public void removeSequence(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCE$4, i);
        }
    }
}
