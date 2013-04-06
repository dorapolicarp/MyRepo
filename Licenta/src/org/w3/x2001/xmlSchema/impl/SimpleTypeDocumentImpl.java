/*
 * An XML document type.
 * Localname: simpleType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SimpleTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one simpleType(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SimpleTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.SimpleTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLETYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "simpleType");
    
    
    /**
     * Gets the "simpleType" element
     */
    public org.w3.x2001.xmlSchema.TopLevelSimpleType getSimpleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelSimpleType target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().find_element_user(SIMPLETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simpleType" element
     */
    public void setSimpleType(org.w3.x2001.xmlSchema.TopLevelSimpleType simpleType)
    {
        generatedSetterHelperImpl(simpleType, SIMPLETYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simpleType" element
     */
    public org.w3.x2001.xmlSchema.TopLevelSimpleType addNewSimpleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.TopLevelSimpleType target = null;
            target = (org.w3.x2001.xmlSchema.TopLevelSimpleType)get_store().add_element_user(SIMPLETYPE$0);
            return target;
        }
    }
}
