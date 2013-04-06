/*
 * An XML document type.
 * Localname: redefine
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.RedefineDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one redefine(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class RedefineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.RedefineDocument
{
    private static final long serialVersionUID = 1L;
    
    public RedefineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDEFINE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "redefine");
    
    
    /**
     * Gets the "redefine" element
     */
    public org.w3.x2001.xmlSchema.RedefineDocument.Redefine getRedefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.RedefineDocument.Redefine target = null;
            target = (org.w3.x2001.xmlSchema.RedefineDocument.Redefine)get_store().find_element_user(REDEFINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "redefine" element
     */
    public void setRedefine(org.w3.x2001.xmlSchema.RedefineDocument.Redefine redefine)
    {
        generatedSetterHelperImpl(redefine, REDEFINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "redefine" element
     */
    public org.w3.x2001.xmlSchema.RedefineDocument.Redefine addNewRedefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.RedefineDocument.Redefine target = null;
            target = (org.w3.x2001.xmlSchema.RedefineDocument.Redefine)get_store().add_element_user(REDEFINE$0);
            return target;
        }
    }
    /**
     * An XML redefine(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class RedefineImpl extends org.w3.x2001.xmlSchema.impl.OpenAttrsImpl implements org.w3.x2001.xmlSchema.RedefineDocument.Redefine
    {
        private static final long serialVersionUID = 1L;
        
        public RedefineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANNOTATION$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "annotation");
        private static final javax.xml.namespace.QName SIMPLETYPE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
        private static final javax.xml.namespace.QName COMPLEXTYPE$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexType");
        private static final javax.xml.namespace.QName GROUP$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "group");
        private static final javax.xml.namespace.QName ATTRIBUTEGROUP$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
        private static final javax.xml.namespace.QName SCHEMALOCATION$10 = 
            new javax.xml.namespace.QName("", "schemaLocation");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets array of all "annotation" elements
         */
        public org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] getAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ANNOTATION$0, targetList);
                org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] result = new org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "annotation" element
         */
        public org.w3.x2001.xmlSchema.AnnotationDocument.Annotation getAnnotationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AnnotationDocument.Annotation target = null;
                target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "annotation" element
         */
        public int sizeOfAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOTATION$0);
            }
        }
        
        /**
         * Sets array of all "annotation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAnnotationArray(org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] annotationArray)
        {
            check_orphaned();
            arraySetterHelper(annotationArray, ANNOTATION$0);
        }
        
        /**
         * Sets ith "annotation" element
         */
        public void setAnnotationArray(int i, org.w3.x2001.xmlSchema.AnnotationDocument.Annotation annotation)
        {
            generatedSetterHelperImpl(annotation, ANNOTATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        public org.w3.x2001.xmlSchema.AnnotationDocument.Annotation insertNewAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AnnotationDocument.Annotation target = null;
                target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().insert_element_user(ANNOTATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        public org.w3.x2001.xmlSchema.AnnotationDocument.Annotation addNewAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AnnotationDocument.Annotation target = null;
                target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "annotation" element
         */
        public void removeAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOTATION$0, i);
            }
        }
        
        /**
         * Gets array of all "simpleType" elements
         */
        public org.w3.x2001.xmlSchema.TopLevelSimpleType[] getSimpleTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SIMPLETYPE$2, targetList);
                org.w3.x2001.xmlSchema.TopLevelSimpleType[] result = new org.w3.x2001.xmlSchema.TopLevelSimpleType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "simpleType" element
         */
        public org.w3.x2001.xmlSchema.TopLevelSimpleType getSimpleTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().find_element_user(SIMPLETYPE$2, i);
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
                return get_store().count_elements(SIMPLETYPE$2);
            }
        }
        
        /**
         * Sets array of all "simpleType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleTypeArray(org.w3.x2001.xmlSchema.TopLevelSimpleType[] simpleTypeArray)
        {
            check_orphaned();
            arraySetterHelper(simpleTypeArray, SIMPLETYPE$2);
        }
        
        /**
         * Sets ith "simpleType" element
         */
        public void setSimpleTypeArray(int i, org.w3.x2001.xmlSchema.TopLevelSimpleType simpleType)
        {
            generatedSetterHelperImpl(simpleType, SIMPLETYPE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        public org.w3.x2001.xmlSchema.TopLevelSimpleType insertNewSimpleType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().insert_element_user(SIMPLETYPE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
         */
        public org.w3.x2001.xmlSchema.TopLevelSimpleType addNewSimpleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelSimpleType target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().add_element_user(SIMPLETYPE$2);
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
                get_store().remove_element(SIMPLETYPE$2, i);
            }
        }
        
        /**
         * Gets array of all "complexType" elements
         */
        public org.w3.x2001.xmlSchema.TopLevelComplexType[] getComplexTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPLEXTYPE$4, targetList);
                org.w3.x2001.xmlSchema.TopLevelComplexType[] result = new org.w3.x2001.xmlSchema.TopLevelComplexType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "complexType" element
         */
        public org.w3.x2001.xmlSchema.TopLevelComplexType getComplexTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelComplexType target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().find_element_user(COMPLEXTYPE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "complexType" element
         */
        public int sizeOfComplexTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPLEXTYPE$4);
            }
        }
        
        /**
         * Sets array of all "complexType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setComplexTypeArray(org.w3.x2001.xmlSchema.TopLevelComplexType[] complexTypeArray)
        {
            check_orphaned();
            arraySetterHelper(complexTypeArray, COMPLEXTYPE$4);
        }
        
        /**
         * Sets ith "complexType" element
         */
        public void setComplexTypeArray(int i, org.w3.x2001.xmlSchema.TopLevelComplexType complexType)
        {
            generatedSetterHelperImpl(complexType, COMPLEXTYPE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "complexType" element
         */
        public org.w3.x2001.xmlSchema.TopLevelComplexType insertNewComplexType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelComplexType target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().insert_element_user(COMPLEXTYPE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "complexType" element
         */
        public org.w3.x2001.xmlSchema.TopLevelComplexType addNewComplexType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelComplexType target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().add_element_user(COMPLEXTYPE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "complexType" element
         */
        public void removeComplexType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPLEXTYPE$4, i);
            }
        }
        
        /**
         * Gets array of all "group" elements
         */
        public org.w3.x2001.xmlSchema.NamedGroup[] getGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GROUP$6, targetList);
                org.w3.x2001.xmlSchema.NamedGroup[] result = new org.w3.x2001.xmlSchema.NamedGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "group" element
         */
        public org.w3.x2001.xmlSchema.NamedGroup getGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NamedGroup target = null;
                target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().find_element_user(GROUP$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "group" element
         */
        public int sizeOfGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUP$6);
            }
        }
        
        /**
         * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupArray(org.w3.x2001.xmlSchema.NamedGroup[] groupArray)
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$6);
        }
        
        /**
         * Sets ith "group" element
         */
        public void setGroupArray(int i, org.w3.x2001.xmlSchema.NamedGroup group)
        {
            generatedSetterHelperImpl(group, GROUP$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        public org.w3.x2001.xmlSchema.NamedGroup insertNewGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NamedGroup target = null;
                target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().insert_element_user(GROUP$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "group" element
         */
        public org.w3.x2001.xmlSchema.NamedGroup addNewGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NamedGroup target = null;
                target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().add_element_user(GROUP$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "group" element
         */
        public void removeGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUP$6, i);
            }
        }
        
        /**
         * Gets array of all "attributeGroup" elements
         */
        public org.w3.x2001.xmlSchema.NamedAttributeGroup[] getAttributeGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTRIBUTEGROUP$8, targetList);
                org.w3.x2001.xmlSchema.NamedAttributeGroup[] result = new org.w3.x2001.xmlSchema.NamedAttributeGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "attributeGroup" element
         */
        public org.w3.x2001.xmlSchema.NamedAttributeGroup getAttributeGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NamedAttributeGroup target = null;
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().find_element_user(ATTRIBUTEGROUP$8, i);
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
                return get_store().count_elements(ATTRIBUTEGROUP$8);
            }
        }
        
        /**
         * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAttributeGroupArray(org.w3.x2001.xmlSchema.NamedAttributeGroup[] attributeGroupArray)
        {
            check_orphaned();
            arraySetterHelper(attributeGroupArray, ATTRIBUTEGROUP$8);
        }
        
        /**
         * Sets ith "attributeGroup" element
         */
        public void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.NamedAttributeGroup attributeGroup)
        {
            generatedSetterHelperImpl(attributeGroup, ATTRIBUTEGROUP$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
         */
        public org.w3.x2001.xmlSchema.NamedAttributeGroup insertNewAttributeGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NamedAttributeGroup target = null;
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().insert_element_user(ATTRIBUTEGROUP$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
         */
        public org.w3.x2001.xmlSchema.NamedAttributeGroup addNewAttributeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NamedAttributeGroup target = null;
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().add_element_user(ATTRIBUTEGROUP$8);
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
                get_store().remove_element(ATTRIBUTEGROUP$8, i);
            }
        }
        
        /**
         * Gets the "schemaLocation" attribute
         */
        public java.lang.String getSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "schemaLocation" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSchemaLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMALOCATION$10);
                return target;
            }
        }
        
        /**
         * Sets the "schemaLocation" attribute
         */
        public void setSchemaLocation(java.lang.String schemaLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMALOCATION$10);
                }
                target.setStringValue(schemaLocation);
            }
        }
        
        /**
         * Sets (as xml) the "schemaLocation" attribute
         */
        public void xsetSchemaLocation(org.apache.xmlbeans.XmlAnyURI schemaLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMALOCATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SCHEMALOCATION$10);
                }
                target.set(schemaLocation);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$12) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$12);
            }
        }
    }
}
