package com.highkeen.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.highkeen.training.pojo.Address;
import com.highkeen.training.pojo.Employee2;

/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
public class AppDay2 {
	public static void main(String[] args) {
		System.out.println("Application started...");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppDay2.class);
		
		Employee2 employee = applicationContext.getBean(Employee2.class);
		
		System.out.println(employee.getAddress1());
		
		Address address= applicationContext.getBean("address1",Address.class);
		
		System.out.println(address);
		
		System.out.println(address==employee.getAddress1());
		

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
