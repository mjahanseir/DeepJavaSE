package COSC603_Advanced.COSC603_2022_03_25_StreamQuery;
//05- Class

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMean {
    public static void main(String[] args) {
// Test 1- Load Customers
        List<Customer> customers= DataLoad.loadCustomer("src/COSC603_2022_03_23_Stearm/Customers.dat");
        System.out.println(customers.get(3).getName());

// Test 2- Load Products
        List<Product> products= DataLoad.loadProducts("src/COSC603_2022_03_23_Stearm/Product.dat");
        System.out.println(products.get(4).getCategory());

// Test 3- Load Order
        List<Order> orders= DataLoad.loadOrders("src/COSC603_2022_03_23_Stearm/Orders.dat", customers);
        System.out.println(orders.get(4).getCostomer().getName());

// Test 4
        DataLoad.loadProductOrders(products,orders,"src/COSC603_2022_03_23_Stearm/ProductOrders.dat");
        DataLoad.loadOrderProducts(products,orders,"src/COSC603_2022_03_23_Stearm/OrderProducts.dat");

        System.out.println(products.get(4).getOrders().stream().collect(Collectors.toList()).get(4).getStatus());
        System.out.println(products.get(4).getOrders().toString());






////////////////////  List of product with price >200
        System.out.println("////////////////////  List of product with price >  200     ////////////////////");
        List<Product> pro200=products.
                stream()
                .filter(p -> p.getPrice()>200)
                .collect(Collectors.toList());
        for(Product p: pro200)
            System.out.println(p.getId() + "  " + p.getCategory() + " " + p.getPrice());



////////////////////  List of books  with price < 100
        System.out.println(" ////////////////////  List of books  with price < 100     ////////////////////");
        List<Product> books =products.
                stream()
                .filter(p -> p.getPrice()<100 )
                .filter(p -> p.getCategory().equalsIgnoreCase("Books" ))
                .collect(Collectors.toList());
        for(Product p: books)
            System.out.println(p.getId() + "  " + p.getCategory() + " " + p.getPrice());



////////////////////  List of orders with baby products
        System.out.println("      ////////////////////  List of orders with baby products    ////////////////////");
        List<Order> baby =  orders
                .stream()
                .filter(o -> o.getProducts()
                        .stream()
                        .anyMatch(
                                p->p.getCategory()
                                        .equals("Baby")
                        )
                )
                .collect(Collectors.toList());

        for(Order o: baby)
            System.out.println(o.getId() );


////////////////////  Get a List of Toys  and Discount it by %10
        System.out.println("      ////////////////////  Get a List of Toys  and Discount it by %10    ////////////////////");
        List<Product> toys =  products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(  p ->p.withPrice(   p.getPrice() * 0.9))
                .collect(Collectors.toList());

        for(Order o: baby)
            System.out.println(o.getId() );



////////////////////  Get a List of Product ordered by Tier2  Customer  Between Feb 1 to Apr 1 2021
        System.out.println("      //////////////////// Get a List of Product ordered by Tier 2  Customer  Between Feb 1 to Apr 1 2021    ////////////////////");
        List<Product> ordered =  orders
                .stream()
                .filter(o ->o.getCostomer().getTier()==2)
                .filter(o ->o.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >=0 )
                .filter(o ->o.getOrderDate().compareTo(LocalDate.of(2021,4,1)) <=0 )
                .flatMap(o-> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        for(Product o: ordered)
            System.out.println(o.getId() );



    }// End of main

}//End of Program
