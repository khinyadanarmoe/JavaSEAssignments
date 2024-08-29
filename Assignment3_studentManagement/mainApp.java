package Assignment3_studentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApp {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Student[] studentArr = new Student[100];
	

	public static void main(String[] args) throws NumberFormatException, IOException {

	    String input;
		do {
			Student student = getStudentInfo();
			studentArr[Student.getStudentCount()-1] = student;
			System.out.print("Do you want to enter another student: (yes/no): ");
			input = br.readLine();
			
		} while (input.equalsIgnoreCase("yes"));
		
		display();	

	}

	public static Student getStudentInfo() throws IOException {

	    System.out.print("Enter Student Name: ");
	    String name = br.readLine();
	    System.out.print("Enter Student Nickname: ");
	    String nickname = br.readLine();
	    System.out.print("Enter Student Address1: ");
	    String address1 = br.readLine();
	    System.out.print("Enter Student Address2 (or press Enter to skip): ");
	    String address2 = br.readLine();

	    System.out.print("Enter marks for 6 subjects (or less, defaults to 0): \n");

	    int[] marks = new int[6];
	    for (int i = 0; i < 6; i++) {
	        System.out.print("Subject " + (i + 1) + ": ");
	        String input = br.readLine();
	        int mark = input.isEmpty() ? 0 : Integer.parseInt(input);
	        marks[i] = mark;
	    }

	    Student student;
	    if (address2.isEmpty()) {
	        student = new Student(name, nickname, address1, marks);
	    } else {
	        student = new Student(name, nickname, address1, address2, marks);
	    }

	    return student;
	}


	public static void display() {
		for (int i = 0; i< Student.getStudentCount(); i++) {
			studentArr[i].display();
		}
		
		System.out.println("Mean Mark " + Student.getMeanMark());
		System.out.println("Total Students " + Student.getStudentCount());
	}
}
