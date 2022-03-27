package LiangExcercise10thAll.Exercise_11.Exercise_11_05;

import LiangExcercise10thAll.Exercise_13.Exercise_13_13.Course;

/*********************************************************************************
* (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList  *
* to replace an array to store students. Draw the new UML diagram for the class. *
* You should not change the original contract of the Course class (i.e., the     *
* definition of the constructors and methods should not be changed, but the      *
* private members may be changed.)                                               *
*********************************************************************************/
public class Exercise_11_05 {
	public static void main(String[] args) {
		LiangExcercise10thAll.Exercise_13.Exercise_13_13.Course course1 = new LiangExcercise10thAll.Exercise_13.Exercise_13_13.Course("Data Structures");
		LiangExcercise10thAll.Exercise_13.Exercise_13_13.Course course2 = new Course("Database Systems");

		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
	}
}