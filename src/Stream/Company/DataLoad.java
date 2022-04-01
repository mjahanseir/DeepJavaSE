package Stream.Company;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class DataLoad {

    //////// 1- Load Customers
    public static List<Customer> loadCustomer(String filePath){
        // read from customer.dat and create new customer object and
        List<Customer> custs = new ArrayList<>();
        try( Scanner custInput= new Scanner(  new File( filePath )  )  ){
            while (custInput.hasNext()) {
                String[] input = custInput.nextLine().split("\t");
                custs.add(new Customer(Integer.parseInt(input[0]), input[1], Integer.parseInt(input[2])));
            }
        }catch (FileNotFoundException ex){
            System.out.println("Error");
        }
        return  custs;
    }//End of loadCustomer Method

    //////// 2- Load Products
    public static List<Product> loadProducts(String filePath) {
        List<Product> prods = new ArrayList<>();
        try (Scanner prodtInput = new Scanner(new File(filePath))) {
            while (prodtInput.hasNext()) {
                String[] input = prodtInput.nextLine().split("\t");
                prods.add(new Product(Integer.parseInt(input[0]), input[2], input[1], Double.parseDouble(input[3])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }

        return prods;
    }
    //////// 3- Load Orders
    public static List<Order> loadOrders(String filePath, List<Customer> custList) {
        List<Order> ords = new ArrayList<>();
        try (Scanner ordInput = new Scanner(new File(filePath))) {
            while (ordInput.hasNext()) {
                String[] input = ordInput.nextLine().split("\t");
                // pull customer data to insert to order costructor -->>  private Customer costomer;
                // Customer currCust=custList.get(Integer.parseInt(input[4])-1);
                Customer currCust= custList.stream().filter(c->c.getId() == Integer.parseInt(input[4])).findAny().get();
                ords.add(new Order(Integer.parseInt(input[0]), LocalDate.parse(input[1]) , LocalDate.parse(input[2]) , input[3], currCust));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
        return ords;
    }
    //////// 4- Load ProductOrders
    public static void loadProductOrders(List<Product> products , List<Order> orders, String filePath){
        try (Scanner ordInput = new Scanner(new File(filePath))){
            products.stream().forEach(p->{
                List<Order> ords= new ArrayList<>();
                String[] input =  ordInput.nextLine().split(",");
                ords.addAll(orders
                        .stream()
                        .filter(o-> Arrays.asList(input).contains(String.valueOf(o.getId())))
                        .collect(Collectors.toList()));
                Set<Order> orderSet = ords.stream().collect(Collectors.toSet());
                p.setOrders(orderSet);
            });
        }catch(FileNotFoundException ex){
            System.out.println("Error");
        }
    }
    // 5- Load OrderProducts
    public static void loadOrderProducts(List<Product> products , List<Order> orders, String filePath){
        try (Scanner prodInput = new Scanner(new File(filePath))){
            orders.stream().forEach(o->{
                List<Product> prods= new ArrayList<>();
                String[] input =  prodInput.nextLine().split(",");
                for (String numid:input){
                    prods.add(products.stream().filter(p->p.getId() == Integer.parseInt(numid)).findAny().get());
                }
                Set<Product> prodset = prods.stream().collect(Collectors.toSet());
                o.setProducts(prodset);
            });
        }catch(FileNotFoundException ex){
            System.out.println("Error");
        }
    }
}//End of Class
