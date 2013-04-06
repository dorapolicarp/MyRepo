/*
 * An XML document type.
 * Localname: length
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.LengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one length(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class LengthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.LengthDocument
{
    private static final long serialVersionUID = 1L;
    
    public LengthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENGTH$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "length");
    
    
    /**
     * Gets the "length" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(LENGTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "length" element
     */
    public void setLength(org.w3.x2001.xmlSchema.NumFacet length)
    {
        generatedSetterHelperImpl(length, LENGTH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "length" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(LENGTH$0);
            return target;
        }
    }
}
