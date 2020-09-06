package com.highkeen.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
public class AppDay3 {
	public static void main(String[] args) {
		System.out.println("Application started...");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppDay3.class);
		Object data = applicationContext.getBean("data");
		System.out.println(data);
		
		Object emp=applicationContext.getBean("conditionalEmployee");
		
		System.out.println(emp);
				
		
//		String dependentData = applicationContext.getBean("dependentData",String.class);
//		System.out.println(dependentData);
		
		((AbstractApplicationContext) applicationContext).close();
	}

//	@Bean
//	public Employee anotherEmployee() {
//		Employee employee = new Employee();
//		employee.setName("another");
//		return employee;
//	}
//
//	@Bean
//	public Address address() {
//		Address address = new Address("line1", "line2", "1234");
//		return address;
//	}

}
