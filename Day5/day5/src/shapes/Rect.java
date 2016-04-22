package shapes;

import compute.Computable;

public class Rect extends Point implements Computable {
	private double width, height;

	public Rect(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rect " + super.toString() + "width=" + width + ", height="
				+ height;

	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	public double getWidth() {
		return width;
	}
	

}
