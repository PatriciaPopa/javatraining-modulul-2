package ex_5;

public class Exam {
	private Importance importance;
	private Difficulty difficulty;
	private Type type;

	public Importance getImportance() {
		return importance;
	}

	public void setImportance(Importance importance) {
		this.importance = importance;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Exam(Importance importance, Difficulty difficulty, Type type) {
		super();
		this.importance = importance;
		this.difficulty = difficulty;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Exam [importance=" + importance + ", difficulty=" + difficulty + ", type=" + type + ", priority="
				+ computePriority() + "]" + '\n';
	}

	public int computePriority() {
		return importance.numericValue + difficulty.numericValue;
	}

	static enum Importance {
		CRITICAL(4), HIGH(3), MEDIUM(2), LOW(1);

		public final int numericValue;

		private Importance(int numericValue) {
			this.numericValue = numericValue;
		}
	}

	static enum Difficulty {
		HIGH(3), MEDIUM(2), LOW(1);

		public final int numericValue;

		private Difficulty(int numericValue) {
			this.numericValue = numericValue;
		}
	}

}
