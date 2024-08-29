package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Employee;

public class EmployeeRegistrationService {
	private static Employee[] employeeDB = new Employee[1000];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Employee employee;

	public EmployeeRegistrationService() {
		this.employee = new Employee();
	}
	public void getEmployeeInfo() throws IOException {
	
			this.commonEmployeeInfo();
			Employee employee = this.employeeInfo();
			employeeDB[Employee.getCount()-1] = employee;

	}

	public Employee employeeInfo() throws IOException {
		return null;	
	}
	
	public void commonEmployeeInfo() throws IOException {

		System.out.print("Enter Emp Name: ");
		this.employee.setName(br.readLine());
		System.out.print("Enter Emp Basic Salary: ");
		this.employee.setBasicSalary(Double.parseDouble(br.readLine()));
	}

	public Employee getEmployee() {
		return employee;
	}

	public static Employee[] getEmpDB(){
		return employeeDB;
	}


}

