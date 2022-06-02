package Collection2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10);

        System.out.println(arrayList);

        LinkedList<Object> linklist= new LinkedList<>();
        linklist.add(5);
        linklist.add("You");
        linklist.add("g");
        linklist.add(1.5);

        System.out.println(linklist);

        linklist.addFirst("green");

        System.out.println(linklist);

        linklist.removeLast();

        System.out.println(linklist);

    }

}
