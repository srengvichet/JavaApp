package strings;

public class TestString1 {

	public static void main(String[] args) {
		String s="hello";
		String s1=new String(s);
		s.concat("hi");
		System.out.println(s);
		s += "12345";
		System.out.println(s);
		s1.concat("abc");
		System.out.println(s1);

	}

}
