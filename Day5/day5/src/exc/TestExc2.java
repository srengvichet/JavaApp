package exc;

public class TestExc2 {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(500);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
