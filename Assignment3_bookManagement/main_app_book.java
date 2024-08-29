package Assignment3_bookManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_app_book {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String input;
		do {
			Book book = inputData();
			Library.addBook(book);

			System.out.print("Do you want to enter another book? (yes/no): ");
			input = br.readLine();
		} while (input.equalsIgnoreCase("yes"));

		display();
		
	}

	public static Book inputData() throws IOException {

		System.out.print("Enter details for a new book: ");
		String title = br.readLine();
		System.out.print("Subtitle (or press Enter to skip): ");
		String subtitle = br.readLine();

		Book book;
		if (subtitle.isEmpty()) {
			book = new Book(title);
		} else {
			book = new Book(title, subtitle);
		}

		return book;
	}
	
	public static void display() {
		
		System.out.println("Library Inventory: ");
		Library.display();
		System.out.println("Total number of books created: " + Book.getBookCount());
		
	}

}
