package com.external;

import org.springframework.stereotype.Component;

@Component
public class TestClass {

	public TestClass() {
		System.out.println("Test class scanned");
	}
}
