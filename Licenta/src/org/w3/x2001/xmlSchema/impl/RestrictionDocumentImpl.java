/*
 * An XML document type.
 * Localname: restriction
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RestrictionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one restriction(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class RestrictionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.RestrictionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RestrictionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTRICTION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "restriction");
    
    
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
     * An XML restriction(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class RestrictionImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.RestrictionDocument.Restriction
    {
        private static final long serialVersionUID = 1L;
        
        public RestrictionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLETYPE$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
        private static final javax.xml.namespace.QName MINEXCLUSIVE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minExclusive");
        private static final javax.xml.namespace.QName MININCLUSIVE$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minInclusive");
        private static final javax.xml.namespace.QName MAXEXCLUSIVE$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxExclusive");
        private static final javax.xml.namespace.QName MAXINCLUSIVE$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxInclusive");
        private static final javax.xml.namespace.QName TOTALDIGITS$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "totalDigits");
        private static final javax.xml.namespace.QName FRACTIONDIGITS$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "fractionDigits");
        private static final javax.xml.namespace.QName LENGTH$14 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "length");
        private static final javax.xml.namespace.QName MINLENGTH$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minLength");
        private static final javax.xml.namespace.QName MAXLENGTH$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxLength");
        private static final javax.xml.namespace.QName ENUMERATION$20 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "enumeration");
        private static final javax.xml.namespace.QName WHITESPACE$22 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "whiteSpace");
        private static final javax.xml.namespace.QName PATTERN$24 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "pattern");
        private static final javax.xml.namespace.QName BASE$26 = 
            new javax.xml.namespace.QName("", "base");
        
        
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
         * Gets array of all "minExclusive" elements
         */
        public org.w3.x2001.xmlSchema.Facet[] getMinExclusiveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MINEXCLUSIVE$2, targetList);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MINEXCLUSIVE$2, i);
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
                return get_store().count_elements(MINEXCLUSIVE$2);
            }
        }
        
        /**
         * Sets array of all "minExclusive" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMinExclusiveArray(org.w3.x2001.xmlSchema.Facet[] minExclusiveArray)
        {
            check_orphaned();
            arraySetterHelper(minExclusiveArray, MINEXCLUSIVE$2);
        }
        
        /**
         * Sets ith "minExclusive" element
         */
        public void setMinExclusiveArray(int i, org.w3.x2001.xmlSchema.Facet minExclusive)
        {
            generatedSetterHelperImpl(minExclusive, MINEXCLUSIVE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MINEXCLUSIVE$2, i);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MINEXCLUSIVE$2);
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
                get_store().remove_element(MINEXCLUSIVE$2, i);
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
                get_store().find_all_element_users(MININCLUSIVE$4, targetList);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MININCLUSIVE$4, i);
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
                return get_store().count_elements(MININCLUSIVE$4);
            }
        }
        
        /**
         * Sets array of all "minInclusive" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMinInclusiveArray(org.w3.x2001.xmlSchema.Facet[] minInclusiveArray)
        {
            check_orphaned();
            arraySetterHelper(minInclusiveArray, MININCLUSIVE$4);
        }
        
        /**
         * Sets ith "minInclusive" element
         */
        public void setMinInclusiveArray(int i, org.w3.x2001.xmlSchema.Facet minInclusive)
        {
            generatedSetterHelperImpl(minInclusive, MININCLUSIVE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MININCLUSIVE$4, i);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MININCLUSIVE$4);
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
                get_store().remove_element(MININCLUSIVE$4, i);
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
                get_store().find_all_element_users(MAXEXCLUSIVE$6, targetList);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXEXCLUSIVE$6, i);
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
                return get_store().count_elements(MAXEXCLUSIVE$6);
            }
        }
        
        /**
         * Sets array of all "maxExclusive" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMaxExclusiveArray(org.w3.x2001.xmlSchema.Facet[] maxExclusiveArray)
        {
            check_orphaned();
            arraySetterHelper(maxExclusiveArray, MAXEXCLUSIVE$6);
        }
        
        /**
         * Sets ith "maxExclusive" element
         */
        public void setMaxExclusiveArray(int i, org.w3.x2001.xmlSchema.Facet maxExclusive)
        {
            generatedSetterHelperImpl(maxExclusive, MAXEXCLUSIVE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MAXEXCLUSIVE$6, i);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXEXCLUSIVE$6);
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
                get_store().remove_element(MAXEXCLUSIVE$6, i);
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
                get_store().find_all_element_users(MAXINCLUSIVE$8, targetList);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXINCLUSIVE$8, i);
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
                return get_store().count_elements(MAXINCLUSIVE$8);
            }
        }
        
        /**
         * Sets array of all "maxInclusive" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMaxInclusiveArray(org.w3.x2001.xmlSchema.Facet[] maxInclusiveArray)
        {
            check_orphaned();
            arraySetterHelper(maxInclusiveArray, MAXINCLUSIVE$8);
        }
        
        /**
         * Sets ith "maxInclusive" element
         */
        public void setMaxInclusiveArray(int i, org.w3.x2001.xmlSchema.Facet maxInclusive)
        {
            generatedSetterHelperImpl(maxInclusive, MAXINCLUSIVE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().insert_element_user(MAXINCLUSIVE$8, i);
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
                target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXINCLUSIVE$8);
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
                get_store().remove_element(MAXINCLUSIVE$8, i);
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
                get_store().find_all_element_users(TOTALDIGITS$10, targetList);
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
                target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().find_element_user(TOTALDIGITS$10, i);
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
                return get_store().count_elements(TOTALDIGITS$10);
            }
        }
        
        /**
         * Sets array of all "totalDigits" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTotalDigitsArray(org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits[] totalDigitsArray)
        {
            check_orphaned();
            arraySetterHelper(totalDigitsArray, TOTALDIGITS$10);
        }
        
        /**
         * Sets ith "totalDigits" element
         */
        public void setTotalDigitsArray(int i, org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits totalDigits)
        {
            generatedSetterHelperImpl(totalDigits, TOTALDIGITS$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().insert_element_user(TOTALDIGITS$10, i);
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
                target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().add_element_user(TOTALDIGITS$10);
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
                get_store().remove_element(TOTALDIGITS$10, i);
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
                get_store().find_all_element_users(FRACTIONDIGITS$12, targetList);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(FRACTIONDIGITS$12, i);
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
                return get_store().count_elements(FRACTIONDIGITS$12);
            }
        }
        
        /**
         * Sets array of all "fractionDigits" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFractionDigitsArray(org.w3.x2001.xmlSchema.NumFacet[] fractionDigitsArray)
        {
            check_orphaned();
            arraySetterHelper(fractionDigitsArray, FRACTIONDIGITS$12);
        }
        
        /**
         * Sets ith "fractionDigits" element
         */
        public void setFractionDigitsArray(int i, org.w3.x2001.xmlSchema.NumFacet fractionDigits)
        {
            generatedSetterHelperImpl(fractionDigits, FRACTIONDIGITS$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(FRACTIONDIGITS$12, i);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(FRACTIONDIGITS$12);
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
                get_store().remove_element(FRACTIONDIGITS$12, i);
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
                get_store().find_all_element_users(LENGTH$14, targetList);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(LENGTH$14, i);
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
                return get_store().count_elements(LENGTH$14);
            }
        }
        
        /**
         * Sets array of all "length" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLengthArray(org.w3.x2001.xmlSchema.NumFacet[] lengthArray)
        {
            check_orphaned();
            arraySetterHelper(lengthArray, LENGTH$14);
        }
        
        /**
         * Sets ith "length" element
         */
        public void setLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet length)
        {
            generatedSetterHelperImpl(length, LENGTH$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(LENGTH$14, i);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(LENGTH$14);
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
                get_store().remove_element(LENGTH$14, i);
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
                get_store().find_all_element_users(MINLENGTH$16, targetList);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MINLENGTH$16, i);
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
                return get_store().count_elements(MINLENGTH$16);
            }
        }
        
        /**
         * Sets array of all "minLength" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMinLengthArray(org.w3.x2001.xmlSchema.NumFacet[] minLengthArray)
        {
            check_orphaned();
            arraySetterHelper(minLengthArray, MINLENGTH$16);
        }
        
        /**
         * Sets ith "minLength" element
         */
        public void setMinLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet minLength)
        {
            generatedSetterHelperImpl(minLength, MINLENGTH$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(MINLENGTH$16, i);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MINLENGTH$16);
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
                get_store().remove_element(MINLENGTH$16, i);
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
                get_store().find_all_element_users(MAXLENGTH$18, targetList);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MAXLENGTH$18, i);
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
                return get_store().count_elements(MAXLENGTH$18);
            }
        }
        
        /**
         * Sets array of all "maxLength" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMaxLengthArray(org.w3.x2001.xmlSchema.NumFacet[] maxLengthArray)
        {
            check_orphaned();
            arraySetterHelper(maxLengthArray, MAXLENGTH$18);
        }
        
        /**
         * Sets ith "maxLength" element
         */
        public void setMaxLengthArray(int i, org.w3.x2001.xmlSchema.NumFacet maxLength)
        {
            generatedSetterHelperImpl(maxLength, MAXLENGTH$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().insert_element_user(MAXLENGTH$18, i);
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
                target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MAXLENGTH$18);
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
                get_store().remove_element(MAXLENGTH$18, i);
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
                get_store().find_all_element_users(ENUMERATION$20, targetList);
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
                target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().find_element_user(ENUMERATION$20, i);
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
                return get_store().count_elements(ENUMERATION$20);
            }
        }
        
        /**
         * Sets array of all "enumeration" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEnumerationArray(org.w3.x2001.xmlSchema.NoFixedFacet[] enumerationArray)
        {
            check_orphaned();
            arraySetterHelper(enumerationArray, ENUMERATION$20);
        }
        
        /**
         * Sets ith "enumeration" element
         */
        public void setEnumerationArray(int i, org.w3.x2001.xmlSchema.NoFixedFacet enumeration)
        {
            generatedSetterHelperImpl(enumeration, ENUMERATION$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().insert_element_user(ENUMERATION$20, i);
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
                target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().add_element_user(ENUMERATION$20);
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
                get_store().remove_element(ENUMERATION$20, i);
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
                get_store().find_all_element_users(WHITESPACE$22, targetList);
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
                target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().find_element_user(WHITESPACE$22, i);
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
                return get_store().count_elements(WHITESPACE$22);
            }
        }
        
        /**
         * Sets array of all "whiteSpace" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setWhiteSpaceArray(org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace[] whiteSpaceArray)
        {
            check_orphaned();
            arraySetterHelper(whiteSpaceArray, WHITESPACE$22);
        }
        
        /**
         * Sets ith "whiteSpace" element
         */
        public void setWhiteSpaceArray(int i, org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace whiteSpace)
        {
            generatedSetterHelperImpl(whiteSpace, WHITESPACE$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().insert_element_user(WHITESPACE$22, i);
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
                target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().add_element_user(WHITESPACE$22);
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
                get_store().remove_element(WHITESPACE$22, i);
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
                get_store().find_all_element_users(PATTERN$24, targetList);
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
                target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().find_element_user(PATTERN$24, i);
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
                return get_store().count_elements(PATTERN$24);
            }
        }
        
        /**
         * Sets array of all "pattern" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPatternArray(org.w3.x2001.xmlSchema.PatternDocument.Pattern[] patternArray)
        {
            check_orphaned();
            arraySetterHelper(patternArray, PATTERN$24);
        }
        
        /**
         * Sets ith "pattern" element
         */
        public void setPatternArray(int i, org.w3.x2001.xmlSchema.PatternDocument.Pattern pattern)
        {
            generatedSetterHelperImpl(pattern, PATTERN$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().insert_element_user(PATTERN$24, i);
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
                target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().add_element_user(PATTERN$24);
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
                get_store().remove_element(PATTERN$24, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$26);
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
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BASE$26);
                return target;
            }
        }
        
        /**
         * True if has "base" attribute
         */
        public boolean isSetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BASE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$26);
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
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(BASE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(BASE$26);
                }
                target.set(base);
            }
        }
        
        /**
         * Unsets the "base" attribute
         */
        public void unsetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BASE$26);
            }
        }
    }
}
