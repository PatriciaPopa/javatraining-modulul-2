package ex2_arheologie;

import java.time.LocalDate;

public class Artifact implements Comparable<Artifact> {

	enum ArtifactType {
		VASE, JEWELRY, PARTIALRELIC, UNKNOWN
	}

	enum Condition {
		POOR, MEDIOCRE, GOOD, NEEDSPECIALHANDLING
	}

	private ArtifactType artifactType;
	private Condition condition;
	private LocalDate discoveryDate;
	private int estimatedDateOfOrigin;

	public Artifact(ArtifactType artifactType, Condition condition, LocalDate discoveryDate,
			int estimatedDateOfOrigin) {
		this.artifactType = artifactType;
		this.condition = condition;
		this.discoveryDate = discoveryDate;
		this.estimatedDateOfOrigin = estimatedDateOfOrigin;
	}

	public ArtifactType getArtifactType() {
		return artifactType;
	}

	public Condition getCondition() {
		return condition;
	}

	public LocalDate getDiscoveryDate() {
		return discoveryDate;
	}

	public int getEstimatedDateOfOrigin() {
		return estimatedDateOfOrigin;
	}

	@Override
	public String toString() {
		return "Artifact [artifactType=" + artifactType + ", condition=" + condition + ", discoveryDate="
				+ discoveryDate + ", estimatedDateOfOrigin=" + estimatedDateOfOrigin + "]";
	}

	@Override
	public int compareTo(Artifact o) {
		return -discoveryDate.compareTo(o.getDiscoveryDate());
	}
}
