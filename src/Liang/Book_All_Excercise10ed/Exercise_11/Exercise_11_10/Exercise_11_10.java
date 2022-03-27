package LiangExcercise10thAll.Exercise_11.Exercise_11_10; /*********************************************************************************
* (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented *
* using composition. Define a new stack class that extends ArrayList.            *
* Draw the UML diagram for the classes and then implement MyStack. Write a test  *
* program that prompts the user to enter five strings and displays them in       *
* reverse order.                                                                 *
*********************************************************************************/
import LiangExcercise10thAll.Exercise_13.Exercise_13_08.MyStack;

import java.util.Scanner;

public class Exercise_11_10 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a MyStack
		LiangExcercise10thAll.Exercise_13.Exercise_13_08.MyStack stack = new MyStack();

		// Prompt the user to enter five strings
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());	
		}

		// Display in reverse order
		System.out.println("Stack: " + stack.toString());
	}
}