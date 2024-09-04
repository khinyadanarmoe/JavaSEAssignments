package DA0;

import Model.Customer;

public class CustomerDao {

	private static Customer[] customerDB = new Customer[Customer.Max_Customer_Count];
	
	public void create(Customer customer) {
		customerDB[Customer.getCount()-1] = customer;
	}
	
	public Customer findById(int id) {
		for (int i = 0; i < Customer.getCount(); i++) {
			if (customerDB[i].getId() == id) {
				return customerDB[i];
			}
		}

		return null;
	}
	
	public static Customer[] getAll() {
		return customerDB;
	}
	
	public static void displayAllCustomer() {
		for (int i = 0; i < Customer.getCount(); i++) {
			getAll()[i].displayCustomerInfo();
		}
	}
}
