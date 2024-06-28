package mvcPatterns;

public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo, String studentClassName) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
		System.out.println("Class Name: " + studentClassName);
	}
}
