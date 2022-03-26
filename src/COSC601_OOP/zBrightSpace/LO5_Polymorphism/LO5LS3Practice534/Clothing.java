package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;
/**
 * Purpose: The class represents clothing. It inherits from the Product class
 * and adds a size attribute.
 */
public class Clothing extends Product
{
    /**
     * Tracks the size of the clothing item, e.g. XL, S
     */
    private String size;

    /**
     * Fully loaded constructor for the Clothing class.
     *
     * @param name Name of the product
     * @param supplier Supplier of the product
     * @param price Price of the product
     * @param size Size of the product
     */
    public Clothing(String name, Supplier supplier, float price, String size)
    {
        super(name, supplier, price);
        this.size = size;
    }

    /**
     * Purpose: Override to return Clothing type
     *
     * @return A deep copy of the object
     */
    @Override
    public Clothing clone()
    {
        return (Clothing) super.clone();
    }

    /**
     * Check for equality
     *
     * @param obj The object to which this object is being compared
     * @return True if all are equal, otherwise false
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean result = false;
        if (super.equals(obj)) // type and parent attributes match
        {
            // cast
            Clothing c = (Clothing) obj;
            // check our attributes
            result = size.equals(c.size);
        }
        return result;
    }

    /**
     * Purpose: Get the value for the size
     *
     * @return size of product
     */
    public String getSize()
    {
        return size;
    }

    /**
     * Create String representation
     *
     * @return A string representing the values for this object
     */
    @Override
    public String toString()
    {
        return super.toString() + "[ size = " + size + "]";
    }
}