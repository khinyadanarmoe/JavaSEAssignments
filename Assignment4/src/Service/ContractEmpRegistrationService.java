package Service;

import java.io.IOException;

import Model.ContractEmployee;



public class ContractEmpRegistrationService extends EmployeeRegistrationService{

	@Override
	public ContractEmployee employeeInfo() throws IOException {
		System.out.print("Enter Contract Duration: ");
		int duration = Integer.parseInt(br.readLine());

		System.out.print("Enter Contract Amount: ");
		Double amount = Double.parseDouble(br.readLine());

		ContractEmployee contractEmp = new ContractEmployee(getEmployee().getName(), getEmployee().getBasicSalary(), duration, amount);

		return contractEmp;
	}

}