package SetsMaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTypes {
    public static void main(String[] args) {

        HashSet<String> setOfStrings= new HashSet<>();

        setOfStrings.add("One");
        setOfStrings.add("Two");
        setOfStrings.add("Three");
        setOfStrings.add("Four");
        setOfStrings.add("Five");
        setOfStrings.add("Five");

        setOfStrings.remove("Three");


        HashSet<String> removeSet= new HashSet<>();
        removeSet.add("Two");
        removeSet.add("Three");
        removeSet.add("Ten");

        setOfStrings.removeAll(removeSet);


        Iterator<String> i= setOfStrings.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("****************************************");


        TreeSet<String> TreesetOfStrings= new TreeSet<>();

        TreesetOfStrings.add("One");
        TreesetOfStrings.add("Two");
        TreesetOfStrings.add("Three");
        TreesetOfStrings.add("Four");
        TreesetOfStrings.add("Five");
        TreesetOfStrings.add("Five");

        Iterator<String> i2= TreesetOfStrings.iterator();
        while(i2.hasNext())
            System.out.println(i2.next());

    }
}
