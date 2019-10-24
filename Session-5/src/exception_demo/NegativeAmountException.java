package exception_demo;

public class NegativeAmountException extends Exception {

	public NegativeAmountException() {
		super("Please insert a positive amount");
	}

	/*
	 * un astfel de constructor s-ar fi pretat daca cream o exceptie foarte
	 * generica, pe care toti programatorii care lucreaza la aplicatia mea sa o
	 * foloseasca. Ex: Sa presupunem ca am creat exceptia
	 * GenericValidationException. Vreau ca mesajul de validare sa fie diferit, in
	 * functie de tipul de validare, asa ca ofer posibilitatea celor care o folosesc
	 * sa o creeze cu un mesaj potrivit cazului lor de validare; Pentru ca
	 * NegativeAmountException e ceva foarte specific, stiu deja exact care e
	 * mesajul, asa ca constructorul de mai jos e total inutil in acest context
	 * 
	 */
//	public NegativeAmountException(String message) {
//		super(message);
//	}
}
