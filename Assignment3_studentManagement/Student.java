package Assignment3_studentManagement;

import java.util.Arrays;

public class Student {

	private String name;
	private String nickname;
	private String address1;
	private String address2;
	private int[] marks;
	
	private static int studentCount = 0;
	private static int allTotalMark = 0;
	
	public Student(String name, String nickname, String address1, int[] marks) {

		this.name = name;
		this.nickname = nickname;
		this.address1 = address1;
		this.marks = marks;
		studentCount++;
		allTotalMark += this.totalMark();
	}

	public Student(String name, String nickname, String address1, String address2, int[] marks) {

		this.name = name;
		this.nickname = nickname;
		this.address1 = address1;
		this.address2 = address2;
		this.marks = marks;
		studentCount++;
		allTotalMark += this.totalMark();
		
	}

	private int totalMark() {
		
		int total = 0;
		for (int i = 0; i < this.marks.length; i++) {
			total += marks[i];
		}
		return total;
	}

	public static double getMeanMark() {
		
		double mean = allTotalMark / studentCount;
		return mean;
	}
	
	public double calculateGPA() {
		
		int total = this.totalMark();
		double gpa = total/ 6;
		
		return gpa;
	}
	
	public static int getStudentCount() {
		return studentCount;
	}

	public void display() {
		
		System.out.println("Student Name: " + name);
		System.out.println("Nickname: " + nickname);
		System.out.println("Address1: " + address1);
		System.out.println("Address2: " + address2);
		System.out.println("Marks: " + Arrays.toString(this.marks));
		System.out.println("Student GPA: " + this.calculateGPA());
		
		
	}
}
