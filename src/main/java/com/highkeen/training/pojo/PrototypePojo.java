package com.highkeen.training.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") /*always create a new object*/
public class PrototypePojo {
	String name = "dkfhgkjdfhgkjdfhgjkhdfkgh";

	public PrototypePojo() {
		super();
		System.out.println("PrototypePojo created");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
