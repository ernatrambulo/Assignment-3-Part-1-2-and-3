/**
 * This class is a concrete implementation of the ICompute interface. 
 * @author  Marie. 
 * @email ernatrambulo@gmail.com
 */

public class ComputeImplementation implements ICompute {

	ICompute employee;

	// write formula here describing how to calculate tax
		public double computeTax(int salary) {

		if (salary <= 14000) {
			return (salary * .105);
		} else if (salary <= 48000) {
			return (salary * .175);
		} else if (salary <= 70000) {
			return (salary * .3);
		} else {
			return (salary * .33);
		}
	}
	/**
	 * This method returns an employees weekly salary.
	 */
	public double weeklySalary(Employee employee) {
		return employee.getSalary() / 52;
	}

	/**
	 * This method returns an employees fortnightly salary.
	 */
	public double fortnightSalary(Employee employee) {
		 return employee.getSalary() / 26;
	}

	/**
	 * This method returns the annual kiwisaver contribution amount for an employee.
	 */
	public double computeKiwiSaver(Employee employee) {
		return employee.getAnnualKiwisaverContribution();
	}
	
	public void setEmployee(ICompute employee) {
		this.employee = employee;
	}

}