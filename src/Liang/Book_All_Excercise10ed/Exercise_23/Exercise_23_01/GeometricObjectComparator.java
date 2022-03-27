package LiangExcercise10thAll.Exercise_23.Exercise_23_01;

import LiangExcercise10thAll.Exercise_23.Exercise_23_02.GeometricObject;

import java.util.Comparator;

public class GeometricObjectComparator
		implements Comparator<LiangExcercise10thAll.Exercise_23.Exercise_23_02.GeometricObject>, java.io.Serializable {
	public int compare(LiangExcercise10thAll.Exercise_23.Exercise_23_02.GeometricObject o1, GeometricObject o2) {
		double area1 = o1.getArea();
		double area2 = o2.getArea();

		if (area1 < area2)
			return -1;
		else if (area1 == area2)
			return 0;
		else
			return 1;
	}
}