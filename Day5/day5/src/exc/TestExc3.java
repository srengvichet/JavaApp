package exc;

import java.io.IOException;

public class TestExc3 {

	public static void main(String[] args)/*
										 * throws InterruptedException,
										 * IOException
										 */throws Exception {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(500);
			System.in.read();

		}

	}

}
