package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;

/**
 * Purpose: This class stores the information for a supplier. This includes
 * company name and contact name.
 */
public class Supplier implements Cloneable, Comparable<Supplier>
{
    /**
     * Store company name
     */
    private String companyName;
    /**
     * Store contact name
     */
    private String contactName;

    /**
     * Fully loaded constructor for the Supplier class.
     *
     * @param companyName Company name
     * @param contact Contact name
     */
    public Supplier(String companyName, String contact)
    {
        this.companyName = companyName;
        this.contactName = contact;
    }

    /**
     * Purpose: Create a copy of this supplier.
     *
     * @return A copy of this supplier
     */
    @Override
    public Supplier clone()
    {
        Supplier copy = null;
        try
        {
            copy = (Supplier) super.clone();
            // do a deep copy on any object references instance variables
            // not required for Strings
        }
        catch (CloneNotSupportedException cnse)
        {
            throw new RuntimeException("This should not happen", cnse);
        }
        return copy;
    }

    /**
     * Purpose: Compares this supplier to another supplier to sort based on
     * company name then contact name
     *
     * @param s The supplier to which this supplier is being compared
     * @return negative number, zero, or positive number
     */
    @Override
    public int compareTo(Supplier s)
    {
        int result = companyName.compareTo(s.companyName);
        if (result == 0)
        {
            result = contactName.compareTo(s.contactName);
        }
        return result;
    }

    /**
     * Purpose: Check for equality
     *
     * @param obj Object to be checked
     * @return true/false indication if they are equal
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean result = false;
        if (obj != null && getClass() == obj.getClass()) // test compatibility
        {
            Supplier s = (Supplier) obj; // cast the object as a supplier

            // Compare the supplier attributes.
            result = companyName.equals(s.companyName) &&
                    contactName.equals(s.contactName);
        }
        return result;
    }

    /**
     * Purpose: Create string representation of the class attributes
     *
     * @return String containing attribute values
     */
    @Override
    public String toString()
    {
        return getClass().getName() + "[ companyName = " + companyName +
                ", contactName = " + contactName + "]";
    }
}
