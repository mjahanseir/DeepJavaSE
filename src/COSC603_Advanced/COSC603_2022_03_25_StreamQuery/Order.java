package COSC603_Advanced.COSC603_2022_03_25_StreamQuery;
//02- Class
import java.time.LocalDate;
import java.util.Set;

public class Order {
    private int id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Customer costomer;

    Set<Product> products;

    //////////////////////   CONSTRUCTOR
    public Order(int id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer costomer) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.costomer = costomer;
    }
    //////////////////////   SETTER   &  GETTER
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Customer getCostomer() {
        return costomer;
    }
    public void setCostomer(Customer costomer) {
        this.costomer = costomer;
    }
    public Set<Product> getProducts() {
        return products;
    }
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
