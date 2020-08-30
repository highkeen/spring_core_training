package com.highkeen.training.pojo;

import java.io.Closeable;
import java.nio.file.Path;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LCBean implements InitializingBean,DisposableBean {

	private Closeable closeable;
	public LCBean() {
		super();
		System.out.println("LCBean created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("LCBean @PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LCBean afterPropertiesSet");
		closeable=Path.of("/").getFileSystem();
	}
	
	public void doWork() {
		System.out.println("LCBean dowork");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("LCBean before destroy");
		closeable.close();
	}

	@PreDestroy /*clean up*/
	public void predestroy() throws Exception {
		System.out.println("LCBean @PreDestroy");
	}

}
