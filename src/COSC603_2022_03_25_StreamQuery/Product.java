package COSC603_2022_03_25_StreamQuery;
//03- Class
import java.util.Set;

public class Product {
    private int id;
    private String name;
    private String category;
    private Double price;

    Set<Order> orders;

    //////////////////////   CONSTRUCTOR
    public Product(int id, String name,String category,  Double price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }
    //////////////////////   SETTER   &  GETTER
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }



    public Product withPrice(Double price) {
        Product p = new Product(this.id, this.name,this.category, this.price);
        p.price= price;
        return p;
    }

    public Set<Order> getOrders() {
        return orders;
    }
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
