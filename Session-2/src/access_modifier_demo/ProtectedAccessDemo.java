package access_modifier_demo;

public class ProtectedAccessDemo {

	public static void main(String[] args) {
		AccessModifiersBase am = new AccessModifiersBase();

		/*
		 * merge, pentru ca, desi nu suntem intr-o clasa derivata, suntem in acelasi
		 * pachet, iar protected, in java = clasa derivata + acelasi pachet
		 */
		System.out.println(am.nr3);
	}

}
