package Assignment4_SalaryManagementSystem;

public class FullTimeEmployee extends Employee{

	private double allowance;
	private double bonus;
	private static int count = 0;
	
	public FullTimeEmployee(String name,  double basicSalary, double allowance, double bonus) {
		super(name,  basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;	
		count++;
	}

	@Override
	public double calculateSalary() {
		double salary = this.getBasicSalary() + allowance + bonus;
		return salary;
	}

	public static int getCount() {
		return count;
	}
}
