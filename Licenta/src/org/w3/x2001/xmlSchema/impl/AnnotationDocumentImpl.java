/*
 * An XML document type.
 * Localname: annotation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one annotation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AnnotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.AnnotationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "annotation");
    
    
    /**
     * Gets the "annotation" element
     */
    public org.w3.x2001.xmlSchema.AnnotationDocument.Annotation getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.AnnotationDocument.Annotation target = null;
            target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotation" element
     */
    public void setAnnotation(org.w3.x2001.xmlSchema.AnnotationDocument.Annotation annotation)
    {
        generatedSetterHelperImpl(annotation, ANNOTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "annotation" element
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
     * An XML annotation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class AnnotationImpl extends org.w3.x2001.xmlSchema.impl.OpenAttrsImpl implements org.w3.x2001.xmlSchema.AnnotationDocument.Annotation
    {
        private static final long serialVersionUID = 1L;
        
        public AnnotationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APPINFO$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "appinfo");
        private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "documentation");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets array of all "appinfo" elements
         */
        public org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo[] getAppinfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(APPINFO$0, targetList);
                org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo[] result = new org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "appinfo" element
         */
        public org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo getAppinfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo target = null;
                target = (org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo)get_store().find_element_user(APPINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "appinfo" element
         */
        public int sizeOfAppinfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPINFO$0);
            }
        }
        
        /**
         * Sets array of all "appinfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAppinfoArray(org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo[] appinfoArray)
        {
            check_orphaned();
            arraySetterHelper(appinfoArray, APPINFO$0);
        }
        
        /**
         * Sets ith "appinfo" element
         */
        public void setAppinfoArray(int i, org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo appinfo)
        {
            generatedSetterHelperImpl(appinfo, APPINFO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "appinfo" element
         */
        public org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo insertNewAppinfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo target = null;
                target = (org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo)get_store().insert_element_user(APPINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "appinfo" element
         */
        public org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo addNewAppinfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo target = null;
                target = (org.w3.x2001.xmlSchema.AppinfoDocument.Appinfo)get_store().add_element_user(APPINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "appinfo" element
         */
        public void removeAppinfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPINFO$0, i);
            }
        }
        
        /**
         * Gets array of all "documentation" elements
         */
        public org.w3.x2001.xmlSchema.DocumentationDocument.Documentation[] getDocumentationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCUMENTATION$2, targetList);
                org.w3.x2001.xmlSchema.DocumentationDocument.Documentation[] result = new org.w3.x2001.xmlSchema.DocumentationDocument.Documentation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "documentation" element
         */
        public org.w3.x2001.xmlSchema.DocumentationDocument.Documentation getDocumentationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.DocumentationDocument.Documentation target = null;
                target = (org.w3.x2001.xmlSchema.DocumentationDocument.Documentation)get_store().find_element_user(DOCUMENTATION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "documentation" element
         */
        public int sizeOfDocumentationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCUMENTATION$2);
            }
        }
        
        /**
         * Sets array of all "documentation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDocumentationArray(org.w3.x2001.xmlSchema.DocumentationDocument.Documentation[] documentationArray)
        {
            check_orphaned();
            arraySetterHelper(documentationArray, DOCUMENTATION$2);
        }
        
        /**
         * Sets ith "documentation" element
         */
        public void setDocumentationArray(int i, org.w3.x2001.xmlSchema.DocumentationDocument.Documentation documentation)
        {
            generatedSetterHelperImpl(documentation, DOCUMENTATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "documentation" element
         */
        public org.w3.x2001.xmlSchema.DocumentationDocument.Documentation insertNewDocumentation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.DocumentationDocument.Documentation target = null;
                target = (org.w3.x2001.xmlSchema.DocumentationDocument.Documentation)get_store().insert_element_user(DOCUMENTATION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "documentation" element
         */
        public org.w3.x2001.xmlSchema.DocumentationDocument.Documentation addNewDocumentation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.DocumentationDocument.Documentation target = null;
                target = (org.w3.x2001.xmlSchema.DocumentationDocument.Documentation)get_store().add_element_user(DOCUMENTATION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "documentation" element
         */
        public void removeDocumentation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCUMENTATION$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
                return get_store().find_attribute_user(ID$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
                get_store().remove_attribute(ID$4);
            }
        }
    }
}
