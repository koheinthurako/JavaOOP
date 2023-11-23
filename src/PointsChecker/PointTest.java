package PointsChecker;

import java.util.Scanner;

public class PointTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Let's create a horizontal or vertical line");
		System.out.println("--- Program Start ---");

//		for Point1
		System.out.print("Please enter numbers for Point 1 (x) : ");
		int p1x = sc.nextInt();
		System.out.print("Please enter numbers for Point 1 (y) : ");
		int p1y = sc.nextInt();

//		for Point2
		System.out.print("Please enter numbers for Point 2 (x) : ");
		int p2x = sc.nextInt();
		System.out.print("Please enter numbers for Point 2 (y) : ");
		int p2y = sc.nextInt();

		Point p1 = new Point(p1x, p1y, "Red");
		Point p2 = new Point(p2x, p2y, "Blue");
		Point testPoint = new Point();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(testPoint.toString(p1, p2));
		System.out.println("----- Program End -----");

		sc.close();

	}

}
