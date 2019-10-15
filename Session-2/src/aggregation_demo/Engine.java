package aggregation_demo;

public class Engine {
	private int hp;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Engine(int hp) {
		super();
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Engine [hp=" + hp + "]";
	}

}
