package com.pablos.pattern.mvc;

public class MVCPatternMain {

	public static void main(String[] args) {

		Student model = retriveStudentFromDatabase();

		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		controller.setStudentName("Pawel");
		
		controller.updateView();

	}

	public static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
