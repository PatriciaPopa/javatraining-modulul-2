package app_menu_demo;

import java.util.Scanner;

public class AppMenuDemo {
	public static void main(String[] args) {
		displayMenu();
	}

	private static void displayMenu() {
		displayMainMenu();

		String option = getUserOption();

		switch (option) {
		case "1":
			System.out.println("Up-jump / Down-squat / Left-move left / Right-move right");
			handleReturnToMM();
			break;

		case "2":
			handleLanguageMenu();
			handleReturnToMM();
			break;

		case "3":
			System.out.println("Game started");
			break;

		case "4":
			handleDifficultyMenu();
			handleReturnToMM();
			break;

		case "5":
			System.exit(0);
			// break;

		default:
			System.out.println("Please type in a value between 1 and 5");
			break;
		}

	}

	private static void handleReturnToMM() {
		String option;
		System.out.println("Would you like to return to the main menu? Y/N");
		option = getUserOption();
		if (option.equalsIgnoreCase("Y")) {
			displayMenu();
		} else {
			System.out.println("Bye bye");
		}
	}

	private static void handleDifficultyMenu() {
		displayDifficultyMenu();
		String option = getUserOption();
		if (option.equals("d")) {
			System.out.println("Difficulty: Easy");
		} else if (option.equals("e")) {
			System.out.println("Difficulty: Medium");
		} else if (option.equals("f")) {
			System.out.println("Difficulty: Hard");
		} else {
			System.out.println("Please type in a value between d and f");
		}
	}

	private static void displayDifficultyMenu() {
		System.out.println("Please choose an option (ex: for option d, press d)");
		System.out.println("d) Easy");
		System.out.println("e) Medium");
		System.out.println("f) Hard");
	}

	private static void handleLanguageMenu() {
		displayLanguageMenu();
		String option = getUserOption();
		if (option.equals("a")) {
			System.out.println("You have chosen English");
		} else if (option.equals("b")) {
			System.out.println("Ati ales romana");
		} else if (option.equals("c")) {
			System.out.println("Sie haben Deutsch gewaehlt");
		} else {
			System.out.println("Please type in a value between a and c");
		}
	}

	private static void displayLanguageMenu() {
		System.out.println("Please choose an option (ex: for option a, press a)");
		System.out.println("a) EN");
		System.out.println("b) RO");
		System.out.println("c) DE");
	}

	private static String getUserOption() {
		Scanner sin = new Scanner(System.in);
		return sin.nextLine();
	}

	private static void displayMainMenu() {
		System.out.println("Please choose an option (ex: for option 1, press 1)");
		System.out.println("1) Instructions");
		System.out.println("2) Change Language");
		System.out.println("3) Play");
		System.out.println("4) Change difficulty");
		System.out.println("5) Exit");
		System.out.println("Please type your option here: ");
	}
}
