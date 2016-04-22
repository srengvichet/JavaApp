package test_override;

public class A {

	int i = 10;

	void testMe() {
		System.out.println("in A's testMe");
	}

	public static void main(String[] args) {

		A ref = new B();
		System.out.println(ref.i);//resolved via ref type
		ref.testMe();
	}

}

class B extends A {
	int i = 20;

	@Override
	void testMe() {
		System.out.println("in B's testMe");
	}
}
