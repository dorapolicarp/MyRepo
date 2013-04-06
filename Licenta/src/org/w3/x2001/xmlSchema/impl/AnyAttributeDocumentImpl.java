/*
 * An XML document type.
 * Localname: anyAttribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.AnyAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one anyAttribute(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AnyAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.AnyAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnyAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANYATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    
    
    /**
     * Gets the "anyAttribute" element
     */
    public org.w3.x2001.xmlSchema.Wildcard getAnyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Wildcard target = null;
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().find_element_user(ANYATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.w3.x2001.xmlSchema.Wildcard anyAttribute)
    {
        generatedSetterHelperImpl(anyAttribute, ANYATTRIBUTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.w3.x2001.xmlSchema.Wildcard addNewAnyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Wildcard target = null;
            target = (org.w3.x2001.xmlSchema.Wildcard)get_store().add_element_user(ANYATTRIBUTE$0);
            return target;
        }
    }
}
