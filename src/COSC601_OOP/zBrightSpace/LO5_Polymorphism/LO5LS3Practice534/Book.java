package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;

/**
 * Purpose: This class represents book products. It calculates the retail price
 * based the price of the product - no taxes applied.
 */
public class Book extends Product
{
    /**
     * Fully loaded constructor
     *
     * @param name Name of the book
     * @param supplier Supplier of the book
     * @param price Price of the book
     */
    public Book(String name, Supplier supplier, float price)
    {
        super(name, supplier, price);
    }

    /**
     * Purpose: Override to return Book type
     *
     * @return A deep copy of the object
     */
    @Override
    public Book clone()
    {
        return (Book) super.clone();
    }

    /**
     * Determine retail price for books. No tax is applied.
     *
     * @return the price of the book
     */
    @Override
    public float getRetailPrice()
    {
        // No tax on books, just return price
        return price;
    }
}
