package com.fserrano.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	private String name;

	public HelloWorld(final String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello " + name);
	}

	public static void main( String[] args ) {
		final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
		context.close();
	}
}
