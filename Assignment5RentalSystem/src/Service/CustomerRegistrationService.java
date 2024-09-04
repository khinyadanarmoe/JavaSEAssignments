package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import DA0.CustomerDao;
import Model.Customer;

public class CustomerRegistrationService {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private CustomerDao customerDao;

	public CustomerRegistrationService() {
		customerDao = new CustomerDao();
	}

	public Customer getCustomerInfo() throws IOException {
		System.out.print("Name: ");
		String name = br.readLine();

		Customer customer = new Customer(name);

		customerDao.create(customer);
		return customer;
	}


}
