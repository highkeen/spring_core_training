package com.highkeen.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;

import com.highkeen.training.pojo.Employee;

@Configuration
public class Beans {

	@Profile("default")
	@Bean(name = "data")
	String defaultData() {
		return "default data";
	}
	

	@Profile("dev")
	@Bean(name = "data")
	String devData() {
		return "dev data";
	}
	
	@Bean
	@DependsOn("data")
	//@Profile("dev123")
	String dependentData() {
		return "dependent  data";
	}
	
	
	@Bean
	@Conditional(EmployeeCondition.class)
	public Employee conditionalEmployee() {
		Employee e=new Employee();
		e.setName("name");
		return e;
	}
	
	
	
}
