package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    /*
    Question 5
    Implement the following method as a binary search using generics:
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
    Use listing 18.6 as your algorithm.

*/

    public static void main(String[] args) {

        List<Integer> numbers= new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
    }
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key){
        int low =0;
        int high =list.length - 1;
        return binarySearch(list, key, low, high);
    }
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key,int low, int high ) {

        int mid = (low + high) / 2;
        if (key.compareTo(list[mid]) < 0)
            return binarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return binarySearch(list, key, mid + 1, high);
    }
}
