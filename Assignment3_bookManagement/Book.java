package Assignment3_bookManagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Book {

	// create books with title or title and subtitle
	// total numbers of books
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static int bookCount = 0;
	private String title;
	private String subtitle;

	public Book(String title, String subtitle) {

		this.title = title;
		this.subtitle = subtitle;
		bookCount++;

	}

	public Book(String title) {

		this.title = title;
		bookCount++;
	}

	public void setBookDetails(String title, String subtitle) {

		this.title = title;
		this.subtitle = subtitle;

	}

	public String getBookTitle() {

		return this.title;
	}

	public String getBookSubtitle() {

		return this.subtitle;
	}
	
	public static int getBookCount() {

		return bookCount;

	}

	public void display() {

		if (subtitle == null) {
			System.out.println("Title: " + this.title);
		} else {
			System.out.println("Title: " + this.title);
			System.out.println("Subtitle: " + this.subtitle + "\n");
		}

	}

}
