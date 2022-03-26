package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;

/**
 * Purpose: The class represents a generic product. When calculating the retail
 * price apply both the GST and PST tax rates.
 */
public class Product implements Cloneable, Comparable<Product>, RetailItem
{
    /**
     * Store the product name
     */
    private String productName;
    /**
     * Store the supplier for the product
     */
    private Supplier supplier;
    /**
     * Store the price before taxes
     */
    protected float price;

    /**
     * Fully loaded constructor for the Product class.
     *
     * @param productName Name of the product
     * @param supplier Supplier of the product
     * @param price Price of the product
     */
    public Product(String productName, Supplier supplier, float price)
    {
        // Strings are immutable clone not required
        this.productName = productName;
        // To avoid privacy leaks, the supplier reference should be cloned
        this.supplier = supplier.clone();
        this.price = price;
    }

    /**
     * Compares this product to another product to sort based on supplier, then
     * on price.
     *
     * @param p The product to which this product is being compared
     * @return negative, zero, or positive value
     */
    @Override
    public int compareTo(Product p)
    {
        int result = supplier.compareTo(p.supplier);
        if (result == 0)
        {
            // Same supplier - check product name
            result = productName.compareTo(p.productName);
            if (result == 0)
            {
                // Same product name - sort on price
                result = Float.compare(price, p.price);
            }
        }
        return result;
    }

    /**
     * Creates a deep copy of this product.
     *
     * @return a copy of this product
     */
    @Override
    public Product clone()
    {
        Product copy = null;
        try
        {
            copy = (Product) super.clone();
            // do a deep copy on any object references
            copy.supplier = supplier.clone();
        }
        catch (CloneNotSupportedException cnse)
        {
            throw new RuntimeException("This should not happen", cnse);
        }
        return copy;
    }

    /**
     * Purpose: Display details for the product
     */
    public void displayDetails()
    {
        System.out.println(productName + " has a retail price of " +
                getRetailPrice());
    }

    /**
     * Compares this product to the given object to determine if they are equal.
     *
     * @param obj The object to which this product is being compared
     * @return true if they are equal according to all attributes
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean result = false;
        if (obj != null && getClass() == obj.getClass()) // test compatibility
        {
            Product p = (Product) obj; // cast the object as a product
            // Compare the product attributes.
            result = productName.equals(p.productName) &&
                    supplier.equals(p.supplier) && price == price;
        }
        return result;

    }

    /**
     * Calculates the retail price of this item, including taxes.
     *
     * @return the retail price
     */
    @Override
    public float getRetailPrice()
    {
        float taxAmount = price * (GST_RATE + PST_RATE);
        return price + taxAmount;
    }

    /**
     * Create a string representation of this product.
     *
     * @return a string with attribute values
     */
    @Override
    public String toString()
    {
        return getClass().getName() + "[ productName = " + productName +
                ", supplier = " + supplier + ", price = " + price + "]";
    }
}