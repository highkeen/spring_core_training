package com.highkeen.training.pojo;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Employee {

	public Employee() {
		super();
		System.out.println("employee created");
	}

	private String name = "samik";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
