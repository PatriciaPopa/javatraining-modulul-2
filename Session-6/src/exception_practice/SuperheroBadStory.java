package exception_practice;

public class SuperheroBadStory {
	public static void main(String[] args) throws VillainAppearsException {
		/*
		 * Observati ca in acest scenariu, in care NU tratam exceptia, ziua nu mai
		 * continua (adica programul nostru nu va mai executa instructiunile de dupa
		 * try-catch)
		 */

		System.out.println("Just another ordinary day...");
		villainAppears();
		System.out.println("The day goes on");
	}

	public static void villainAppears() throws VillainAppearsException {
		System.out.println("But suddenly...");
		throw new VillainAppearsException();
	}
}
