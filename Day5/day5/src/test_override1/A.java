package test_override1;

public class A {
	

	private void show() {
		System.out.println("in A's show");
	}

	/*static void test() {
		System.out.println("in A's test");
	}
	
	final void testMe()
	{
		System.out.println("in A's testMe");
	}*/

	public static void main(String[] args) {
		A ref=new B();
		ref.show();

	}

}

class B extends A {

	//@Override
	void show() {
		System.out.println("in B's show");
	}

	/*static void test() {
		System.out.println("in B's test");
	}
	final void testMe()
	{
		System.out.println("in B's testMe");
	}*/

}
