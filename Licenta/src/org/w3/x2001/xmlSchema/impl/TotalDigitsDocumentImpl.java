/*
 * An XML document type.
 * Localname: totalDigits
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.TotalDigitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one totalDigits(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class TotalDigitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.TotalDigitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TotalDigitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALDIGITS$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "totalDigits");
    
    
    /**
     * Gets the "totalDigits" element
     */
    public org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits getTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().find_element_user(TOTALDIGITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "totalDigits" element
     */
    public void setTotalDigits(org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits totalDigits)
    {
        generatedSetterHelperImpl(totalDigits, TOTALDIGITS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "totalDigits" element
     */
    public org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits addNewTotalDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits)get_store().add_element_user(TOTALDIGITS$0);
            return target;
        }
    }
    /**
     * An XML totalDigits(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class TotalDigitsImpl extends org.w3.x2001.xmlSchema.impl.NumFacetImpl implements org.w3.x2001.xmlSchema.TotalDigitsDocument.TotalDigits
    {
        private static final long serialVersionUID = 1L;
        
        public TotalDigitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
