/*
 * An XML document type.
 * Localname: unique
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.UniqueDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one unique(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class UniqueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.UniqueDocument
{
    private static final long serialVersionUID = 1L;
    
    public UniqueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unique");
    
    
    /**
     * Gets the "unique" element
     */
    public org.w3.x2001.xmlSchema.Keybase getUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().find_element_user(UNIQUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unique" element
     */
    public void setUnique(org.w3.x2001.xmlSchema.Keybase unique)
    {
        generatedSetterHelperImpl(unique, UNIQUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unique" element
     */
    public org.w3.x2001.xmlSchema.Keybase addNewUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().add_element_user(UNIQUE$0);
            return target;
        }
    }
}
