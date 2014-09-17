package io.macintosh.scratch.params;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyMathTests {
	
	@Parameters
	public static Collection<Object[]> getTestScenarios() {
		Object[][] scenarios = new Object[][]{
				{// scenario 1
					new int[]{1}, // list of numbers to operate on
					1, // sumResult
					1}, // avgResult
				{new int[]{1,1}, 2, 1}, // scenario 2
				{new int[]{1,-1}, 0, 0}, // scenario 3
				{new int[]{0,4}, 4, 2}, // scenario 4
				};
		return Arrays.asList(scenarios);
	}

	private MyMath math;
	private int[] inputValues;
	private int expectedSum;
	private int expectedAvg;
	
	/* An instance of this unit test class is created for each row of test values
	 * returned from the @Parameters (the data() method). It's sort of like
	 * the @BeforeClass (called once per many calls to @Before methods).
	 */
	public MyMathTests(int[] inputValues, int expectedSum, int expectedAvg) {
		this.inputValues = inputValues;
		this.expectedSum = expectedSum;
		this.expectedAvg = expectedAvg;
	}

	@Before
	public void setup() {
		this.math = new MyMath();
	}
	
	@Test
	public void test_sum() {
		assertEquals(expectedSum, math.sum(inputValues));
	}

	@Test
	public void test_avg() {
		assertEquals(expectedAvg, math.avg(inputValues));
	}

}
