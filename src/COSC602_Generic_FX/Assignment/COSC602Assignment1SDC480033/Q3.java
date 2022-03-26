package Assignment1;

import java.util.Scanner;

public class Q3 {
    /*
    Question 3
    Write a recursive method to print all the permutations of a string. For example, for the string abc, the
    permutation is
    abc
    acb
    bac
    bca
    cab
    cba

    As we did in class, you will create your solution as two methods...one helper and one that does the
    work:
    public static void displayPermutation(String s)
    public static void displayPermutation(String s1, String s2)
    The first method simply invokes displayPermutation(" ", s). The second method uses a loop to move a
    character from s2 to s1 and recursively invokes it with new s1 and s2. The base case is that s2 is empty
    and prints s1 to the console.
    Write a test program that prompts the user to enter a string and displays all its permutations.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string and displays all its permutations : ");
        String str= input.nextLine();
        displayPermutation(str);
    }
    public static void displayPermutation(String s){
        displayPermutation("", s);
    }
    public static void displayPermutation(String s1, String s2){
        int size= s2.length();
        if (size == 0) {
            System.out.println(s1);
        } else {
            for (int i = 0; i < size; i++) {
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
            }
        }
    }
}
