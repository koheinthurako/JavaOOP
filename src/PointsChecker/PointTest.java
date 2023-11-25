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

		System.out.println(p1);
		System.out.println(p2);

		if (p1.getX() == p2.getX() & p1.getY() == p2.getY()) {
			System.out.println("It's not a line, it's just a dot.");
		} else if (p1.isHorizontal(p2)) {
			System.out.println("Congratulations! You created a horizontal line");
		} else if (p1.isVertical(p2)) {
			System.out.println("Inchecking two unequal values " + p1.getX() + ":" + p2.getX());
			System.out.println("Congratulations! You created a vertical line");
		} else {
			System.out.println("Sorry, it's a slope!");
		}
		
		System.out.println("----- Program End -----");

		sc.close();

	}

}
