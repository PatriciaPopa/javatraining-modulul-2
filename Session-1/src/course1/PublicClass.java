package course1;

/*
 * Vezi StaticStuffDemo.java intai
 */

// can be accessed from another package - the test is in TestPackageAccess.java
public class PublicClass {

	// referinta ne-statica
	public int num = 10;

	// referinta statica
	public static int numStatic = 1;

	// constanta statica
	public static final double PI = 3.14;

	// metoda statica
	public static void doSomething() {
		System.out.println("I am doing something, okay?");
	}
}

// can NOT be accessed from another package - the test is in TestPackageAccess.java
class DefaultClass {

}