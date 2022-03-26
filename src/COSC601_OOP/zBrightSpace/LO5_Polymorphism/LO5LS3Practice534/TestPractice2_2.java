package zBrightSpace.LO5_Polymorphism.LO5LS3Practice534;

/**
 * Purpose: Tests the classes created for practice 2.2.
 */
public class TestPractice2_2
{
    /**
     * Purpose: Main method - program starts here.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Supplier supp = new Supplier("ABC Company", "John Smith");
        Product prod = new Product("Lawn Mower", supp, 300);
        Book book = new Book("Java is Great!", supp, 50);
        JuniorClothing jc = new JuniorClothing("Sweat pants", supp, 10, "small");
        Clothing cloth = new Clothing("Sweater", supp, 100, "med");

        testTypes(supp);
        testTypes(prod);
        testTypes(book);
        testTypes(jc);
        testTypes(cloth);

        testEquals(supp, supp.clone(),
                new Supplier("Not same", "John Smith"));
        testEquals(prod, prod.clone(),
                new Product("Not same", supp, 300));
        testEquals(cloth, cloth.clone(),
                new Clothing("Sweater", supp, 100, "large"));
        testEquals(jc, jc.clone(),
                new Clothing("Sweat pants", supp, 10, "small"));

        testSupplierCompareTo();
        testProductCompareTo();
    }

    /**
     * Purpose: Checks the given object against the different types using
     * instanceof.
     *
     * @param obj The object to check
     */
    private static void testTypes(Object obj)
    {
        System.out.println("=========================");
        System.out.println("Checking types for " + obj);
        System.out.println("Class type is " +
                obj.getClass().getName());
        System.out.println("Is it a Supplier?       " +
                (obj instanceof Supplier));
        System.out.println("Is it a RetailItem?     " +
                (obj instanceof RetailItem));
        System.out.println("Is it a Product?        " +
                (obj instanceof Product));
        System.out.println("Is it a Book?           " +
                (obj instanceof Book));
        System.out.println("Is it a Clothing?       " +
                (obj instanceof Clothing));
        System.out.println("Is it a JuniorClothing? " +
                (obj instanceof JuniorClothing));
    }

    /**
     * Purpose: Tests equals methods.
     *
     * @param obj The object to test
     * @param objEqual The object that should be equal
     * @param objNotEqual The object that should not be equal
     */
    private static void testEquals(Object obj, Object objEqual,
                                   Object objNotEqual)
    {
        System.out.println("=========================");
        System.out.println("obj is         " + obj);
        System.out.println("objEqual is    " + objEqual);
        System.out.println("objNotEqual is " + objNotEqual);
        System.out.println("obj == objEqual should be         false: " +
                (obj == objEqual));
        System.out.println("obj.equals(objEqual) should be    true:  " +
                obj.equals(objEqual));
        System.out.println("obj.equals(objNotEqual) should be false: " +
                obj.equals(objNotEqual));
        System.out.println("obj.equals(null) should be        false: " +
                obj.equals(null));
        System.out.println("obj.equals(\"hello\") should be     false: " +
                obj.equals("hello"));
    }

    /**
     * Purpose: Tests all parts of the compareTo method for the Supplier class.
     */
    private static void testSupplierCompareTo()
    {
        Supplier s1 = new Supplier("ABC", "Joe");
        Supplier s2 = s1.clone();
        Supplier s3 = new Supplier("XYZ", "Joe");
        Supplier s4 = new Supplier("ABC", "Tom");

        System.out.println("=========================");
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        System.out.println("s4 is " + s4);

        // equal objects
        System.out.println("s1.compareTo(s2) should be 0 : " + s1.compareTo(s2));
        // different companyName
        System.out.println("s1.compareTo(s3) should be <0: " + s1.compareTo(s3));
        System.out.println("s3.compareTo(s1) should be >0: " + s3.compareTo(s1));
        // different contactName
        System.out.println("s1.compareTo(s4) should be <0: " + s1.compareTo(s4));
        System.out.println("s4.compareTo(s1) should be >0: " + s4.compareTo(s1));
    }

    /**
     * Purpose: Tests all parts of the compareTo method for the Product class.
     */
    private static void testProductCompareTo()
    {
        Supplier s1 = new Supplier("ABC", "Joe");
        Supplier s2 = new Supplier("XYZ", "Joe");
        Product p1 = new Product("Arc", s1, 30);
        Product p2 = p1.clone();
        Product p3 = new Product("Arc", s2, 30);
        Product p4 = new Product("Car", s1, 30);
        Product p5 = new Product("Arc", s1, 50);

        System.out.println("=========================");
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println("p3 is " + p3);
        System.out.println("p4 is " + p4);
        System.out.println("p5 is " + p5);

        // equal objects
        System.out.println("p1.compareTo(p2) should be 0 : " + p1.compareTo(p2));
        // different supplier
        System.out.println("p1.compareTo(p3) should be <0: " + p1.compareTo(p3));
        System.out.println("p3.compareTo(p1) should be >0: " + p3.compareTo(p1));
        // different productName
        System.out.println("p1.compareTo(p4) should be <0: " + p1.compareTo(p4));
        System.out.println("p4.compareTo(p1) should be >0: " + p4.compareTo(p1));
        // different price
        System.out.println("p1.compareTo(p5) should be <0: " + p1.compareTo(p5));
        System.out.println("p5.compareTo(p1) should be >0: " + p5.compareTo(p1));
    }
}