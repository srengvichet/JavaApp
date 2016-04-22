package strings;

import java.util.Date;

public class TestStringBuilder {

	public static void main(String[] args) {
		/*
		 * StringBuilder() --- empty SB object; length=0,capacity=16
		 * StringBuilder(String s) --non-empty SB;length=s.length(),
		 * capacity=s.length+16 chars
		 */
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("cont " + sb + "length " + sb.length() + " capa "
				+ sb.capacity());

		StringBuilder sb2=sb.append("1234").append(true).append(34.567).append(new Date())
				.append(new A("abcd"));
		System.out.println(sb);
		System.out.println(sb==sb2);
		System.out.println(sb.capacity());
		sb.setLength(10);
		System.out.println(sb+" capa "+sb.capacity());
		sb.trimToSize();
		System.out.println(sb+" capa "+sb.capacity());
		

	}

}

class A {
	String name;

	public A(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

}
