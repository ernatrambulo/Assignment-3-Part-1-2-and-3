import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.*;

import static org.junit.Assert.*;

public class ComputeImplementationTest {
	
	Employee empObj;
	ComputeImplementation objImpl;
	int salary;
	double kiwisaver, tax;
	int weeklysal, fortnightly;
	
	ICompute mockEmployee;

	@Before
	public void setUp() throws Exception{
		
		objImpl = new ComputeImplementation();
		salary = 80000;
		kiwisaver= .30;
		tax = .33;
		empObj = new Employee(salary, kiwisaver);
		
		
		mockEmployee = mock(ICompute.class);
		
		when(mockEmployee.weeklySalary(empObj)).thenReturn((double) (salary/52));
		when(mockEmployee.fortnightSalary(empObj)).thenReturn((double) (salary/26));
		when(mockEmployee.computeKiwiSaver(empObj)).thenReturn((double) (salary*tax));
			
		objImpl.setEmployee(mockEmployee);
	}

	@After
	public void tearDown() throws Exception{
		objImpl = null;
		mockEmployee = null;
	}

	@Test	
	public void testcomputeTax() {
	
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
	@Test
	public void testweeklySalary() {
		
		double expected = salary/52;
		double actual = objImpl.weeklySalary(empObj);

		assertEquals(expected, actual, 0.3);
		
	}
	
	@Test
	public void testfortnightSalary() {
		
		double expected = salary/26;
		double actual = objImpl.fortnightSalary(empObj);

		assertEquals(expected, actual, 0.3);
	}

	@Test
	public void testcomputeKiwiSaver() {
		
		double expected = salary*kiwisaver;
		double actual = objImpl.computeKiwiSaver(empObj);

		assertEquals(expected, actual, 0.3);
	}


}