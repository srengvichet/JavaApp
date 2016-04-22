package strings;

import java.util.Date;

public class TestStrings3 {

	public static void main(String[] args) {
		byte[] bytes = { 65, 66, 67, 68, 69, 70 };
		System.out.println(new String(bytes));
		System.out.println(new String(bytes, 2, 3));
		String s1 = "1231231";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length() - 1));
		String s2 = "HELLO";
		String s3 = "hello";
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.contains("hi"));
		String line = "strings are easy are";
		System.out.println(line.indexOf("are") + " " + line.lastIndexOf("are"));
		s1.replace('1', '0');
		System.out.println(s1);
		System.out.println(s2.toLowerCase());
		// format
		String formattedString = String.format("%d %.2f %s %TD ", 123, 123.456,
				"testing", new Date());
		System.out.println(formattedString);
	}

}
