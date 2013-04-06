/*
 * An XML document type.
 * Localname: simpleContent
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SimpleContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one simpleContent(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SimpleContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.SimpleContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLECONTENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleContent");
    
    
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
     * An XML simpleContent(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class SimpleContentImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.SimpleContentDocument.SimpleContent
    {
        private static final long serialVersionUID = 1L;
        
        public SimpleContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESTRICTION$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "restriction");
        private static final javax.xml.namespace.QName EXTENSION$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "extension");
        
        
        /**
         * Gets the "restriction" element
         */
        public org.w3.x2001.xmlSchema.SimpleRestrictionType getRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.SimpleRestrictionType target = null;
                target = (org.w3.x2001.xmlSchema.SimpleRestrictionType)get_store().find_element_user(RESTRICTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "restriction" element
         */
        public boolean isSetRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESTRICTION$0) != 0;
            }
        }
        
        /**
         * Sets the "restriction" element
         */
        public void setRestriction(org.w3.x2001.xmlSchema.SimpleRestrictionType restriction)
        {
            generatedSetterHelperImpl(restriction, RESTRICTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "restriction" element
         */
        public org.w3.x2001.xmlSchema.SimpleRestrictionType addNewRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.SimpleRestrictionType target = null;
                target = (org.w3.x2001.xmlSchema.SimpleRestrictionType)get_store().add_element_user(RESTRICTION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "restriction" element
         */
        public void unsetRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESTRICTION$0, 0);
            }
        }
        
        /**
         * Gets the "extension" element
         */
        public org.w3.x2001.xmlSchema.SimpleExtensionType getExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.SimpleExtensionType target = null;
                target = (org.w3.x2001.xmlSchema.SimpleExtensionType)get_store().find_element_user(EXTENSION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "extension" element
         */
        public boolean isSetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENSION$2) != 0;
            }
        }
        
        /**
         * Sets the "extension" element
         */
        public void setExtension(org.w3.x2001.xmlSchema.SimpleExtensionType extension)
        {
            generatedSetterHelperImpl(extension, EXTENSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "extension" element
         */
        public org.w3.x2001.xmlSchema.SimpleExtensionType addNewExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.SimpleExtensionType target = null;
                target = (org.w3.x2001.xmlSchema.SimpleExtensionType)get_store().add_element_user(EXTENSION$2);
                return target;
            }
        }
        
        /**
         * Unsets the "extension" element
         */
        public void unsetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENSION$2, 0);
            }
        }
    }
}
