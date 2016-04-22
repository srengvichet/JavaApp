package shapes;

import compute.Computable;

public class Circle extends Point implements Computable {

	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return PI * radius * radius;
	}

	@Override
	public double computePerimeter() {
		return 2 * PI * radius;
	}

	@Override
	public String toString() {
		return "Circle " + super.toString() + " rad=" + radius;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Circle))
			return false;
		return super.equals(o) 
				&& ((Circle) o).radius == radius;
	}

	public double getRadius() {
		return radius;
	}
	

}
