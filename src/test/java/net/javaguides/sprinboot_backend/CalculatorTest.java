package net.javaguides.sprinboot_backend;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests")
class CalculatorTest {
	
	Calculator  cal;
	
	@BeforeEach
	void initializeCalculator() {
		System.out.println("====initializeCalculator=====");
		cal = new Calculator();
	}
	
	@AfterEach
	void closeCalcuator() {
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
