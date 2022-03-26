import java.util.ArrayList;

public class GenericsIntro {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>();

        myList.add("Derrick");
        myList.add("Mohammad");
        myList.add("Nil");
//        myList.add(5);
        myList.add("Manpreet");

        for (Object name : myList)
            System.out.println(name);
    }
}
