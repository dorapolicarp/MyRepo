/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one group(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "group");
    
    
    /**
     * Gets the "group" element
     */
    public org.w3.x2001.xmlSchema.NamedGroup getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamedGroup target = null;
            target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(org.w3.x2001.xmlSchema.NamedGroup group)
    {
        generatedSetterHelperImpl(group, GROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public org.w3.x2001.xmlSchema.NamedGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.NamedGroup target = null;
            target = (org.w3.x2001.xmlSchema.NamedGroup)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
