package Service;

import java.io.IOException;

import Model.PartTimeEmployee;

public class PartTimeEmpRegistrationService extends EmployeeRegistrationService {

	@Override
	public PartTimeEmployee employeeInfo() throws IOException {
		System.out.print("Enter Hours Worked: ");
		int hoursWorked = Integer.parseInt(br.readLine());

		System.out.print("Enter Hourly Rate: ");
		Double hourlyRate = Double.parseDouble(br.readLine());

		PartTimeEmployee parttimeEmp = new PartTimeEmployee(getEmployee().getName(), getEmployee().getBasicSalary(),
				hoursWorked, hourlyRate);

		return parttimeEmp;
	}

}
