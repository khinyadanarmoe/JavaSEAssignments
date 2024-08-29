package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Employee;
import Service.ContractEmpRegistrationService;
import Service.EmployeeRegistrationService;
import Service.FullTimeEmpRegistrationService;
import Service.PartTimeEmpRegistrationService;

public class SalaryTest {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Employee[] employees = new Employee[100];

	public static void main(String[] args) throws IOException {

		EmployeeRegistrationService service = null;
		String flag;
		do {

			System.out.print("Enter Employee Type: ");
			String type = br.readLine();

			if ("contract".equalsIgnoreCase(type)) {
				service = new ContractEmpRegistrationService();

			} else if ("fulltime".equalsIgnoreCase(type)) {
				service = new FullTimeEmpRegistrationService();

			} else if ("parttime".equalsIgnoreCase(type)) {
				service = new PartTimeEmpRegistrationService();
			}

			service.getEmployeeInfo();

			System.out.print("Do you want to add another employee: ");
			flag = br.readLine();

		} while (flag.equalsIgnoreCase("yes"));

		for (int i = 0; i < Employee.getCount(); i++) {
			EmployeeRegistrationService.getEmpDB()[i].displayDetails();
		}

	}

}
