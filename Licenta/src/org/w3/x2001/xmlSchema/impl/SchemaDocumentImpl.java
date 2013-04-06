/*
 * An XML document type.
 * Localname: schema
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SchemaDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one schema(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SchemaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.SchemaDocument
{
    private static final long serialVersionUID = 1L;
    
    public SchemaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "schema");
    
    
    /**
     * Gets the "schema" element
     */
    public org.w3.x2001.xmlSchema.SchemaDocument.Schema getSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SchemaDocument.Schema target = null;
            target = (org.w3.x2001.xmlSchema.SchemaDocument.Schema)get_store().find_element_user(SCHEMA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "schema" element
     */
    public void setSchema(org.w3.x2001.xmlSchema.SchemaDocument.Schema schema)
    {
        generatedSetterHelperImpl(schema, SCHEMA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schema" element
     */
    public org.w3.x2001.xmlSchema.SchemaDocument.Schema addNewSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.SchemaDocument.Schema target = null;
            target = (org.w3.x2001.xmlSchema.SchemaDocument.Schema)get_store().add_element_user(SCHEMA$0);
            return target;
        }
    }
    /**
     * An XML schema(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class SchemaImpl extends org.w3.x2001.xmlSchema.impl.OpenAttrsImpl implements org.w3.x2001.xmlSchema.SchemaDocument.Schema
    {
        private static final long serialVersionUID = 1L;
        
        public SchemaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "include");
        private static final javax.xml.namespace.QName IMPORT$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "import");
        private static final javax.xml.namespace.QName REDEFINE$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "redefine");
        private static final javax.xml.namespace.QName ANNOTATION$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "annotation");
        private static final javax.xml.namespace.QName SIMPLETYPE$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
        private static final javax.xml.namespace.QName COMPLEXTYPE$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexType");
        private static final javax.xml.namespace.QName GROUP$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "group");
        private static final javax.xml.namespace.QName ATTRIBUTEGROUP$14 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
        private static final javax.xml.namespace.QName ELEMENT$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "element");
        private static final javax.xml.namespace.QName ATTRIBUTE$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "attribute");
        private static final javax.xml.namespace.QName NOTATION$20 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "notation");
        private static final javax.xml.namespace.QName TARGETNAMESPACE$22 = 
            new javax.xml.namespace.QName("", "targetNamespace");
        private static final javax.xml.namespace.QName VERSION$24 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName FINALDEFAULT$26 = 
            new javax.xml.namespace.QName("", "finalDefault");
        private static final javax.xml.namespace.QName BLOCKDEFAULT$28 = 
            new javax.xml.namespace.QName("", "blockDefault");
        private static final javax.xml.namespace.QName ATTRIBUTEFORMDEFAULT$30 = 
            new javax.xml.namespace.QName("", "attributeFormDefault");
        private static final javax.xml.namespace.QName ELEMENTFORMDEFAULT$32 = 
            new javax.xml.namespace.QName("", "elementFormDefault");
        private static final javax.xml.namespace.QName ID$34 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName LANG$36 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets array of all "include" elements
         */
        public org.w3.x2001.xmlSchema.IncludeDocument.Include[] getIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCLUDE$0, targetList);
                org.w3.x2001.xmlSchema.IncludeDocument.Include[] result = new org.w3.x2001.xmlSchema.IncludeDocument.Include[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "include" element
         */
        public org.w3.x2001.xmlSchema.IncludeDocument.Include getIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.IncludeDocument.Include target = null;
                target = (org.w3.x2001.xmlSchema.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "include" element
         */
        public int sizeOfIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDE$0);
            }
        }
        
        /**
         * Sets array of all "include" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIncludeArray(org.w3.x2001.xmlSchema.IncludeDocument.Include[] includeArray)
        {
            check_orphaned();
            arraySetterHelper(includeArray, INCLUDE$0);
        }
        
        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, org.w3.x2001.xmlSchema.IncludeDocument.Include include)
        {
            generatedSetterHelperImpl(include, INCLUDE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        public org.w3.x2001.xmlSchema.IncludeDocument.Include insertNewInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.IncludeDocument.Include target = null;
                target = (org.w3.x2001.xmlSchema.IncludeDocument.Include)get_store().insert_element_user(INCLUDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public org.w3.x2001.xmlSchema.IncludeDocument.Include addNewInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.IncludeDocument.Include target = null;
                target = (org.w3.x2001.xmlSchema.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "include" element
         */
        public void removeInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDE$0, i);
            }
        }
        
        /**
         * Gets array of all "import" elements
         */
        public org.w3.x2001.xmlSchema.ImportDocument.Import[] getImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPORT$2, targetList);
                org.w3.x2001.xmlSchema.ImportDocument.Import[] result = new org.w3.x2001.xmlSchema.ImportDocument.Import[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "import" element
         */
        public org.w3.x2001.xmlSchema.ImportDocument.Import getImportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ImportDocument.Import target = null;
                target = (org.w3.x2001.xmlSchema.ImportDocument.Import)get_store().find_element_user(IMPORT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "import" element
         */
        public int sizeOfImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPORT$2);
            }
        }
        
        /**
         * Sets array of all "import" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setImportArray(org.w3.x2001.xmlSchema.ImportDocument.Import[] ximportArray)
        {
            check_orphaned();
            arraySetterHelper(ximportArray, IMPORT$2);
        }
        
        /**
         * Sets ith "import" element
         */
        public void setImportArray(int i, org.w3.x2001.xmlSchema.ImportDocument.Import ximport)
        {
            generatedSetterHelperImpl(ximport, IMPORT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        public org.w3.x2001.xmlSchema.ImportDocument.Import insertNewImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ImportDocument.Import target = null;
                target = (org.w3.x2001.xmlSchema.ImportDocument.Import)get_store().insert_element_user(IMPORT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        public org.w3.x2001.xmlSchema.ImportDocument.Import addNewImport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ImportDocument.Import target = null;
                target = (org.w3.x2001.xmlSchema.ImportDocument.Import)get_store().add_element_user(IMPORT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "import" element
         */
        public void removeImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPORT$2, i);
            }
        }
        
        /**
         * Gets array of all "redefine" elements
         */
        public org.w3.x2001.xmlSchema.RedefineDocument.Redefine[] getRedefineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REDEFINE$4, targetList);
                org.w3.x2001.xmlSchema.RedefineDocument.Redefine[] result = new org.w3.x2001.xmlSchema.RedefineDocument.Redefine[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "redefine" element
         */
        public org.w3.x2001.xmlSchema.RedefineDocument.Redefine getRedefineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.RedefineDocument.Redefine target = null;
                target = (org.w3.x2001.xmlSchema.RedefineDocument.Redefine)get_store().find_element_user(REDEFINE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "redefine" element
         */
        public int sizeOfRedefineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REDEFINE$4);
            }
        }
        
        /**
         * Sets array of all "redefine" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRedefineArray(org.w3.x2001.xmlSchema.RedefineDocument.Redefine[] redefineArray)
        {
            check_orphaned();
            arraySetterHelper(redefineArray, REDEFINE$4);
        }
        
        /**
         * Sets ith "redefine" element
         */
        public void setRedefineArray(int i, org.w3.x2001.xmlSchema.RedefineDocument.Redefine redefine)
        {
            generatedSetterHelperImpl(redefine, REDEFINE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "redefine" element
         */
        public org.w3.x2001.xmlSchema.RedefineDocument.Redefine insertNewRedefine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.RedefineDocument.Redefine target = null;
                target = (org.w3.x2001.xmlSchema.RedefineDocument.Redefine)get_store().insert_element_user(REDEFINE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "redefine" element
         */
        public org.w3.x2001.xmlSchema.RedefineDocument.Redefine addNewRedefine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.RedefineDocument.Redefine target = null;
                target = (org.w3.x2001.xmlSchema.RedefineDocument.Redefine)get_store().add_element_user(REDEFINE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "redefine" element
         */
        public void removeRedefine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REDEFINE$4, i);
            }
        }
        
        /**
         * Gets array of all "annotation" elements
         */
        public org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] getAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ANNOTATION$6, targetList);
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
                target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$6, i);
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
                return get_store().count_elements(ANNOTATION$6);
            }
        }
        
        /**
         * Sets array of all "annotation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAnnotationArray(org.w3.x2001.xmlSchema.AnnotationDocument.Annotation[] annotationArray)
        {
            check_orphaned();
            arraySetterHelper(annotationArray, ANNOTATION$6);
        }
        
        /**
         * Sets ith "annotation" element
         */
        public void setAnnotationArray(int i, org.w3.x2001.xmlSchema.AnnotationDocument.Annotation annotation)
        {
            generatedSetterHelperImpl(annotation, ANNOTATION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().insert_element_user(ANNOTATION$6, i);
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
                target = (org.w3.x2001.xmlSchema.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$6);
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
                get_store().remove_element(ANNOTATION$6, i);
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
                get_store().find_all_element_users(SIMPLETYPE$8, targetList);
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
                target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().find_element_user(SIMPLETYPE$8, i);
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
                return get_store().count_elements(SIMPLETYPE$8);
            }
        }
        
        /**
         * Sets array of all "simpleType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleTypeArray(org.w3.x2001.xmlSchema.TopLevelSimpleType[] simpleTypeArray)
        {
            check_orphaned();
            arraySetterHelper(simpleTypeArray, SIMPLETYPE$8);
        }
        
        /**
         * Sets ith "simpleType" element
         */
        public void setSimpleTypeArray(int i, org.w3.x2001.xmlSchema.TopLevelSimpleType simpleType)
        {
            generatedSetterHelperImpl(simpleType, SIMPLETYPE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().insert_element_user(SIMPLETYPE$8, i);
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
                target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().add_element_user(SIMPLETYPE$8);
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
                get_store().remove_element(SIMPLETYPE$8, i);
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
                get_store().find_all_element_users(COMPLEXTYPE$10, targetList);
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
                target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().find_element_user(COMPLEXTYPE$10, i);
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
                return get_store().count_elements(COMPLEXTYPE$10);
            }
        }
        
        /**
         * Sets array of all "complexType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setComplexTypeArray(org.w3.x2001.xmlSchema.TopLevelComplexType[] complexTypeArray)
        {
            check_orphaned();
            arraySetterHelper(complexTypeArray, COMPLEXTYPE$10);
        }
        
        /**
         * Sets ith "complexType" element
         */
        public void setComplexTypeArray(int i, org.w3.x2001.xmlSchema.TopLevelComplexType complexType)
        {
            generatedSetterHelperImpl(complexType, COMPLEXTYPE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().insert_element_user(COMPLEXTYPE$10, i);
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
                target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().add_element_user(COMPLEXTYPE$10);
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
                get_store().remove_element(COMPLEXTYPE$10, i);
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
                get_store().find_all_element_users(GROUP$12, targetList);
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
                target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().find_element_user(GROUP$12, i);
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
                return get_store().count_elements(GROUP$12);
            }
        }
        
        /**
         * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupArray(org.w3.x2001.xmlSchema.NamedGroup[] groupArray)
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$12);
        }
        
        /**
         * Sets ith "group" element
         */
        public void setGroupArray(int i, org.w3.x2001.xmlSchema.NamedGroup group)
        {
            generatedSetterHelperImpl(group, GROUP$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().insert_element_user(GROUP$12, i);
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
                target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().add_element_user(GROUP$12);
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
                get_store().remove_element(GROUP$12, i);
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
                get_store().find_all_element_users(ATTRIBUTEGROUP$14, targetList);
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
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().find_element_user(ATTRIBUTEGROUP$14, i);
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
        public void setAttributeGroupArray(org.w3.x2001.xmlSchema.NamedAttributeGroup[] attributeGroupArray)
        {
            check_orphaned();
            arraySetterHelper(attributeGroupArray, ATTRIBUTEGROUP$14);
        }
        
        /**
         * Sets ith "attributeGroup" element
         */
        public void setAttributeGroupArray(int i, org.w3.x2001.xmlSchema.NamedAttributeGroup attributeGroup)
        {
            generatedSetterHelperImpl(attributeGroup, ATTRIBUTEGROUP$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().insert_element_user(ATTRIBUTEGROUP$14, i);
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
                target = (org.w3.x2001.xmlSchema.NamedAttributeGroup)get_store().add_element_user(ATTRIBUTEGROUP$14);
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
         * Gets array of all "element" elements
         */
        public org.w3.x2001.xmlSchema.TopLevelElement[] getElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELEMENT$16, targetList);
                org.w3.x2001.xmlSchema.TopLevelElement[] result = new org.w3.x2001.xmlSchema.TopLevelElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "element" element
         */
        public org.w3.x2001.xmlSchema.TopLevelElement getElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelElement target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelElement)get_store().find_element_user(ELEMENT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "element" element
         */
        public int sizeOfElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELEMENT$16);
            }
        }
        
        /**
         * Sets array of all "element" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setElementArray(org.w3.x2001.xmlSchema.TopLevelElement[] elementArray)
        {
            check_orphaned();
            arraySetterHelper(elementArray, ELEMENT$16);
        }
        
        /**
         * Sets ith "element" element
         */
        public void setElementArray(int i, org.w3.x2001.xmlSchema.TopLevelElement element)
        {
            generatedSetterHelperImpl(element, ELEMENT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "element" element
         */
        public org.w3.x2001.xmlSchema.TopLevelElement insertNewElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelElement target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelElement)get_store().insert_element_user(ELEMENT$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "element" element
         */
        public org.w3.x2001.xmlSchema.TopLevelElement addNewElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelElement target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelElement)get_store().add_element_user(ELEMENT$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "element" element
         */
        public void removeElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELEMENT$16, i);
            }
        }
        
        /**
         * Gets array of all "attribute" elements
         */
        public org.w3.x2001.xmlSchema.TopLevelAttribute[] getAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTRIBUTE$18, targetList);
                org.w3.x2001.xmlSchema.TopLevelAttribute[] result = new org.w3.x2001.xmlSchema.TopLevelAttribute[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "attribute" element
         */
        public org.w3.x2001.xmlSchema.TopLevelAttribute getAttributeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelAttribute target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().find_element_user(ATTRIBUTE$18, i);
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
                return get_store().count_elements(ATTRIBUTE$18);
            }
        }
        
        /**
         * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAttributeArray(org.w3.x2001.xmlSchema.TopLevelAttribute[] attributeArray)
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$18);
        }
        
        /**
         * Sets ith "attribute" element
         */
        public void setAttributeArray(int i, org.w3.x2001.xmlSchema.TopLevelAttribute attribute)
        {
            generatedSetterHelperImpl(attribute, ATTRIBUTE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attribute" element
         */
        public org.w3.x2001.xmlSchema.TopLevelAttribute insertNewAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelAttribute target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().insert_element_user(ATTRIBUTE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attribute" element
         */
        public org.w3.x2001.xmlSchema.TopLevelAttribute addNewAttribute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.TopLevelAttribute target = null;
                target = (org.w3.x2001.xmlSchema.TopLevelAttribute)get_store().add_element_user(ATTRIBUTE$18);
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
                get_store().remove_element(ATTRIBUTE$18, i);
            }
        }
        
        /**
         * Gets array of all "notation" elements
         */
        public org.w3.x2001.xmlSchema.NotationDocument.Notation[] getNotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOTATION$20, targetList);
                org.w3.x2001.xmlSchema.NotationDocument.Notation[] result = new org.w3.x2001.xmlSchema.NotationDocument.Notation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "notation" element
         */
        public org.w3.x2001.xmlSchema.NotationDocument.Notation getNotationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NotationDocument.Notation target = null;
                target = (org.w3.x2001.xmlSchema.NotationDocument.Notation)get_store().find_element_user(NOTATION$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "notation" element
         */
        public int sizeOfNotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTATION$20);
            }
        }
        
        /**
         * Sets array of all "notation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNotationArray(org.w3.x2001.xmlSchema.NotationDocument.Notation[] notationArray)
        {
            check_orphaned();
            arraySetterHelper(notationArray, NOTATION$20);
        }
        
        /**
         * Sets ith "notation" element
         */
        public void setNotationArray(int i, org.w3.x2001.xmlSchema.NotationDocument.Notation notation)
        {
            generatedSetterHelperImpl(notation, NOTATION$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "notation" element
         */
        public org.w3.x2001.xmlSchema.NotationDocument.Notation insertNewNotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NotationDocument.Notation target = null;
                target = (org.w3.x2001.xmlSchema.NotationDocument.Notation)get_store().insert_element_user(NOTATION$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "notation" element
         */
        public org.w3.x2001.xmlSchema.NotationDocument.Notation addNewNotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.NotationDocument.Notation target = null;
                target = (org.w3.x2001.xmlSchema.NotationDocument.Notation)get_store().add_element_user(NOTATION$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "notation" element
         */
        public void removeNotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTATION$20, i);
            }
        }
        
        /**
         * Gets the "targetNamespace" attribute
         */
        public java.lang.String getTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetNamespace" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$22);
                return target;
            }
        }
        
        /**
         * True if has "targetNamespace" attribute
         */
        public boolean isSetTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETNAMESPACE$22) != null;
            }
        }
        
        /**
         * Sets the "targetNamespace" attribute
         */
        public void setTargetNamespace(java.lang.String targetNamespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$22);
                }
                target.setStringValue(targetNamespace);
            }
        }
        
        /**
         * Sets (as xml) the "targetNamespace" attribute
         */
        public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$22);
                }
                target.set(targetNamespace);
            }
        }
        
        /**
         * Unsets the "targetNamespace" attribute
         */
        public void unsetTargetNamespace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETNAMESPACE$22);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlToken xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(VERSION$24);
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$24) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$24);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlToken version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(VERSION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(VERSION$24);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$24);
            }
        }
        
        /**
         * Gets the "finalDefault" attribute
         */
        public java.lang.Object getFinalDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINALDEFAULT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINALDEFAULT$26);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "finalDefault" attribute
         */
        public org.w3.x2001.xmlSchema.FullDerivationSet xgetFinalDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FullDerivationSet target = null;
                target = (org.w3.x2001.xmlSchema.FullDerivationSet)get_store().find_attribute_user(FINALDEFAULT$26);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FullDerivationSet)get_default_attribute_value(FINALDEFAULT$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "finalDefault" attribute
         */
        public boolean isSetFinalDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FINALDEFAULT$26) != null;
            }
        }
        
        /**
         * Sets the "finalDefault" attribute
         */
        public void setFinalDefault(java.lang.Object finalDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINALDEFAULT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINALDEFAULT$26);
                }
                target.setObjectValue(finalDefault);
            }
        }
        
        /**
         * Sets (as xml) the "finalDefault" attribute
         */
        public void xsetFinalDefault(org.w3.x2001.xmlSchema.FullDerivationSet finalDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FullDerivationSet target = null;
                target = (org.w3.x2001.xmlSchema.FullDerivationSet)get_store().find_attribute_user(FINALDEFAULT$26);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FullDerivationSet)get_store().add_attribute_user(FINALDEFAULT$26);
                }
                target.set(finalDefault);
            }
        }
        
        /**
         * Unsets the "finalDefault" attribute
         */
        public void unsetFinalDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FINALDEFAULT$26);
            }
        }
        
        /**
         * Gets the "blockDefault" attribute
         */
        public java.lang.Object getBlockDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCKDEFAULT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLOCKDEFAULT$28);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "blockDefault" attribute
         */
        public org.w3.x2001.xmlSchema.BlockSet xgetBlockDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.BlockSet target = null;
                target = (org.w3.x2001.xmlSchema.BlockSet)get_store().find_attribute_user(BLOCKDEFAULT$28);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.BlockSet)get_default_attribute_value(BLOCKDEFAULT$28);
                }
                return target;
            }
        }
        
        /**
         * True if has "blockDefault" attribute
         */
        public boolean isSetBlockDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BLOCKDEFAULT$28) != null;
            }
        }
        
        /**
         * Sets the "blockDefault" attribute
         */
        public void setBlockDefault(java.lang.Object blockDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCKDEFAULT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLOCKDEFAULT$28);
                }
                target.setObjectValue(blockDefault);
            }
        }
        
        /**
         * Sets (as xml) the "blockDefault" attribute
         */
        public void xsetBlockDefault(org.w3.x2001.xmlSchema.BlockSet blockDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.BlockSet target = null;
                target = (org.w3.x2001.xmlSchema.BlockSet)get_store().find_attribute_user(BLOCKDEFAULT$28);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.BlockSet)get_store().add_attribute_user(BLOCKDEFAULT$28);
                }
                target.set(blockDefault);
            }
        }
        
        /**
         * Unsets the "blockDefault" attribute
         */
        public void unsetBlockDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BLOCKDEFAULT$28);
            }
        }
        
        /**
         * Gets the "attributeFormDefault" attribute
         */
        public org.w3.x2001.xmlSchema.FormChoice.Enum getAttributeFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTEFORMDEFAULT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ATTRIBUTEFORMDEFAULT$30);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x2001.xmlSchema.FormChoice.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "attributeFormDefault" attribute
         */
        public org.w3.x2001.xmlSchema.FormChoice xgetAttributeFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FormChoice target = null;
                target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(ATTRIBUTEFORMDEFAULT$30);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FormChoice)get_default_attribute_value(ATTRIBUTEFORMDEFAULT$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "attributeFormDefault" attribute
         */
        public boolean isSetAttributeFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ATTRIBUTEFORMDEFAULT$30) != null;
            }
        }
        
        /**
         * Sets the "attributeFormDefault" attribute
         */
        public void setAttributeFormDefault(org.w3.x2001.xmlSchema.FormChoice.Enum attributeFormDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTEFORMDEFAULT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTRIBUTEFORMDEFAULT$30);
                }
                target.setEnumValue(attributeFormDefault);
            }
        }
        
        /**
         * Sets (as xml) the "attributeFormDefault" attribute
         */
        public void xsetAttributeFormDefault(org.w3.x2001.xmlSchema.FormChoice attributeFormDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FormChoice target = null;
                target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(ATTRIBUTEFORMDEFAULT$30);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FormChoice)get_store().add_attribute_user(ATTRIBUTEFORMDEFAULT$30);
                }
                target.set(attributeFormDefault);
            }
        }
        
        /**
         * Unsets the "attributeFormDefault" attribute
         */
        public void unsetAttributeFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ATTRIBUTEFORMDEFAULT$30);
            }
        }
        
        /**
         * Gets the "elementFormDefault" attribute
         */
        public org.w3.x2001.xmlSchema.FormChoice.Enum getElementFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENTFORMDEFAULT$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ELEMENTFORMDEFAULT$32);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x2001.xmlSchema.FormChoice.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "elementFormDefault" attribute
         */
        public org.w3.x2001.xmlSchema.FormChoice xgetElementFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FormChoice target = null;
                target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(ELEMENTFORMDEFAULT$32);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FormChoice)get_default_attribute_value(ELEMENTFORMDEFAULT$32);
                }
                return target;
            }
        }
        
        /**
         * True if has "elementFormDefault" attribute
         */
        public boolean isSetElementFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEMENTFORMDEFAULT$32) != null;
            }
        }
        
        /**
         * Sets the "elementFormDefault" attribute
         */
        public void setElementFormDefault(org.w3.x2001.xmlSchema.FormChoice.Enum elementFormDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENTFORMDEFAULT$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEMENTFORMDEFAULT$32);
                }
                target.setEnumValue(elementFormDefault);
            }
        }
        
        /**
         * Sets (as xml) the "elementFormDefault" attribute
         */
        public void xsetElementFormDefault(org.w3.x2001.xmlSchema.FormChoice elementFormDefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.FormChoice target = null;
                target = (org.w3.x2001.xmlSchema.FormChoice)get_store().find_attribute_user(ELEMENTFORMDEFAULT$32);
                if (target == null)
                {
                    target = (org.w3.x2001.xmlSchema.FormChoice)get_store().add_attribute_user(ELEMENTFORMDEFAULT$32);
                }
                target.set(elementFormDefault);
            }
        }
        
        /**
         * Unsets the "elementFormDefault" attribute
         */
        public void unsetElementFormDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEMENTFORMDEFAULT$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$34);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$34);
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
                return get_store().find_attribute_user(ID$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$34);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$34);
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
                get_store().remove_attribute(ID$34);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$36);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$36) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$36);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$36);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$36);
            }
        }
    }
}
