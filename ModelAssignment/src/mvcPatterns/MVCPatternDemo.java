package mvcPatterns;

public class MVCPatternDemo {

	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("John");
		
		controller.setStudentClassName("English");
		
		controller.updateView();

	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		student.setClassName("Calculus");
		return student;
	}

}
