package exception_demo;

public class TryCatchBasicDemo {
	public static void main(String[] args) {
		int[] arr = new int[3];

		try {
			arr[4] = 4;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("FAIL");
			// System.exit(0);
		} finally {
			System.out.println("DONE");
		}
	}
}
