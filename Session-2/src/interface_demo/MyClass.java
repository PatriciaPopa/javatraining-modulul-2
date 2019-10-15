package interface_demo;

public class MyClass implements InterfaceWithDefaultMethod {

	@Override
	public void doAbstractMethod() {
		System.out.println("Abstract method working");
	}

	@Override
	public void doDefaultMehod() {
		System.out.println("Default override");
	}

	public static void main(String[] args) {

		InterfaceWithDefaultMethod i1 = new MyClass();
		MyClass mc = new MyClass();

		i1.doAbstractMethod();
		i1.doDefaultMehod();

		mc.doAbstractMethod();
		mc.doDefaultMehod();

		// i1.doStaticMethod();
		// mc.doStaticMethod();

		/*
		 * Nu putem accesa decat in mod static metodele statice din interfete, de aia
		 * codul de mai sus nu compileaza, dar cel de jos da
		 */

		InterfaceWithDefaultMethod.doStaticMethod();
	}

}
