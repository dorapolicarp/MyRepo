/*
 * An XML document type.
 * Localname: minExclusive
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.MinExclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one minExclusive(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MinExclusiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.MinExclusiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinExclusiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINEXCLUSIVE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "minExclusive");
    
    
    /**
     * Gets the "minExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet getMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().find_element_user(MINEXCLUSIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "minExclusive" element
     */
    public void setMinExclusive(org.w3.x2001.xmlSchema.Facet minExclusive)
    {
        generatedSetterHelperImpl(minExclusive, MINEXCLUSIVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "minExclusive" element
     */
    public org.w3.x2001.xmlSchema.Facet addNewMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.Facet target = null;
            target = (org.w3.x2001.xmlSchema.Facet)get_store().add_element_user(MINEXCLUSIVE$0);
            return target;
        }
    }
}
