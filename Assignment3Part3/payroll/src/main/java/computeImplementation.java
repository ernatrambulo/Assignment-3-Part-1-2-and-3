public class computeImplementation implements ICompute {
	ICompute employee;

	public double Salary(Employee employee) {
		// salary = rate* hours;
		return employee.gethours() * employee.getrate();
	}
	
	public double overTime(Employee employee) {
		// overTime = overTimeRate * overTimeHours
		return employee.overTimeRate() * employee.getoverTimeHours();
	}
	
	public double totalSalary(double overTime, double Salary) {
		// totalSalary = salary + overTime
		return (overTime+Salary);
	}

	public void setEmployee(ICompute employee) {
		this.employee = employee;
		
	}
		
}
