package Model;

public class PartTimeEmployee extends Employee {

	private int hoursWorked;
	private double hourlyRate;
	private static int count = 0;

	public PartTimeEmployee(String name, double basicSalary, int hoursWorked, double hourlyRate) {
		super(name, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		count++;
	}

	@Override
	public double calculateSalary() {
		double salary = hoursWorked * hourlyRate;
		return salary;
	}

	public static int getCount() {
		return count;
	}

}
