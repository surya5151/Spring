package com.xworkz.cctv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "spring.xml";

		ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfigFile);

		System.out.println("springContiner is created " + springContiner.hashCode());

		CCTV cctv = springContiner.getBean(CCTV.class);
		System.out.println(cctv.getBrand());
		System.out.println(cctv.getCamerasize());
		System.out.println(cctv.getPrice());
		System.out.println(cctv.getColor());

		String string = springContiner.getBean(String.class);
		System.out.println("String vlaue: " + string.hashCode());

		Byte byt = springContiner.getBean(Byte.class);
		System.out.println("Byte value: " + byt.hashCode());

		Short short1 = springContiner.getBean(Short.class);
		System.out.println("Short value: " + short1);

		Integer integer = springContiner.getBean(Integer.class);
		System.out.println("Integer value: " + integer.hashCode());

		Long long1 = springContiner.getBean(Long.class);
		System.out.println("Long value:" + long1);

		Double double1 = springContiner.getBean(Double.class);
		System.out.println("Double value: " + double1);
		
		Float float1= springContiner.getBean(Float.class);
		System.out.println("Float value:"+float1);
		
		Character character =springContiner.getBean(Character.class);
		System.out.println("charctor value: "+character);

		Boolean boolean1 = springContiner.getBean(Boolean.class);
		System.out.println("Boolean is: "+boolean1);

//		cctv.record();
//		cctv.autoDelete();

//		CCTV cctv2 =new CCTV("mi",12);
//		System.out.println(cctv2);

//		CCTV cctv3= new CCTV("samsung",12,2000, "block");
//		System.out.println(cctv3);

	}
}