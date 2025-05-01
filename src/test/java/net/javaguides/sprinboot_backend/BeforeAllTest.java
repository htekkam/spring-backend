package net.javaguides.sprinboot_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BeforeAllTest {
	
	static Calculator  cal;
	
	@BeforeAll
	static void initializeCalculator() {
		System.out.println("====initializeCalculator=====");
		cal = new Calculator();
	}
	
	@AfterAll
	static void closeCalcuator() {
		System.out.println("====resetting calculator====");
		cal=null;
	}

	@Test
	@DisplayName("Addition test")
	void test() {
		//Calculator calculator = new Calculator();
		int actualResult = cal.add(10, 20);
		assertEquals(30, actualResult);
	}
	
	//@Disabled
	@Test
	void assertNotEqualsTest() {
		//Calculator cal = new Calculator();
		int actualResult = cal.add(10, 10);
		assertNotEquals(15, actualResult);
	}

}
