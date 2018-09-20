/**
 * This class represents an employee and their properties, such as salary
 * and  Kiwisaver contribution percentage. 
 * @author Marie
 * @email ernatrambulo@gmail.com
 */
public class Employee {

		private int salary;
		
		private double kiwisaverPercentage;
		
		/**
		 * Default constructor.
		 */
		public Employee(int salary, int kiwisaverPercentage) {
			this.salary = salary;
			this.kiwisaverPercentage = kiwisaverPercentage;
		}
	
		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public double getKiwisaverPercentage() {
			return kiwisaverPercentage;
		}

		public void setKiwisaverPercentage(double kiwisaverPercentage) {
			this.kiwisaverPercentage = kiwisaverPercentage;
		}
		
		public double getAnnualKiwisaverContribution() { 
			return kiwisaverPercentage * salary;
		}
				
	}
