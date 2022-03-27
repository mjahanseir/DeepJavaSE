package LiangExcercise10thAll.Exercise_13.Exercise_13_10;

import LiangExcercise10thAll.Exercise_13.Exercise_13_12.Rectangle;

/*********************************************************************************
* (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to   *
* extend GeometricObject and implement the Comparable interface. Override the    *
* equals method in the Object class. Two Rectangle objects are equal if their    *
* areas are the same. Draw the UML diagram that involves Rectangle,              *
* GeometricObject, and Comparable.                                               *
*********************************************************************************/
public class Exercise_13_10 {
	/** Main method */
	public static void main(String[] args) {
		// Create three Rectangle objects
		LiangExcercise10thAll.Exercise_13.Exercise_13_12.Rectangle r1 = new LiangExcercise10thAll.Exercise_13.Exercise_13_12.Rectangle(3, 5, "blue", true);
		LiangExcercise10thAll.Exercise_13.Exercise_13_12.Rectangle r2 = new LiangExcercise10thAll.Exercise_13.Exercise_13_12.Rectangle(5, 3, "gray", false);
		LiangExcercise10thAll.Exercise_13.Exercise_13_12.Rectangle r3 = new Rectangle(3.1, 5, "blue", true);

		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());

		System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
			"equal to Rectangle2");

		System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
			"equal to Rectangle3");
	}
}