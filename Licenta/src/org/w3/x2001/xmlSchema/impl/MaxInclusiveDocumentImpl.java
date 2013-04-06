/*
 * An XML document type.
 * Localname: maxInclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.MaxInclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one maxInclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MaxInclusiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.MaxInclusiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaxInclusiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXINCLUSIVE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "maxInclusive");
    
    
    /**
     * Gets the "maxInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMaxInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MAXINCLUSIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxInclusive" element
     */
    public void setMaxInclusive(org.w3.x2001.xmlSchema.Facet maxInclusive)
    {
        generatedSetterHelperImpl(maxInclusive, MAXINCLUSIVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxInclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMaxInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MAXINCLUSIVE$0);
            return target;
        }
    }
}
