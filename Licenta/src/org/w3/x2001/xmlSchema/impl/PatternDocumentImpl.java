/*
 * An XML document type.
 * Localname: pattern
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.PatternDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one pattern(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class PatternDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.PatternDocument
{
    private static final long serialVersionUID = 1L;
    
    public PatternDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATTERN$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "pattern");
    
    
    /**
     * Gets the "pattern" element
     */
    public org.w3.x2001.xmlSchema.PatternDocument.Pattern getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.PatternDocument.Pattern target = null;
            target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().find_element_user(PATTERN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pattern" element
     */
    public void setPattern(org.w3.x2001.xmlSchema.PatternDocument.Pattern pattern)
    {
        generatedSetterHelperImpl(pattern, PATTERN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pattern" element
     */
    public org.w3.x2001.xmlSchema.PatternDocument.Pattern addNewPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.PatternDocument.Pattern target = null;
            target = (org.w3.x2001.xmlSchema.PatternDocument.Pattern)get_store().add_element_user(PATTERN$0);
            return target;
        }
    }
    /**
     * An XML pattern(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class PatternImpl extends org.w3.x2001.xmlSchema.impl.NoFixedFacetImpl implements org.w3.x2001.xmlSchema.PatternDocument.Pattern
    {
        private static final long serialVersionUID = 1L;
        
        public PatternImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
