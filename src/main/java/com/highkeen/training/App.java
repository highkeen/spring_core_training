package com.highkeen.training;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;

import com.highkeen.training.pojo.Address;
import com.highkeen.training.pojo.Employee;
import com.highkeen.training.pojo.PrototypePojo;

/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
public class App {
	public static void main(String[] args) {
		System.out.println("Application started...");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		// applicationContext.register(Employee.class);
		// applicationContext.refresh();
		/* dependency lookup */

		System.out.println("container initialized");
		Employee employee = applicationContext.getBean("anotherEmployee", Employee.class);

		Employee employee1 = applicationContext.getBean("employee", Employee.class);

		System.out.println(employee.getName());

		System.out.println(employee == employee1);

//		System.out.println(App.class.getCanonicalName());
//		System.out.println(App.class.getName());

		PrototypePojo pojo1 = applicationContext.getBean(PrototypePojo.class);
		PrototypePojo pojo2 = applicationContext.getBean(PrototypePojo.class);

		System.out.println(pojo1 == pojo2);

		Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		((AbstractApplicationContext) applicationContext).close();
	}

	@Bean
	public Employee anotherEmployee() {
		Employee employee = new Employee();
		employee.setName("another");
		return employee;
	}

	@Bean
	@Scope("prototype")
	public Address address1() {
		Address address = new Address("line1", "line2", "1234");
		System.out.println("Bean creted address1");
		return address;
	}
	
	@Bean
	public Address address2() {
		Address address = new Address("line12", "line22", "12342");
		System.out.println("Bean creted address2");
		return address;
	}

}
