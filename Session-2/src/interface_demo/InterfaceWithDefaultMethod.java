package interface_demo;

public interface InterfaceWithDefaultMethod {
	// constants (public static final variables)

	void doAbstractMethod();

	default void doDefaultMehod() {
		System.out.println("Default method working");
	}

	static void doStaticMethod() {
		System.out.println("Static method working");
	}

}
