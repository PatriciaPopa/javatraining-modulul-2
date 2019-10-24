package rest_sesiunea_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * Acest obiect ne ajuta sa scriem in fisere si sa citim din fisiere, perechi
		 * cheie-valoare
		 */

		Properties prop = new Properties();

		/*
		 * Fiecare instanta a clasei Properties are in spate un HashMap; cu setPropert
		 * adaugam o noua pereche cheie-valoare in acest map
		 */
		prop.setProperty("dog", "caine");

		/*
		 * metoda store() scrie continutul lui prop in fisierul out.txt; veti vedea ca
		 * in el avem si linii care incep cu #. Asa se marcheaza un comentariu, iar cand
		 * citim intr-un Properties acel fisier, liniile respective vor fi ignorate
		 */
		prop.store(new FileOutputStream("out.txt"), "comment_cu_care_descriu_fisierul");

		/*
		 * metoda load() citeste proprietatile din fisierul dat si le adauga in map-ul
		 * lui prop;
		 */
		prop.load(new FileInputStream("in.txt")); // explica ce face asta

		/*
		 * motivul pentru care linia de mai jos ne afiseaza "caine" e fiindca metoda
		 * load(), de mai sus, nu sterge continutul lui prop, ci adauga in continuare la
		 * el
		 */
		System.out.println(prop.getProperty("dog"));

		System.out.println(prop.getProperty("pig"));

		/* observati ca daca cheia nu exista, metoda getProperty() va returna null */
		System.out.println(prop.getProperty("animal"));
	}
}
