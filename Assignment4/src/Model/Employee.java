package Model;

public class Employee {

	private String name;

	private int employeeId;
	private double basicSalary;
	private static int count = 0;

	public Employee(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
		count++;
		this.employeeId = count;
	}

	public Employee() {

	}

	public static int getCount() {
		return count;
	}

	public double getBasicSalary() {
		return this.basicSalary;
	}

	public double calculateSalary() {
		return this.basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void displayDetails() {

		System.out.println("****" + this.getClass() + "****");
		System.out.println("Employee: " + name);
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Basic Salary: " + getBasicSalary());
		System.out.println("Total Salary: " + calculateSalary() + "\n");
	}

}
