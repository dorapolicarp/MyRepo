/*
 * XML Type:  restrictionType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RestrictionType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML restrictionType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class RestrictionTypeImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.RestrictionType
{
    private static final long serialVersionUID = 1L;
    
    public RestrictionTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName SIMPLETYPE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
    private static final javax.xml.namespace.QName MINEXCLUSIVE$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minExclusive");
    private static final javax.xml.namespace.QName MININCLUSIVE$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minInclusive");
    private static final javax.xml.namespace.QName MAXEXCLUSIVE$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxExclusive");
    private static final javax.xml.namespace.QName MAXINCLUSIVE$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxInclusive");
    private static final javax.xml.namespace.QName TOTALDIGITS$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "totalDigits");
    private static final javax.xml.namespace.QName FRACTIONDIGITS$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "fractionDigits");
    private static final javax.xml.namespace.QName LENGTH$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "length");
    private static final javax.xml.namespace.QName MINLENGTH$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minLength");
    private static final javax.xml.namespace.QName MAXLENGTH$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxLength");
    private static final javax.xml.namespace.QName ENUMERATION$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "enumeration");
    private static final javax.xml.namespace.QName WHITESPACE$30 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "whiteSpace");
    private static final javax.xml.namespace.QName PATTERN$32 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "pattern");
    private static final javax.xml.namespace.QName ATTRIBUTE$34 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attribute");
    private static final javax.xml.namespace.QName ATTRIBUTEGROUP$36 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    private static final javax.xml.namespace.QName ANYATTRIBUTE$38 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    private static final javax.xml.namespace.QName BASE$40 = 
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
     * Gets the "simpleType" element
     */
    public org.w3.x2001.xmlSchema.LocalSimpleType getSimpleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.LocalSimpleType target = null;
            target = (org.w3.x2001.xmlSchema.LocalSimpleType)get_store().find_element_user(SIMPLETYPE$8, 0);
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
            return get_store().count_elements(SIMPLETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "simpleType" element
     */
    public void setSimpleType(org.w3.x2001.xmlSchema.LocalSimpleType simpleType)
    {
        generatedSetterHelperImpl(simpleType, SIMPLETYPE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.LocalSimpleType)get_store().add_element_user(SIMPLETYPE$8);
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
            get_store().remove_element(SIMPLETYPE$8, 0);
        }
    }
    
    /**
     * Gets array of all "minExclusive" elements
     */
    public org.w3.x2001.xmlSchema.Facet[] getMinExclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MINEXCLUSIVE$10, targetList);
            org.w3.x2001.xmlSchema.Facet[] result = new org.w3.x2001.xmlSchema.Facet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "minExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMinExclusiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MINEXCLUSIVE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "minExclusive" element
     */
    public int sizeOfMinExclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINEXCLUSIVE$10);
        }
    }
    
    /**
     * Sets array of all "minExclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMinExclusiveArray(org.w3.x2001.xmlSchema.Facet[] minExclusiveArray)
    {
        check_orphaned();
        arraySetterHelper(minExclusiveArray, MINEXCLUSIVE$10);
    }
    
    /**
     * Sets ith "minExclusive" element
     */
    public void setMinExclusiveArray(int i, org.w3.x2001.xmlSchema.Facet minExclusive)
    {
        generatedSetterHelperImpl(minExclusive, MINEXCLUSIVE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "minExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet insertNewMinExclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MINEXCLUSIVE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "minExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MINEXCLUSIVE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "minExclusive" element
     */
    public void removeMinExclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINEXCLUSIVE$10, i);
        }
    }
    
    /**
     * Gets array of all "minInclusive" elements
     */
    public org.w3.x2001.xmlSchema.Facet[] getMinInclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MININCLUSIVE$12, targetList);
            org.w3.x2001.xmlSchema.Facet[] result = new org.w3.x2001.xmlSchema.Facet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "minInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMinInclusiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MININCLUSIVE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "minInclusive" element
     */
    public int sizeOfMinInclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MININCLUSIVE$12);
        }
    }
    
    /**
     * Sets array of all "minInclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMinInclusiveArray(org.w3.x2001.xmlSchema.Facet[] minInclusiveArray)
    {
        check_orphaned();
        arraySetterHelper(minInclusiveArray, MININCLUSIVE$12);
    }
    
    /**
     * Sets ith "minInclusive" element
     */
    public void setMinInclusiveArray(int i, org.w3.x2001.xmlSchema.Facet minInclusive)
    {
        generatedSetterHelperImpl(minInclusive, MININCLUSIVE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "minInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet insertNewMinInclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MININCLUSIVE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "minInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMinInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MININCLUSIVE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "minInclusive" element
     */
    public void removeMinInclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MININCLUSIVE$12, i);
        }
    }
    
    /**
     * Gets array of all "maxExclusive" elements
     */
    public org.w3.x2001.xmlSchema.Facet[] getMaxExclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAXEXCLUSIVE$14, targetList);
            org.w3.x2001.xmlSchema.Facet[] result = new org.w3.x2001.xmlSchema.Facet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "maxExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMaxExclusiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXEXCLUSIVE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "maxExclusive" element
     */
    public int sizeOfMaxExclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXEXCLUSIVE$14);
        }
    }
    
    /**
     * Sets array of all "maxExclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaxExclusiveArray(org.w3.x2001.xmlSchema.Facet[] maxExclusiveArray)
    {
        check_orphaned();
        arraySetterHelper(maxExclusiveArray, MAXEXCLUSIVE$14);
    }
    
    /**
     * Sets ith "maxExclusive" element
     */
    public void setMaxExclusiveArray(int i, org.w3.x2001.xmlSchema.Facet maxExclusive)
    {
        generatedSetterHelperImpl(maxExclusive, MAXEXCLUSIVE$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet insertNewMaxExclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MAXEXCLUSIVE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "maxExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXEXCLUSIVE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "maxExclusive" element
     */
    public void removeMaxExclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXEXCLUSIVE$14, i);
        }
    }
    
    /**
     * Gets array of all "maxInclusive" elements
     */
    public org.w3.x2001.xmlSchema.Facet[] getMaxInclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAXINCLUSIVE$16, targetList);
            org.w3.x2001.xmlSchema.Facet[] result = new org.w3.x2001.xmlSchema.Facet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "maxInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMaxInclusiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXINCLUSIVE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "maxInclusive" element
     */
    public int sizeOfMaxInclusiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXINCLUSIVE$16);
        }
    }
    
    /**
     * Sets array of all "maxInclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaxInclusiveArray(org.w3.x2001.xmlSchema.Facet[] maxInclusiveArray)
    {
        check_orphaned();
        arraySetterHelper(maxInclusiveArray, MAXINCLUSIVE$16);
    }
    
    /**
     * Sets ith "maxInclusive" element
     */
    public void setMaxInclusiveArray(int i, org.w3.x2001.xmlSchema.Facet maxInclusive)
    {
        generatedSetterHelperImpl(maxInclusive, MAXINCLUSIVE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet insertNewMaxInclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MAXINCLUSIVE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "maxInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMaxInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXINCLUSIVE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "maxInclusive" element
     */
    public void removeMaxInclusive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXINCLUSIVE$16, i);
        }
    }
    
    /**
     * Gets array of all "totalDigits" elements
     */
    public org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[] getTotalDigitsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOTALDIGITS$18, targetList);
            org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[] result = new org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "totalDigits" element
     */
    public org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits getTotalDigitsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().find_element_user(TOTALDIGITS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "totalDigits" element
     */
    public int sizeOfTotalDigitsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALDIGITS$18);
        }
    }
    
    /**
     * Sets array of all "totalDigits" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTotalDigitsArray(org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[] totalDigitsArray)
    {
        check_orphaned();
        arraySetterHelper(totalDigitsArray, TOTALDIGITS$18);
    }
    
    /**
     * Sets ith "totalDigits" element
     */
    public void setTotalDigitsArray(int i, org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits totalDigits)
    {
        generatedSetterHelperImpl(totalDigits, TOTALDIGITS$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "totalDigits" element
     */
    public org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits insertNewTotalDigits(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().insert_element_user(TOTALDIGITS$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "totalDigits" element
     */
    public org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits addNewTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().add_element_user(TOTALDIGITS$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "totalDigits" element
     */
    public void removeTotalDigits(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALDIGITS$18, i);
        }
    }
    
    /**
     * Gets array of all "fractionDigits" elements
     */
    public org.w3.x2001.xmlSchema.NumFacet[] getFractionDigitsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FRACTIONDIGITS$20, targetList);
            org.w3.x2001.xmlSchema.NumFacet[] result = new org.w3.x2001.xmlSchema.NumFacet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fractionDigits" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getFractionDigitsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(FRACTIONDIGITS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fractionDigits" element
     */
    public int sizeOfFractionDigitsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRACTIONDIGITS$20);
        }
    }
    
    /**
     * Sets array of all "fractionDigits" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFractionDigitsArray(org.w3.x2001.xmlSchema.NumFacet[] fractionDigitsArray)
    {
        check_orphaned();
        arraySetterHelper(fractionDigitsArray, FRACTIONDIGITS$20);
    }
    
    /**
     * Sets ith "fractionDigits" element
     */
    public void setFractionDigitsArray(int i, org.w3.x2001.xmlSchema.NumFacet fractionDigits)
    {
        generatedSetterHelperImpl(fractionDigits, FRACTIONDIGITS$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fractionDigits" element
     */
    public org.w3.x2001.xmlSchema.NumFacet insertNewFractionDigits(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(FRACTIONDIGITS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fractionDigits" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(FRACTIONDIGITS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "fractionDigits" element
     */
    public void removeFractionDigits(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRACTIONDIGITS$20, i);
        }
    }
    
    /**
     * Gets array of all "length" elements
     */
    public org.w3.x2001.xmlSchema.NumFacet[] getLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LENGTH$22, targetList);
            org.w3.x2001.xmlSchema.NumFacet[] result = new org.w3.x2001.xmlSchema.NumFacet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "length" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(LENGTH$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "length" element
     */
    public int sizeOfLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTH$22);
        }
    }
    
    /**
     * Sets array of all "length" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLengthArray(org.w3.x2001.xmlSchema.NumFacet[] lengthArray)
    {
        check_orphaned();
        arraySetterHelper(lengthArray, LENGTH$22);
    }
    
    /**
     * Sets ith "length" element
     */
    public void setLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet length)
    {
        generatedSetterHelperImpl(length, LENGTH$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "length" element
     */
    public org.w3.x2001.xmlSchema.NumFacet insertNewLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(LENGTH$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "length" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(LENGTH$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "length" element
     */
    public void removeLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTH$22, i);
        }
    }
    
    /**
     * Gets array of all "minLength" elements
     */
    public org.w3.x2001.xmlSchema.NumFacet[] getMinLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MINLENGTH$24, targetList);
            org.w3.x2001.xmlSchema.NumFacet[] result = new org.w3.x2001.xmlSchema.NumFacet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "minLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getMinLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MINLENGTH$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "minLength" element
     */
    public int sizeOfMinLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINLENGTH$24);
        }
    }
    
    /**
     * Sets array of all "minLength" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMinLengthArray(org.w3.x2001.xmlSchema.NumFacet[] minLengthArray)
    {
        check_orphaned();
        arraySetterHelper(minLengthArray, MINLENGTH$24);
    }
    
    /**
     * Sets ith "minLength" element
     */
    public void setMinLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet minLength)
    {
        generatedSetterHelperImpl(minLength, MINLENGTH$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "minLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet insertNewMinLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(MINLENGTH$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "minLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MINLENGTH$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "minLength" element
     */
    public void removeMinLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINLENGTH$24, i);
        }
    }
    
    /**
     * Gets array of all "maxLength" elements
     */
    public org.w3.x2001.xmlSchema.NumFacet[] getMaxLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAXLENGTH$26, targetList);
            org.w3.x2001.xmlSchema.NumFacet[] result = new org.w3.x2001.xmlSchema.NumFacet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "maxLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getMaxLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MAXLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "maxLength" element
     */
    public int sizeOfMaxLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$26);
        }
    }
    
    /**
     * Sets array of all "maxLength" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaxLengthArray(org.w3.x2001.xmlSchema.NumFacet[] maxLengthArray)
    {
        check_orphaned();
        arraySetterHelper(maxLengthArray, MAXLENGTH$26);
    }
    
    /**
     * Sets ith "maxLength" element
     */
    public void setMaxLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet maxLength)
    {
        generatedSetterHelperImpl(maxLength, MAXLENGTH$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet insertNewMaxLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(MAXLENGTH$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "maxLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MAXLENGTH$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "maxLength" element
     */
    public void removeMaxLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$26, i);
        }
    }
    
    /**
     * Gets array of all "enumeration" elements
     */
    public org.w3.x2001.xmlSchema.NoFixedFacet[] getEnumerationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENUMERATION$28, targetList);
            org.w3.x2001.xmlSchema.NoFixedFacet[] result = new org.w3.x2001.xmlSchema.NoFixedFacet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "enumeration" element
     */
    public org.w3.x2001.xmlSchema.NoFixedFacet getEnumerationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NoFixedFacet target = null;
            target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().find_element_user(ENUMERATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "enumeration" element
     */
    public int sizeOfEnumerationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENUMERATION$28);
        }
    }
    
    /**
     * Sets array of all "enumeration" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEnumerationArray(org.w3.x2001.xmlSchema.NoFixedFacet[] enumerationArray)
    {
        check_orphaned();
        arraySetterHelper(enumerationArray, ENUMERATION$28);
    }
    
    /**
     * Sets ith "enumeration" element
     */
    public void setEnumerationArray(int i, org.w3.x2001.xmlSchema.NoFixedFacet enumeration)
    {
        generatedSetterHelperImpl(enumeration, ENUMERATION$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "enumeration" element
     */
    public org.w3.x2001.xmlSchema.NoFixedFacet insertNewEnumeration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NoFixedFacet target = null;
            target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().insert_element_user(ENUMERATION$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "enumeration" element
     */
    public org.w3.x2001.xmlSchema.NoFixedFacet addNewEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NoFixedFacet target = null;
            target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().add_element_user(ENUMERATION$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "enumeration" element
     */
    public void removeEnumeration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENUMERATION$28, i);
        }
    }
    
    /**
     * Gets array of all "whiteSpace" elements
     */
    public org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[] getWhiteSpaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WHITESPACE$30, targetList);
            org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[] result = new org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "whiteSpace" element
     */
    public org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace getWhiteSpaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().find_element_user(WHITESPACE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "whiteSpace" element
     */
    public int sizeOfWhiteSpaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHITESPACE$30);
        }
    }
    
    /**
     * Sets array of all "whiteSpace" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWhiteSpaceArray(org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[] whiteSpaceArray)
    {
        check_orphaned();
        arraySetterHelper(whiteSpaceArray, WHITESPACE$30);
    }
    
    /**
     * Sets ith "whiteSpace" element
     */
    public void setWhiteSpaceArray(int i, org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace whiteSpace)
    {
        generatedSetterHelperImpl(whiteSpace, WHITESPACE$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "whiteSpace" element
     */
    public org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace insertNewWhiteSpace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().insert_element_user(WHITESPACE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "whiteSpace" element
     */
    public org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().add_element_user(WHITESPACE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "whiteSpace" element
     */
    public void removeWhiteSpace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHITESPACE$30, i);
        }
    }
    
    /**
     * Gets array of all "pattern" elements
     */
    public org.w3.x2001.xmlSchema.PatternDocument.Pattern[] getPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATTERN$32, targetList);
            org.w3.x2001.xmlSchema.PatternDocument.Pattern[] result = new org.w3.x2001.xmlSchema.PatternDocument.Pattern[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pattern" element
     */
    public org.w3.x2001.xmlSchema.PatternDocument.Pattern getPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.PatternDocument.Pattern target = null;
            target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().find_element_user(PATTERN$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pattern" element
     */
    public int sizeOfPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTERN$32);
        }
    }
    
    /**
     * Sets array of all "pattern" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPatternArray(org.w3.x2001.xmlSchema.PatternDocument.Pattern[] patternArray)
    {
        check_orphaned();
        arraySetterHelper(patternArray, PATTERN$32);
    }
    
    /**
     * Sets ith "pattern" element
     */
    public void setPatternArray(int i, org.w3.x2001.xmlSchema.PatternDocument.Pattern pattern)
    {
        generatedSetterHelperImpl(pattern, PATTERN$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    public org.w3.x2001.xmlSchema.PatternDocument.Pattern insertNewPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.PatternDocument.Pattern target = null;
            target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().insert_element_user(PATTERN$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    public org.w3.x2001.xmlSchema.PatternDocument.Pattern addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.PatternDocument.Pattern target = null;
            target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().add_element_user(PATTERN$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "pattern" element
     */
    public void removePattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTERN$32, i);
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
            get_store().find_all_element_users(ATTRIBUTE$34, targetList);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().find_element_user(ATTRIBUTE$34, i);
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
            return get_store().count_elements(ATTRIBUTE$34);
        }
    }
    
    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.w3.x2001.xmlSchema.Attribute[] attributeArray)
    {
        check_orphaned();
        arraySetterHelper(attributeArray, ATTRIBUTE$34);
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.w3.x2001.xmlSchema.Attribute attribute)
    {
        generatedSetterHelperImpl(attribute, ATTRIBUTE$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().insert_element_user(ATTRIBUTE$34, i);
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
            target = (org.w3.x2001.xmlSchema.Attribute)get_store().add_element_user(ATTRIBUTE$34);
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
            get_store().remove_element(ATTRIBUTE$34, i);
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
            get_store().find_all_element_users(ATTRIBUTEGROUP$36, targetList);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().find_element_user(ATTRIBUTEGROUP$36, i);
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
            return get_store().count_elements(ATTRIBUTEGROUP$36);
        }
    }
    
    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.w3.x2001.xmlSchema.AttributeGroupRef[] attributeGroupArray)
    {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, ATTRIBUTEGROUP$36);
    }
    
    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.AttributeGroupRef attributeGroup)
    {
        generatedSetterHelperImpl(attributeGroup, ATTRIBUTEGROUP$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().insert_element_user(ATTRIBUTEGROUP$36, i);
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
            target = (org.w3.x2001.xmlSchema.AttributeGroupRef)get_store().add_element_user(ATTRIBUTEGROUP$36);
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
            get_store().remove_element(ATTRIBUTEGROUP$36, i);
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
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().find_element_user(ANYATTRIBUTE$38, 0);
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
            return get_store().count_elements(ANYATTRIBUTE$38) != 0;
        }
    }
    
    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute)
    {
        generatedSetterHelperImpl(anyAttribute, ANYATTRIBUTE$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().add_element_user(ANYATTRIBUTE$38);
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
            get_store().remove_element(ANYATTRIBUTE$38, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$40);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BASE$40);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$40);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BASE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(BASE$40);
            }
            target.set(base);
        }
    }
}
