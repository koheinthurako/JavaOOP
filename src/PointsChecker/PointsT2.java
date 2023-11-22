package PointsChecker;

public class PointsT2 {

	public static void main(String[] args) {

		Point p1 = new Point(2, 5, "Red");
		Point p2 = new Point(2, 7, "Blue");
		Point testPoint = new Point();
		testPoint.isHorizontal(p1, p2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(testPoint);
		
	}

}
