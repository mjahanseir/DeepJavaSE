package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Imtiaz_Thread4_Collection {
    public static void main(String[] args) throws InterruptedException {
        InventoryManagerSafe manager= new InventoryManagerSafe();

        Thread inventoryTask= new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask= new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();
       // inventoryTask.join();
        Thread.sleep(2000);
        displayTask.start();
    }
}

class ProductSafe {
    private int id;
    private String name;

    public ProductSafe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "id: " + id + " | name: " + name;
    }
}

class InventoryManagerSafe {
    List<ProductSafe> soldProductList= new CopyOnWriteArrayList<ProductSafe>();
    List<ProductSafe> purchasedProductList= new ArrayList<ProductSafe>();
   // Vector vector= new Vector();

    public void populateSoldProducts(){
        for(int i=0; i<1000; i++){
            ProductSafe prod= new ProductSafe(i , "Test_Product_"+i);
            soldProductList.add(prod);
            System.out.println("Added " + prod);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {  }
        }
    }
    public void displaySoldProducts(){
        for(ProductSafe product : soldProductList){
            System.out.println("Printing the Sold " + product);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {}
        }
    }
}


