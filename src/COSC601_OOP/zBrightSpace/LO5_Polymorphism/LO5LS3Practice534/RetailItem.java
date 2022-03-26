package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;

/**
 * Purpose: This interface defines the tax rates and a method to be provide for
 * all classes with a retail price.
 */
public interface RetailItem
{
    /**
     * GST rate
     */
    public static final float GST_RATE = .05f;

    /**
     * PST rate
     */
    public static final float PST_RATE = .05f;

    /**
     * Purpose: Calculate the final price of the product
     *
     * @return final price of product
     */
    public float getRetailPrice();
}
