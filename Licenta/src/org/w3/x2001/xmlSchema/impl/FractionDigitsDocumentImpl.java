/*
 * An XML document type.
 * Localname: fractionDigits
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.FractionDigitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one fractionDigits(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class FractionDigitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.FractionDigitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FractionDigitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRACTIONDIGITS$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "fractionDigits");
    
    
    /**
     * Gets the "fractionDigits" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(FRACTIONDIGITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fractionDigits" element
     */
    public void setFractionDigits(org.w3.x2001.xmlSchema.NumFacet fractionDigits)
    {
        generatedSetterHelperImpl(fractionDigits, FRACTIONDIGITS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fractionDigits" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewFractionDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(FRACTIONDIGITS$0);
            return target;
        }
    }
}
