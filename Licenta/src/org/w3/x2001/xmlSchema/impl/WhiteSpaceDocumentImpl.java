/*
 * An XML document type.
 * Localname: whiteSpace
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.WhiteSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * A document containing one whiteSpace(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class WhiteSpaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.xmlSchema.WhiteSpaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhiteSpaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHITESPACE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "whiteSpace");
    
    
    /**
     * Gets the "whiteSpace" element
     */
    public org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace getWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().find_element_user(WHITESPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "whiteSpace" element
     */
    public void setWhiteSpace(org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace whiteSpace)
    {
        generatedSetterHelperImpl(whiteSpace, WHITESPACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "whiteSpace" element
     */
    public org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace)get_store().add_element_user(WHITESPACE$0);
            return target;
        }
    }
    /**
     * An XML whiteSpace(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class WhiteSpaceImpl extends org.w3.x2001.xmlSchema.impl.FacetImpl implements org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace
    {
        private static final long serialVersionUID = 1L;
        
        public WhiteSpaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.WhiteSpaceDocument$WhiteSpace$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.xmlSchema.WhiteSpaceDocument.WhiteSpace.Value
        {
            private static final long serialVersionUID = 1L;
            
            public ValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
