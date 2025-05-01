package net.javaguides.sprinboot_backend;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	
	private List<Student> studentsList = new ArrayList<>();

	public List<Student> getStudentsList() {
		return studentsList;
	}
	
	public void addStudent(Student student) {
		studentsList.add(student);
	}
	

	public Student getStudent(int studentId) {
		
		return studentsList.stream()
				.filter((student) -> student.getStudentId()==studentId)
				.findFirst()
				.orElse(null);
	}
	
	public Student getStudentByName(String name) {
		return studentsList.stream()
				.filter((student) -> student.getStudentName().equals(name))
				.findFirst()
				.orElseThrow(()-> new StudentNotFoundException("Student Not Found"));
	}
}
