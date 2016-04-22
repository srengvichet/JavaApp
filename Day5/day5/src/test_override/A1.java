package test_override;

public class A1 {
	final void testMe()
	{
		System.out.println("in A's testMe");
	}

	public static void main(String[] args) {
	}

}

class B1 extends A1 {
	final void testMe()
	{
		System.out.println("in B's testMe");
	}

}
