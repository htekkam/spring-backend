package net.javaguides.sprinboot_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication(scanBasePackages = "com.external",exclude = AopAutoConfiguration.class)
@SpringBootApplication
public class SprinbootBackendApplication implements  CommandLineRunner {

	public static void main(String[] args) {
	  //ConfigurableApplicationContext context=	
		System.out.println("Spring application run method");
			  SpringApplication.run(SprinbootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//any preprocessing logic
		System.out.println("Executing command line runner");
	}

}
