package ex2_arheologie;

import java.time.LocalDate;

public class EgyptianArtifact extends Artifact {

	private String pharao;

	@Override
	public int getEstimatedDateOfOrigin() {
		return super.getEstimatedDateOfOrigin();
	}

	public EgyptianArtifact(ArtifactType artifactType, Condition condition, LocalDate discoveryData,
			int estimatedDateOfOrigin, String pharao) {
		super(artifactType, condition, discoveryData, estimatedDateOfOrigin);
		this.pharao = pharao;
	}

	public String getPharao() {
		return pharao;
	}

	@Override
	public String toString() {
		return "EgyptianArtifact [pharao=" + pharao + ", toString()=" + super.toString() + "]";
	}

}
