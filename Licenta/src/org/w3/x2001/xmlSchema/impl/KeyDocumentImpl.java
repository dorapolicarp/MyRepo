/*
 * An XML document type.
 * Localname: key
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.KeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one key(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class KeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.KeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "key");
    
    
    /**
     * Gets the "key" element
     */
    public org.w3.x2001.xmlSchema.Keybase getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(org.w3.x2001.xmlSchema.Keybase key)
    {
        generatedSetterHelperImpl(key, KEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "key" element
     */
    public org.w3.x2001.xmlSchema.Keybase addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Keybase target = null;
            target = (org.w3.x2001.xmlSchema.Keybase)get_store().add_element_user(KEY$0);
            return target;
        }
    }
}
