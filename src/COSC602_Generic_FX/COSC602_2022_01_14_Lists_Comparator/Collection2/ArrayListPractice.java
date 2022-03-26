package Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListPractice {
    public static void main(String[] args) {


//        ArrayList<String> nameList= new ArrayList<>();
        Vector<String> nameList= new Vector<>();
        nameList.add("Derrick");
        nameList.add("Dave");
        nameList.add("Joe");

        System.out.println("List of names: ");
        System.out.println(nameList);

        System.out.println("Is Dave in the list? " + nameList.contains("Dave"));

        nameList.remove("Dave");
        System.out.println(nameList);

        List<String> addList= new ArrayList<>();
        addList.add("Bob");
        addList.add("John");

        nameList.addAll(addList);

        System.out.println(nameList);


        List<String> removeList= new ArrayList<>();
        addList.add("Bob");
        addList.add("Joe");


        nameList.removeAll(removeList);

        System.out.println(nameList);



    }
}
