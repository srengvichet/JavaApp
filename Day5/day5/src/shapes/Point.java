package shapes;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Point))
			return false;
		Point p = (Point) o;
		return x == p.x && y == p.y;
	}

}
