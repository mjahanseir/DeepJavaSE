package LiangExcercise10thAll.Exercise_24.Exercise_24_01; /*********************************************************************************
* (Add set operations in MyList) Define the following methods in MyList and      *
* implement them in MyAbstractList:                                              *
*                                                                                *
* Write a test program that creates two MyArrayLists, list1 and list2, with the  *
* initial values {"Tom", "George", "Peter", "Jean", "Jane"} and {"Tom", "George",*
* "Michael", "Michelle", "Daniel"}, then perform the following operations:       *
*                                                                                *
* ■ Invokes list1.addAll(list2), and displays list1 and list2.                   *
* ■ Recreates list1 and list2 with the same initial values, invokes              *
*   list1.removeAll(list2), and displays list1 and list2.                        *
* ■ Recreates list1 and list2 with the same initial values, invokes              *
*   list1.retainAll(list2), and displays list1 and list2.                        *
*********************************************************************************/
import LiangExcercise10thAll.Exercise_24.Exercise_24_02.MyList;
import LiangExcercise10thAll.Exercise_27.Exercise_27_10.MyArrayList;

public class Exercise_24_01 {
	public static void main(String[] args) {
		// Create two MyArrayLists
		String[] array1 = {"Tom", "George", "Peter", "Jean", "Jane"};
		LiangExcercise10thAll.Exercise_24.Exercise_24_02.MyList<String> list1 = new LiangExcercise10thAll.Exercise_27.Exercise_27_10.MyArrayList<>(array1);

		String[] array2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};
		LiangExcercise10thAll.Exercise_24.Exercise_24_02.MyList<String> list2 = new LiangExcercise10thAll.Exercise_27.Exercise_27_10.MyArrayList<>(array2);
		System.out.println("Create two MyArrayLists:");
		print(list1, list2);
		
		
		// Invoke list1.addAll(list2), and displays list1 and list2.
		System.out.println("Invoke list1.addAll(list2):");
		list1.addAll(list2);
		print(list1, list2);

		// Recreates list1 and list2 with the same initial values, 
		// invokes list1.removeAll(list2), and displays list1 and list2.
		System.out.println("Recreate list1 and list2 with the same initial values,"
		 + "\ninvoke list1.removeAll(list2), and displays list1 and list2:");
		list1.clear();
		list1.addAll(new LiangExcercise10thAll.Exercise_27.Exercise_27_10.MyArrayList<>(array1));
		list1.removeAll(list2);
		print(list1, list2);

		// Recreates list1 and list2 with the same initial values, 
		// invokes list1.retainAll(list2), and displays list1 and list2.
		System.out.println("Recreate list1 and list2 with the same initial values," 
		+ "\ninvokes list1.retainAll(list2), and displays list1 and list2:");
		list1.clear();
		list1.addAll(new MyArrayList<>(array1));
		list1.retainAll(list2);
		print(list1, list2);
	}

	// Displays list1 and list2
	public static void print(LiangExcercise10thAll.Exercise_24.Exercise_24_02.MyList<String> list1, MyList<String> list2) {
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		System.out.println();
	}
}