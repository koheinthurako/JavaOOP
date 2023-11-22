package PointsChecker;

public class Point {

	private int x;
	private int y;
	private String color;

	public Point() {

	}

	public Point(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHorizontal(Point p1, Point p2) {
		if (p1.x == p2.x & p1.y == p2.y) {
			return false;
		} else if(p1.y == p2.y) {
			return true;
		}
		return false;
	}

	public boolean isVertical(Point p1, Point p2) {
		if (p1.x == p2.x & p1.y == p2.y) {
			 return true;
		} else if(p1.x == p2.x) {
			return true;
		}
		return true;
	}

	@Override
	public String toString() {
		return color + " Point : [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

	public String toString(Point p1, Point p2) {
		if (isHorizontal(p1, p2) == isVertical(p1, p2)) {
			return "It's not a line, it's just a dot.";
		} else if (isVertical(p1, p2)) {
			return "You created a vertical line";
		} else if (isHorizontal(p1, p2)) {
			return "You created a horizontal line";
		} else {
			return "Sorry, it's a slope!";
		}

	}

}
