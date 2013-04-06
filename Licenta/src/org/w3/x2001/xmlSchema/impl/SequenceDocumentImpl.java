/*
 * An XML document type.
 * Localname: sequence
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.SequenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one sequence(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SequenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.SequenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SequenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "sequence");
    
    
    /**
     * Gets the "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup getSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().find_element_user(SEQUENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.w3.x2001.xmlSchema.ExplicitGroup sequence)
    {
        generatedSetterHelperImpl(sequence, SEQUENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.w3.x2001.xmlSchema.ExplicitGroup addNewSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.ExplicitGroup target = null;
            target = (org.w3.x2001.xmlSchema.ExplicitGroup)get_store().add_element_user(SEQUENCE$0);
            return target;
        }
    }
}
