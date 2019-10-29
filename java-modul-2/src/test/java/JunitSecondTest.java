
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class JunitSecondTest {

	@Test
	public void AddNegativeNumbersTest() {
		Calculator calc = new Calculator();

		// assertEquals(-3, calc.add(-1, -2), 0);

		/*
		 * aici am folosit versiunea din pluginul Hamcrest, care face scrierea testelor
		 * putin mai explicita
		 */
		assertThat(calc.add(-1, -2), is(equalTo(-3.0)));
	}

//	// JUnit 4 for equals check
//	assertEquals(expected, actual);
//	// Hamcrest for equals check
//	assertThat(actual, is(equalTo(expected)));
}
