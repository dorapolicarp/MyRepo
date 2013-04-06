/*
 * An XML document type.
 * Localname: complexContent
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ComplexContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one complexContent(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ComplexContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.ComplexContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComplexContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXCONTENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexContent");
    
    
    /**
     * Gets the "complexContent" element
     */
    public org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent getComplexContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent target = null;
            target = (org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent)get_store().find_element_user(COMPLEXCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complexContent" element
     */
    public void setComplexContent(org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent complexContent)
    {
        generatedSetterHelperImpl(complexContent, COMPLEXCONTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complexContent" element
     */
    public org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent addNewComplexContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent target = null;
            target = (org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent)get_store().add_element_user(COMPLEXCONTENT$0);
            return target;
        }
    }
    /**
     * An XML complexContent(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class ComplexContentImpl extends org.w3.x2001.xmlSchema.impl.AnnotatedImpl implements org.w3.x2001.xmlSchema.ComplexContentDocument.ComplexContent
    {
        private static final long serialVersionUID = 1L;
        
        public ComplexContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESTRICTION$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "restriction");
        private static final javax.xml.namespace.QName EXTENSION$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "extension");
        private static final javax.xml.namespace.QName MIXED$4 = 
            new javax.xml.namespace.QName("", "mixed");
        
        
        /**
         * Gets the "restriction" element
         */
        public org.w3.x2001.xmlSchema.ComplexRestrictionType getRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ComplexRestrictionType target = null;
                target = (org.w3.x2001.xmlSchema.ComplexRestrictionType)get_store().find_element_user(RESTRICTION$0, 0);
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
        public void setRestriction(org.w3.x2001.xmlSchema.ComplexRestrictionType restriction)
        {
            generatedSetterHelperImpl(restriction, RESTRICTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "restriction" element
         */
        public org.w3.x2001.xmlSchema.ComplexRestrictionType addNewRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ComplexRestrictionType target = null;
                target = (org.w3.x2001.xmlSchema.ComplexRestrictionType)get_store().add_element_user(RESTRICTION$0);
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
        public org.w3.x2001.xmlSchema.ExtensionType getExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ExtensionType target = null;
                target = (org.w3.x2001.xmlSchema.ExtensionType)get_store().find_element_user(EXTENSION$2, 0);
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
        public void setExtension(org.w3.x2001.xmlSchema.ExtensionType extension)
        {
            generatedSetterHelperImpl(extension, EXTENSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "extension" element
         */
        public org.w3.x2001.xmlSchema.ExtensionType addNewExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2001.xmlSchema.ExtensionType target = null;
                target = (org.w3.x2001.xmlSchema.ExtensionType)get_store().add_element_user(EXTENSION$2);
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
        
        /**
         * Gets the "mixed" attribute
         */
        public boolean getMixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIXED$4);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "mixed" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetMixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MIXED$4);
                return target;
            }
        }
        
        /**
         * True if has "mixed" attribute
         */
        public boolean isSetMixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MIXED$4) != null;
            }
        }
        
        /**
         * Sets the "mixed" attribute
         */
        public void setMixed(boolean mixed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIXED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIXED$4);
                }
                target.setBooleanValue(mixed);
            }
        }
        
        /**
         * Sets (as xml) the "mixed" attribute
         */
        public void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MIXED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MIXED$4);
                }
                target.set(mixed);
            }
        }
        
        /**
         * Unsets the "mixed" attribute
         */
        public void unsetMixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MIXED$4);
            }
        }
    }
}
