package exception_practice;

public class SuperheroGoodStory {
	public static void main(String[] args) {
		/*
		 * Observati ca in acest scenariu, in care tratam exceptia, ziua continua (adica
		 * programul nostru continua sa execute toate instructiunile de dupa try-catch)
		 */

		try {
			System.out.println("Just another ordinary day...");
			villainAppears();
			System.out.println("Johnny tries to buy an ice cream");
		} catch (VillainAppearsException e) {
			System.out.println(e.getMessage());
			System.out.println("Batman appears and saves the day");
			// e.printStackTrace();
		}

		System.out.println("The day goes on");
	}

	public static void villainAppears() throws VillainAppearsException {
		System.out.println("But suddenly...");
		throw new VillainAppearsException();
	}
}
