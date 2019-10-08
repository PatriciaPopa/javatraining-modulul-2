package anotherpackage_course1;

import course1.PublicClass;

/* Importarea tuturor membrilor package-ului printr-un statement import
 * In cazul nostru, va importa doar PublicClass, pentru ca doar ea este vizibila din acest pachet
 */
//import course1.*;

public class TestPackageAccess {
	public static void main(String[] args) {
		// referinta la membru prin numele sau intreg (fully qualified)
		course1.PublicClass pc = new course1.PublicClass();

		// importarea membrului printr-un statement import
		PublicClass pc1 = new PublicClass();

		// Nu o sa mearga
		// DefaultClass dc = new DefaultClass();
	}
}