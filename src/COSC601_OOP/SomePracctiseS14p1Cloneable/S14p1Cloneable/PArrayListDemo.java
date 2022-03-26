package SomePracctiseS14p1Cloneable.S14p1Cloneable;

import java.util.ArrayList;
import java.util.Vector;

public class PArrayListDemo {
    public static void main(String[] args) {

//        - ArrayLists are like Arrays but much more CONVINENT
//                - ONLY STORE OBJECTS

        // ARRAY LIST ONLY STORE OBJECT
        // FOR PRIMITIVE TYPE WE HAVE TO USE WRAPPER CLASS
        ArrayList<String> names=new ArrayList<>();  // OLD version of Java :ArrayList<String> names=new ArrayList<String>();
        Vector<String>  vName= new Vector<>();

        String[] name= new String[10];

        // add() method for adding items to an arraylist
        names.add("Bill");
        names.add("Foram");
        names.add("Ruby");
        names.add("Dhru");
        names.add("Neel");

        System.out.println(names);

//        names.remove("Bill");// REMOVE by Value
//        System.out.println(names);
//
//        names.remove(0); // Remove by INDEX
//        System.out.println(names);


        ArrayList<String> filters= new ArrayList<>();
        filters.add("Bill");
        filters.add("Neel");

        names.removeAll(filters);
        System.out.println(names);

        ArrayList<String> insertion= new ArrayList<>();
        insertion.add("Bill");
        insertion.add("Neel");

        names.addAll(insertion);

        names.add(1,"joe");

    }
}
