/*
 * An XML document type.
 * Localname: union
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.UnionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one union(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class UnionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.UnionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "union");
    
    
    /**
     * Gets the "union" element
     */
    public org.w3.x2001.xmlSchema.UnionDocument.Union getUnion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.UnionDocument.Union target = null;
            target = (org.w3.x2001.xmlSchema.UnionDocument.Union)get_store().find_element_user(UNION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "union" element
     */
    public void setUnion(org.w3.x2001.xmlSchema.UnionDocument.Union union)
    {
        generatedSetterHelperImpl(union, UNION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.w3.x2001.xmlSchema.UnionDocument.Union)get_store().add_element_user(UNION$0);
            return target;
        }
    }
    /**
     * An XML union(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class UnionImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.UnionDocument.Union
    {
        private static final long serialVersionUID = 1L;
        
        public UnionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLETYPE$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
        private static final javax.xml.namespace.QName MEMBERTYPES$2 = 
            new javax.xml.namespace.QName("", "memberTypes");
        
        
        /**
         * Gets array of all "simpleType" elements
         */
        public org.w3.x2001.xmlSchema.LocalSimpleType[] getSimpleTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SIMPLETYPE$0, targetList);
                org.w3.x2001.xmlSchema.LocalSimpleType[] result = new org.w3.x2001.xmlSchema.LocalSimpleType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "simpleType" element
         */
        public org.w3.x2001.xmlSchema.LocalSimpleType getSimpleTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.LocalSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.LocalSimpleType)get_store().find_element_user(SIMPLETYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "simpleType" element
         */
        public int sizeOfSimpleTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIMPLETYPE$0);
            }
        }
        
        /**
         * Sets array of all "simpleType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleTypeArray(org.w3.x2001.xmlSchema.LocalSimpleType[] simpleTypeArray)
        {
            check_orphaned();
            arraySetterHelper(simpleTypeArray, SIMPLETYPE$0);
        }
        
        /**
         * Sets ith "simpleType" element
         */
        public void setSimpleTypeArray(int i, org.w3.x2001.xmlSchema.LocalSimpleType simpleType)
        {
            generatedSetterHelperImpl(simpleType, SIMPLETYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        public org.w3.x2001.xmlSchema.LocalSimpleType insertNewSimpleType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.LocalSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.LocalSimpleType)get_store().insert_element_user(SIMPLETYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
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
         * Removes the ith "simpleType" element
         */
        public void removeSimpleType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIMPLETYPE$0, i);
            }
        }
        
        /**
         * Gets the "memberTypes" attribute
         */
        public java.util.List getMemberTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERTYPES$2);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "memberTypes" attribute
         */
        public org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes xgetMemberTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes target = null;
                target = (org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes)get_store().find_attribute_user(MEMBERTYPES$2);
                return target;
            }
        }
        
        /**
         * True if has "memberTypes" attribute
         */
        public boolean isSetMemberTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEMBERTYPES$2) != null;
            }
        }
        
        /**
         * Sets the "memberTypes" attribute
         */
        public void setMemberTypes(java.util.List memberTypes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERTYPES$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMBERTYPES$2);
                }
                target.setListValue(memberTypes);
            }
        }
        
        /**
         * Sets (as xml) the "memberTypes" attribute
         */
        public void xsetMemberTypes(org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes memberTypes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes target = null;
                target = (org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes)get_store().find_attribute_user(MEMBERTYPES$2);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes)get_store().add_attribute_user(MEMBERTYPES$2);
                }
                target.set(memberTypes);
            }
        }
        
        /**
         * Unsets the "memberTypes" attribute
         */
        public void unsetMemberTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEMBERTYPES$2);
            }
        }
        /**
         * An XML memberTypes(@).
         *
         * This is a list type whose items are org.apache.xmlbeans.XmlQName.
         */
        public static class MemberTypesImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.w3.x2001.xmlSchema.UnionDocument.Union.MemberTypes
        {
            private static final long serialVersionUID = 1L;
            
            public MemberTypesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MemberTypesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
