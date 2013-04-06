/*
 * An XML document type.
 * Localname: element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.ElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one element(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class ElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.ElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public ElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "element");
    
    
    /**
     * Gets the "element" element
     */
    public org.w3.x2001.xmlSchema.TopLevelElement getElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelElement target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelElement)get_store().find_element_user(ELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "element" element
     */
    public void setElement(org.w3.x2001.xmlSchema.TopLevelElement element)
    {
        generatedSetterHelperImpl(element, ELEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "element" element
     */
    public org.w3.x2001.xmlSchema.TopLevelElement addNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelElement target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelElement)get_store().add_element_user(ELEMENT$0);
            return target;
        }
    }
}
