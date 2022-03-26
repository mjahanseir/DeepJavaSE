package COSC60220220211;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class C3ObservablePropertyDemo {
    public static void main(String[] args) {


        DoubleProperty balance= new SimpleDoubleProperty();

        balance.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("The new value of balance is " + balance.doubleValue());
            }
        });

        balance.set(4.5);
        System.out.println();
        System.out.println("Some thing else here");
        System.out.println();

        balance.set(10.5);

    }
}
