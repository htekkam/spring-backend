package net.javaguides.sprinboot_backend;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

//class StudentTestTest {
//
//	
//	
//	@Test
//	void test() {
//		StudentTest test = new StudentTest();
//		boolean actual = test.isStringEmpty("hari");
//		//assertTrue(actual);
//		
//		//using Boolean supplier
//		//assertTrue(()-> actual);
//		
//		assertTrue(actual, "input not empty");
//		
//	}
//	
//	@Test
//	void testFalse() {
//		StudentTest test = new StudentTest();
//		boolean actual = test.isStringEmpty("hari");
//		assertFalse(actual);
//	}
//	
//	@Test
//	void getStudentByIdTestUsingNull() {
//		
//		
//		Student student = new Student(1, "hari");
//		StudentService studentService = new StudentService();
//		studentService.addStudent(student);
//		
//		Student actualObject = studentService.getStudent(12);
//		assertNull(actualObject);
//	}
//	
//	@Test
//	void getStudentByIdTestUsingNotNull(){
//		System.out.println("Assert not null");
//		StudentService service = new StudentService();
//		Student student = new Student(1, "hari");
//		service.addStudent(student);
//		Student actualObject = service.getStudent(1);
//		
//		assertNotNull(actualObject);
//	}
//	
//	@Test
//	void getStudentByIdTestUsingAssertThrows() {
//		System.out.println("Assert Throws");
//		
//		Student student = new Student(1, "hari");
//		StudentService studentService = new StudentService();
//		
//		studentService.addStudent(student);
//		
//		assertThrows(StudentNotFoundException.class, () ->{
//			studentService.getStudentByName("hari");
//		});
//		
//	}
//

