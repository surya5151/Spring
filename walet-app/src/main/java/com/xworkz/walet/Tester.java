package com.xworkz.walet;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfgFile = "springWalet.xml";

		ClassPathXmlApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfgFile);

		System.out.println("spring continer is created " + springContiner.hashCode());

		Walet walet = springContiner.getBean(Walet.class);
		System.out.println(walet);

		Material material = springContiner.getBean(Material.class);
		System.out.println(material);

		Money money = springContiner.getBean(Money.class);
		System.out.println(money);

		ATMCard atmCard = springContiner.getBean(ATMCard.class);
		System.out.println(atmCard);

		Photo photo = springContiner.getBean(Photo.class);
		System.out.println(photo);

	}

}
