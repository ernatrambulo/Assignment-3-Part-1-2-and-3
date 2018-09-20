//Java Interface Created
public interface ICompute {
	
//computeTax(int amount) - Changed this to int salary so we can use employee.java
	public double computeTax(int salary); 
	
//weeklySalary(Employee income) - Changed this to public double weeklySalary(Employee employee); so we can use employee.java 
	public double weeklySalary(Employee employee);

//c.	fortnightSalary(Employee income) 
	public double fortnightSalary(Employee employee);
//  I thought you were creating the fortnightSalary method
	
	
//d.	computeKiwiSaver(Employee kiwiOption) Changed this to public double computeKiwiSaver(Employee employee); so we can use employee.java
	public double computeKiwiSaver(Employee employee);
		
}
