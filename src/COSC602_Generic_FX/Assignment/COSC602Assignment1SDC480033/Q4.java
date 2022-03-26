package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    /*
    Question 4                    [10 Marks]
    Write the following method that returns a new ArrayList.
    The new list contains the nonduplicate elements from the original list.
    You may NOT use anything with regards to Sets for this question.
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
     */
    public static void main(String[] args) {

        ArrayList<Integer> myList= new ArrayList<>();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("First : " + Arrays.toString(myList.toArray()));
        System.out.println("No Duplication: "+ Arrays.toString(removeDuplicates(myList).toArray()));

        System.out.println("******************************");

        ArrayList<String> myList2= new ArrayList<>();
        myList2.add("Mike");
        myList2.add("Mat");
        myList2.add("Tom");
        myList2.add("Mike");
        myList2.add("Tom");
        System.out.println("First : " + Arrays.toString(myList2.toArray()));
        System.out.println("No Duplication: "+ Arrays.toString(removeDuplicates(myList2).toArray()));

    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> nonDuplicate = new ArrayList<>();
        //////////////////////////////////////////////////////////
        for (E nD : list)
            nonDuplicate.add(nD);
        for(int i=0;i<nonDuplicate.size();i++) {
            for (int j = i + 1; j < nonDuplicate.size(); j++) {
                if (nonDuplicate.get(i).equals(nonDuplicate.get(j))) {
                    nonDuplicate.remove(j);
                    j--;
                }
            }
        }
       /*///////////////////   OR   /////////////////////////////////////
        for (E nD : list) {
            if (!nonDuplicate.contains(nD))
                nonDuplicate.add(nD);
        }     */
        return nonDuplicate;
    }
}
