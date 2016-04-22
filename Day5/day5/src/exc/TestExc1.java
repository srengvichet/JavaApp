package exc;

public class TestExc1 {

	public static void main(String[] args) {
		/*
		 * javac doesn't force d prog to handle un checked exc.
		 */
		try {
			String s = "123";
			System.out.println(Integer.parseInt(s));
			// s=null;
			System.out.println(s.charAt(0));
			String[] ss = { "1", "2" };
			System.out.println(ss[2]);
			System.out.println("end of try");
		} /*catch (NumberFormatException e) {
			System.out.println(e);// toString -- exc cls name + reason
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}*/ catch (Exception e) {
			System.out.println("in catch-all " + e);
		}
		System.out.println("main over");

	}

}
