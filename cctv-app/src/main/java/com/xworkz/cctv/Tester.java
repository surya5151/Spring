package com.xworkz.cctv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "spring.xml";

		ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfigFile);

		System.out.println("springContiner is created " + springContiner);
	}
}