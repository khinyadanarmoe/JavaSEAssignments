package Model;

public class Customer {
	
	private int id;
	private String name;
	private static int customerCount = 0;
	
	public Customer() {

	}
	
	public Customer(String name) {
		this.setName(name);
		customerCount++;
		this.setId(customerCount);
	}
	
	public static int getCount() {
		return customerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void displayCustomerInfo() {
		String str = "Customer: " + this.getName() +"\n";
		str += "ID: " + this.getId() +"\n";
		System.out.println(str);
	}

}
