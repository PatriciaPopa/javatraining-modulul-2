package ex2_arheologie;

import java.time.LocalDate;

public class GreekArtifact extends Artifact {

	private String greekGod;

	public GreekArtifact(ArtifactType artifactType, Condition condition, LocalDate discoveryData,
			int estimatedDateOfOrigin, String greekGod) {
		super(artifactType, condition, discoveryData, estimatedDateOfOrigin);
		this.greekGod = greekGod;
	}

	@Override
	public int getEstimatedDateOfOrigin() {
		return super.getEstimatedDateOfOrigin();
	}

	public String getGreekGod() {
		return greekGod;
	}

	@Override
	public String toString() {
		return "GreekArtifact [greekGod=" + greekGod + ", toString()=" + super.toString() + "]";
	}

}
