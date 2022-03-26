package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;

/**
 * Purpose: This class represents junior clothing. It inherits from the Product
 * class. It calculates the retail price based on applying only the GST tax
 * rate.
 */
public class JuniorClothing extends Clothing
{
    /**
     * Fully loaded constructor for the JuniorClothing class.
     *
     * @param name Name of the product
     * @param supplier Supplier of the product
     * @param price Price of the product
     * @param size Size of the product
     */
    public JuniorClothing(String name, Supplier supplier, float price,
                          String size)
    {
        super(name, supplier, price, size);
    }

    /**
     * Purpose: Override to return JuniorClothing type
     *
     * @return A deep copy of the object
     */
    @Override
    public JuniorClothing clone()
    {
        return (JuniorClothing) super.clone();
    }

    /**
     * Get the retail price
     *
     * @return price of the product plus the applied GST tax.
     */
    @Override
    public float getRetailPrice()
    {
        // No PST on children's clothes
        float taxAmount = price * GST_RATE;
        return price + taxAmount;
    }
}