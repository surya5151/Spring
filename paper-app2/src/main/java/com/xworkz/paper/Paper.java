package com.xworkz.paper;

import org.springframework.stereotype.Component;


@Component
public class Paper {
	

	public Paper() {
		
		System.out.println(this.getClass().getSimpleName() +" Bean is created");
	}

}
