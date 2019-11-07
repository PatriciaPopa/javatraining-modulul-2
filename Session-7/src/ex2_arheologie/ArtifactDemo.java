package ex2_arheologie;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex2_arheologie.Artifact.ArtifactType;
import ex2_arheologie.Artifact.Condition;

public class ArtifactDemo {
	public static void main(String[] args) {

		List<Artifact> artifacts = new ArrayList<>();

		artifacts.add(new GreekArtifact(ArtifactType.JEWELRY, Condition.MEDIOCRE, LocalDate.of(2017, Month.FEBRUARY, 3),
				10, "Atena"));
		artifacts.add(
				new GreekArtifact(ArtifactType.VASE, Condition.GOOD, LocalDate.of(1994, Month.MARCH, 24), 10, "Zeus"));
		artifacts.add(new GreekArtifact(ArtifactType.UNKNOWN, Condition.NEEDSPECIALHANDLING,
				LocalDate.of(1890, Month.JANUARY, 13), 52, "Hera"));

		artifacts.add(new EgyptianArtifact(ArtifactType.PARTIALRELIC, Condition.GOOD,
				LocalDate.of(1993, Month.APRIL, 3), 12, "Ay"));
		artifacts.add(new EgyptianArtifact(ArtifactType.JEWELRY, Condition.POOR, LocalDate.of(2000, Month.DECEMBER, 13),
				1000, "Tutankhamon"));
		artifacts.add(new EgyptianArtifact(ArtifactType.VASE, Condition.NEEDSPECIALHANDLING,
				LocalDate.of(1860, Month.JANUARY, 13), 3600, "Akenathon"));

		// System.out.println(artifacts);

		/*
		 * ----------------------------------------------------------------------------
		 */

		Collections.sort(artifacts);

		System.out.println(artifacts);

		/*
		 * ----------------------------------------------------------------------------
		 */

		List<Artifact> artifacts2 = new ArrayList<>();
		artifacts2.add(new GreekArtifact(ArtifactType.UNKNOWN, Condition.NEEDSPECIALHANDLING,
				LocalDate.of(1890, Month.JANUARY, 13), 21, "Apolo"));

		artifacts2.add(new EgyptianArtifact(ArtifactType.PARTIALRELIC, Condition.GOOD,
				LocalDate.of(1993, Month.APRIL, 3), 4, "DanutFaraon"));

		Map<String, List<Artifact>> map = new HashMap<>();
		map.put("Muzeul de Arheologie Banatean", artifacts);
		map.put("Muzeul de Arheologie din New York", artifacts2);
	}
}
