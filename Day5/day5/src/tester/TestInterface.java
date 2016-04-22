package tester;

import compute.Computable;
import shapes.Circle;
import shapes.Point;
import shapes.Rect;

public class TestInterface {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, 20, 15.5);
		Rect r1 = new Rect(40, 12, 10, 15);
		System.out.println(c1 + " area " + c1.computeArea() + " peri "
				+ c1.computePerimeter());
		System.out.println(r1 + " area " + r1.computeArea() + " peri "
				+ r1.computePerimeter());
		Computable ref;//i/f ref
		ref=c1;//up -casting
		System.out.println(ref + " area " + ref.computeArea() + " peri "
				+ ref.computePerimeter());
		
		ref=r1;//up -casting
		System.out.println(ref + " area " + ref.computeArea() + " peri "
				+ ref.computePerimeter());
		System.out.println(ref instanceof Computable);
		System.out.println(ref instanceof Circle);
		System.out.println(ref instanceof Point);
		System.out.println(ref instanceof Rect);
		System.out.println(((Rect)ref).getWidth());
		System.out.println(((Circle)ref).getRadius());
		

	}

}
