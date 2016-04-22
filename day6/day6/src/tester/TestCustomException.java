package tester;

import java.util.Scanner;

import cust_excs.SpeedOutOfRangeException;

public class TestCustomException {
	// const
	public static final int MIN_SPEED = 40;
	public static final int MAX_SPEED = 140;

	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed");
		try {
			checkSpeed(sc.nextInt());
			System.out.println("end of try : main");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("in main's finally");
			if (sc != null)
				sc.close();
		}
		System.out.println("main over...");

	}

	private static void checkSpeed(int speed) throws Exception {
		try {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("u r driving too slow....");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("u r driving too fast : FATAL....");
		System.out.println("speed in range : keep it up!");
		} finally {
			System.out.println("in method's finally");
		}
		System.out.println("end of method");

	}

}
