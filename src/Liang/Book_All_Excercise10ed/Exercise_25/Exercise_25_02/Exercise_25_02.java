package LiangExcercise10thAll.Exercise_25.Exercise_25_02;

import LiangExcercise10thAll.Exercise_25.Exercise_25_03.BST;

/*********************************************************************************
* (Test full binary tree) A full binary tree is a binary tree with the leaves on *
* the same level. Add a method in the BST class to return true if the tree is a  *
* full binary tree. (Hint: The number of nodes in a full binary tree is          *
* 2^depth - 1.)                                                                  *
*                                                                                *
* ** Returns true if the tree is a full binary tree * *                          *
* boolean isFullBST()                                                            *
*********************************************************************************/

public class Exercise_25_02 {
	public static void main(String[] args) {
		// Create threee Integer BST
		Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
		Integer[] numbers2 = {4, 2, 1, 3, 8, 5, 9};
		Integer[] numbers3 = {10, 4, 2, 1, 3, 8, 5, 9, 15, 12, 11, 13, 21, 19, 25};
		LiangExcercise10thAll.Exercise_25.Exercise_25_03.BST<Integer> intTree = new LiangExcercise10thAll.Exercise_25.Exercise_25_03.BST<>(numbers);
		LiangExcercise10thAll.Exercise_25.Exercise_25_03.BST<Integer> intTree2 = new LiangExcercise10thAll.Exercise_25.Exercise_25_03.BST<>(numbers2);
		LiangExcercise10thAll.Exercise_25.Exercise_25_03.BST<Integer> intTree3 = new BST<>(numbers3);

		// Test and display if each tree is a full binary tree
		System.out.print("\nIs tree #1 a full binary tree? ");
		System.out.println(intTree.isFullBST());
		System.out.print("\nIs tree #2 a full binary tree? ");
		System.out.println(intTree2.isFullBST());
		System.out.print("\nIs tree #3 a full binary tree? ");
		System.out.println(intTree3.isFullBST());
	}
}