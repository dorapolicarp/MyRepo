/*
 * An XML document type.
 * Localname: minLength
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.MinLengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one minLength(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MinLengthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.MinLengthDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinLengthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINLENGTH$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minLength");
    
    
    /**
     * Gets the "minLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet getMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().find_element_user(MINLENGTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "minLength" element
     */
    public void setMinLength(org.w3.x2001.xmlSchema.NumFacet minLength)
    {
        generatedSetterHelperImpl(minLength, MINLENGTH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "minLength" element
     */
    public org.w3.x2001.xmlSchema.NumFacet addNewMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NumFacet target = null;
            target = (org.w3.x2001.xmlSchema.NumFacet)get_store().add_element_user(MINLENGTH$0);
            return target;
        }
    }
}
