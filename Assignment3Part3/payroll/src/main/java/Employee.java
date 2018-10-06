

public class Employee {

	private double rate, hours, overTimeHours;
		
	public Employee(double rate, double hours, double overTime, double overTimeRate, double overTimeHours) {
		this.hours = hours;
		this.rate = rate;
	}
	
	public double getrate() {
		return rate;
	}

	public void setrate(double rate) {
		this.rate = rate;
	}
	
	public double gethours() {
		return hours;
	}

	public void sethours(double hours) {
		this.hours = hours;
	}
	
	public double overTimeRate() {
		return rate * 1.5;
	}
	
	public double getoverTimeHours() {
		return overTimeHours;
	}
	
	public void setoverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
}
