package com.highkeen.training.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Employee2 {

	@Autowired
	private Address address1;

	public Employee2() {
		super();
		System.out.println("employee2 created");
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

}
