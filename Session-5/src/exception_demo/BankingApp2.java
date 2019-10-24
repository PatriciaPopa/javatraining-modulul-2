package exception_demo;

public class BankingApp2 {
	public static void main(String[] args) {
		try {
			makePayment(-33);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("Payment done");
	}

	static void makePayment(int sum) throws NegativeAmountException {
		if (sum < 0) {

			/*
			 * acelasi cod ca si in BankingApp1, doar ca de data asta aruncam exceptia
			 * noastra
			 */
			throw new NegativeAmountException();
		}

		System.out.println("Doing payment...");
	}
}
