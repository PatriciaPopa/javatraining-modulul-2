package course1;

public class TestPackageAccessOK {
	public static void main(String[] args) {

		PublicClass pc = new PublicClass();

		/*
		 * pentru ca clasele TestPackageAccessOK si DefaultClass se afla in acelasi
		 * pachet, acum putem accesa si clasa package-private
		 */
		DefaultClass dc = new DefaultClass();
	}
}
