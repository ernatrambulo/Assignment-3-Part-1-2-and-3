import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ComputeImplementationTest {

	@Before
	public void setUp() throws Exception{
		// not required for now
	}

	@After
	public void tearDown() throws Exception{
		// not required for now
	}

	@Test
	public void testComputeTax() {

		// GIVEN I have an ICompute implementation
		ICompute computer = new ComputeImplementation();

		// AND an employee with a salary of 47000
		int salary = 11000;

		// WHEN I compute the tax for that employee
		// (use the employees salary here)
		double computedTax = computer.computeTax(salary);

		// every unit test needs an assert statement
		// THEN the employee should pay tax of expectedResult
		double expectedResult = 1155;
		assertEquals(computedTax, expectedResult, 0);

	}
	
	

}
