package Assignment3_bookManagement;

public class Library {

	public static Book[] bookList = new Book[100];

	public static Book[] addBook(Book book) {

		bookList[Book.getBookCount() - 1] = book;

		return bookList;
	}

	public static void display() {

		for (int i = 0; i < Book.getBookCount(); i++) {
			bookList[i].display();

		}
	}
}
