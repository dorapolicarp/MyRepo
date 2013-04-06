/*
 * An XML document type.
 * Localname: enumeration
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.EnumerationDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one enumeration(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class EnumerationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.EnumerationDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnumerationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENUMERATION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "enumeration");
    
    
    /**
     * Gets the "enumeration" element
     */
    public org.w3.x2001.xmlSchema.NoFixedFacet getEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NoFixedFacet target = null;
            target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().find_element_user(ENUMERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "enumeration" element
     */
    public void setEnumeration(org.w3.x2001.xmlSchema.NoFixedFacet enumeration)
    {
        generatedSetterHelperImpl(enumeration, ENUMERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "enumeration" element
     */
    public org.w3.x2001.xmlSchema.NoFixedFacet addNewEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NoFixedFacet target = null;
            target = (org.w3.x2001.xmlSchema.NoFixedFacet)get_store().add_element_user(ENUMERATION$0);
            return target;
        }
    }
}
