package access_modifier_demo;

public class AccessModifiersBase {
	public int nr1 = 1; // public - cel mai putin restrictiv
	int nr2 = 2; // package, default
	protected int nr3 = 3; // protected = clase derivate + acelasi pachet
	private int nr4 = 4; // private - cel mai restrictiv (vizibil doar din interiorul acestei clase)

}
