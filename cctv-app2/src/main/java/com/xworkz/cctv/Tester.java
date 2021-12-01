package com.xworkz.cctv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "spring.xml";

		ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfigFile);

		System.out.println("springContiner is created " + springContiner.hashCode());

		Wallet wallet = springContiner.getBean(Wallet.class);		
		System.out.println(wallet.getClass().getSimpleName());
		
		System.out.println(wallet.getBrand());
		System.out.println(wallet.getColor());
		System.out.println(wallet.getPrice());
	
//
//		Wallet wallet2= new Wallet("blue", "kkkk", null, 400, null, null, null);
//		System.out.println(wallet2.getBrand());
//		System.out.println(wallet2.getColor());
//		System.out.println(wallet2.getPrice());
		
		Material material = new Material();
		System.out.println(material.getPrice());
		
		System.out.println("................................");
		Material material2 = new Material(9.0, "jkdfsh", 3450.245f, 2000.00);
		System.out.println(material2.getSize());
		System.out.println(material2.getThickness());
		System.out.println(material2.getType());
		System.out.println(material2.getPrice());

		
//		Object object =springContiner.getBean("walletID");
//		System.out.println(object.getClass().getSimpleName());
//		
//		Wallet wallet2=(Wallet)object;
//		System.out.println(wallet2.getClass().getSimpleName());
		
	
		Wallet wallet2 = springContiner.getBean(Wallet.class);
		System.out.println(wallet2);
		
		Wallet wallet3 = springContiner.getBean(Wallet.class);
		System.out.println(wallet3);
		
		Wallet wallet4 = springContiner.getBean(Wallet.class);
		System.out.println(wallet4);
		

	}
}