import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitFirstTest {

	@Test
	public void AddPositiveNumbersTest() {
		Calculator calc = new Calculator();

		assertEquals(3, calc.add(1, 2), 0);
	}

	@Test
	public void SubtractPositiveNumbersTest() {
		Calculator calc = new Calculator();

		assertEquals(1, calc.subtract(2, 1), 0);
	}
}
