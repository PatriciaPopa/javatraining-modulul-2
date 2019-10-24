package exception_demo;

public class ThrowsBasicDemo {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];

		try {
			arr[4] = 4;
		} finally {
			System.out.println("DONE");
		}
	}
}
