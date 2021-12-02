package com.xworkz.cctv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "spring.xml";

		ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfigFile);

		System.out.println("springContiner is created..!!!!! " + springContiner.hashCode());

		CCTV cctv = springContiner.getBean(CCTV.class);
		System.out.println(cctv);

		Wallet wallet = springContiner.getBean(Wallet.class);
		System.out.println(wallet);

		Material material = springContiner.getBean(Material.class);
		System.out.println(material);

		Money money = springContiner.getBean(Money.class);
		System.out.println(money);

		ATMCard atmCard = springContiner.getBean(ATMCard.class);
		System.out.println(atmCard);

		Photo photo = springContiner.getBean(Photo.class);
		System.out.println(photo);

		Connection connection = springContiner.getBean(Connection.class);
		System.out.println(connection);

	}
}