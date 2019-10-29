package exception_practice;

public class VillainAppearsException extends Exception {

	private static final String JOKER_HAS_APPEARED = "Joker has appeared!";

	public VillainAppearsException() {
		super(JOKER_HAS_APPEARED);
	}

}
