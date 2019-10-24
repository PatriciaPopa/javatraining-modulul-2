package exception_demo;

public class BankingApp1 {
	public static void main(String[] args) {
		try {
//			makePayment(11);
			makePayment(-33);
		} catch (Exception ex) {
			System.out.println("Please insert a positive amount!");
		}

		System.out.println("Payment done");
	}

	/*
	 * Acest throws IllegalArgumentException este optional, pentru ca asta e o
	 * exceptie unchecked
	 */

	static void makePayment(int sum) /* throws IllegalArgumentException */ {
		if (sum < 0) {

			/*
			 * aici am folosit o exceptie predefinita in Java, dar ar fi mai bine sa ne
			 * definim una proprie, cu un mesaj de eroare mai specific, asa cum facem in
			 * BankingApp2
			 */
			throw new IllegalArgumentException();
		}

		/* aceasta linie nu se va mai executa daca se arunca o exceptie mai sus */
		System.out.println("Doing payment...");
	}
}
