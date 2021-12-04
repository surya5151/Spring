package com.xworkz.walet;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Photo {

	private String size;

	private double price;

	public Photo() {
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

	@Override
	public String toString() {
		return "Photo [size=" + size + ", price=" + price + "]";
	}

	public Photo (@Value("40inc") String size, @Value("200") double price) {
		
		this.size = size;
		this.price = price;
	}

	
}
