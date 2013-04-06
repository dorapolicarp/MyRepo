/*
 * An XML document type.
 * Localname: complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ComplexTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one complexType(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ComplexTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.ComplexTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComplexTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXTYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "complexType");
    
    
    /**
     * Gets the "complexType" element
     */
    public org.w3.x2001.xmlSchema.TopLevelComplexType getComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelComplexType target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().find_element_user(COMPLEXTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complexType" element
     */
    public void setComplexType(org.w3.x2001.xmlSchema.TopLevelComplexType complexType)
    {
        generatedSetterHelperImpl(complexType, COMPLEXTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complexType" element
     */
    public org.w3.x2001.xmlSchema.TopLevelComplexType addNewComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelComplexType target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelComplexType)get_store().add_element_user(COMPLEXTYPE$0);
            return target;
        }
    }
}
