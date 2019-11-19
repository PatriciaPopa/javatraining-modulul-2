package ex_5;

import java.util.ArrayList;
import java.util.List;

import ex_5.Exam.Difficulty;
import ex_5.Exam.Importance;
import static ex_5.Type.*;

public class ExamDemo {
	public static void main(String[] args) {
		List<Exam> exams = new ArrayList<>();

		exams.add(new Exam(Importance.CRITICAL, Difficulty.LOW, DIPLOMA));
		exams.add(new Exam(Importance.MEDIUM, Difficulty.LOW, MASTER));
		exams.add(new Exam(Importance.CRITICAL, Difficulty.HIGH, DIPLOMA));
		exams.add(new Exam(Importance.LOW, Difficulty.LOW, MASTER));
		exams.add(new Exam(Importance.LOW, Difficulty.MEDIUM, DIPLOMA));

		/* fac acelasi lucru, ambele sortari; folositi-o pe care vreti voi */
		// Collections.sort(exams, (Exam a, Exam b) -> a.computePriority() -
		// b.computePriority());

		exams.sort((Exam a, Exam b) -> {
			return a.computePriority() - b.computePriority();
		});

		System.out.println(exams);
	}
}
