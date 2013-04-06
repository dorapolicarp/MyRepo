/*
 * XML Type:  all
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.w3.x2001.xmlSchema.All
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.xmlSchema.impl;
/**
 * An XML all(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class AllImpl extends org.w3.x2001.xmlSchema.impl.ExplicitGroupImpl implements org.w3.x2001.xmlSchema.All
{
    private static final long serialVersionUID = 1L;
    
    public AllImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    
    /**
     * An XML minOccurs(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.xmlSchema.All$MinOccurs.
     */
    public static class MinOccursImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.w3.x2001.xmlSchema.All.MinOccurs
    {
        private static final long serialVersionUID = 1L;
        
        public MinOccursImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MinOccursImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML maxOccurs(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlNonNegativeInteger
     *     org.w3.x2001.xmlSchema.AllNNI$Member
     */
    public static class MaxOccursImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.w3.x2001.xmlSchema.All.MaxOccurs, org.apache.xmlbeans.XmlNonNegativeInteger, org.w3.x2001.xmlSchema.AllNNI.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MaxOccursImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MaxOccursImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
