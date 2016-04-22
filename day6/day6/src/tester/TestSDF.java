package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestSDF {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter last tx date day/mon/yr");
		// sdf
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// parse
		Date txDate = sdf.parse(sc.next());
		System.out.println("date " + txDate);
		System.out.println("formatted date " + sdf.format(txDate));
		} catch (Exception e)
		{
			System.out.println(e);
		}
		sc.close();
		System.out.println("main over....");

	}
}
