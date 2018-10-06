

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.*;

public class computeImplementationTest {
	
	computeImplementation ImpObj;
	Employee empObj;
	double Salary, rate, hours, overTime, overTimeRate, overTimeHours;
	ICompute mockEmployee;
	

	@Before
	public void setUp() throws Exception {
		
		ImpObj = new computeImplementation();
		empObj = new Employee(rate, hours, overTime, overTimeRate, overTimeHours);
		double hours = 5, rate = 16.75, overTimeRate = 25.125, overTimeHours = 2;
		
		mockEmployee = mock(ICompute.class);
		
		when(mockEmployee.Salary(empObj)).thenReturn((double) (rate*hours));
		when(mockEmployee.overTime(empObj)).thenReturn((double) (overTimeRate*overTimeHours));
		
		ImpObj.setEmployee(mockEmployee);
	}
	
	@After
	public void tearDown() throws Exception {
		ImpObj = null;
		mockEmployee = null;
	}

	@Test
	public void testSalary() {
			
		double expected = rate * hours;
		double actual = ImpObj.Salary(empObj);
		assertEquals(expected, actual, 0.3);
	}
	
	@Test
	public void testoverTime() {
		
		double expected = overTimeRate * overTimeHours;
		double actual = ImpObj.overTime(empObj);
		assertEquals(expected, actual, 0.3);
	}
	
	@Test
	public void testtotalSalary() {
		
		ICompute computer = new computeImplementation();
		
		double overTime = 50.25, Salary = 2000;
		
		double computedtotalSalary = computer.totalSalary(overTime, Salary);
		
		double expectedResult = 2050.25;
		
		assertEquals(computedtotalSalary, expectedResult, 0.3);
	}

}
