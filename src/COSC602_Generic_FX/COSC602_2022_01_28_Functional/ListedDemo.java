package COSC60220220128Functional;

import java.util.*;
import java.util.function.Consumer;

public class ListedDemo {
    private static List<String>list= Arrays.asList("One","two","Three","four");

    public static void main(String[] args) {

        //pass unnamed instance to forEach
        list.forEach(new ConsumerImpl<>());

        System.out.println("+++++  create a class on the fly  ++++++");

        //create a class on the fly
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("++++++  lambda notation  +++++++++++++");

        //with lambda notation
        // NO-public NO-void NO_accept(NO-T t) {
         //   System.out.println(s);  }      t-> sout(t);
        list.forEach(t -> System.out.println(t));

        System.out.println("+++++    lambda notation with variable  ++++++++");

        Consumer consumer = t -> System.out.println(t);
        list.forEach(consumer);



        System.out.println("+++++  Hash Set and make Lambda expression   ++++++++");

        HashSet<Integer> myHash= new HashSet<>();
        myHash.add(1);
        myHash.add(2);
        myHash.add(4);
        myHash.add(7);
        myHash.add(3);
        myHash.add(5);

        System.out.println(myHash.toString());

        // public boolean test(T t){ return (t>1);)  => Lambda =  t->t>1
        myHash.removeIf(t->t>3);

        System.out.println(myHash.toString());

//        list.forEach();

    }
}
