package LiangExcercise10thAll.Exercise_19.Exercise_19_02; /**********************************************************************************
* (Implement GenericStack using inheritance) In Listing 19.1, GenericStack is     *
* implemented using composition. Define a new stack class that extends ArrayList. *
*                                                                                 *
* Draw the UML diagram for the classes and then implement GenericStack.           *
* Write a test program that prompts the user to enter five strings and displays   *
* them in reverse order.                                                          *
**********************************************************************************/
import LiangExcercise10thAll.Exercise_24.Exercise_24_04.GenericStack;

import java.util.Scanner;

public class Exercise_19_02 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a Stack
		LiangExcercise10thAll.Exercise_24.Exercise_24_04.GenericStack<String> stack = new GenericStack<>();

		// Prompt the user to enter five strings
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) 
			stack.push(input.next());

		// Display the strings in reverse order
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
	}
}