package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();

        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator= collection.iterator();

        //Iterator has two Particular Methods:
        //hasNext and  next
        while(iterator.hasNext()){
            String currentValue= iterator.next();
//            System.out.println(currentValue);
            if (currentValue.equals("Dallas"))
                iterator.remove();
        }

        //We also have a ListIterator that is similar but
        // has additional methods:
        //previous, has Previous, set , add

//        ListIterator<String> collIterator= collection.listIterator();
//        System.out.println(collIterator.nextIndex() + " " + collIterator.next());
//        System.out.println(collIterator.nextIndex() + " " + collIterator.next());
//        System.out.println(collIterator.nextIndex() + " " + collIterator.next());
//        System.out.println(collIterator.previousIndex() + " " + collIterator.previous());


        ListIterator<String> collIterator= collection.listIterator(collection.size());

        while (collIterator.hasPrevious()){
            System.out.println(collIterator.previous());
            if(collIterator.previousIndex()==1)
                collIterator.set("Saskatoon");
        }


        for (String s: collection)
            System.out.println(s);
    }
}
