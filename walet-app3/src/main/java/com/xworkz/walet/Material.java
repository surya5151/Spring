package com.xworkz.walet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Material {

	private double size;
	private String type;
	private float thickness;
	private double price;

	public Material() {
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

	@Override
	public String toString() {
		return "Material [size=" + size + ", type=" + type + ", thickness=" + thickness + ", price=" + price + "]";
	}

	public Material(@Value("12") double size, @Value("xyz") String type, @Value("75") float thickness,
			@Value("300") double price) {
		super();
		this.size = size;
		this.type = type;
		this.thickness = thickness;
		this.price = price;
	}

	@Value("35")
	public void setSize(double size) {
		this.size = size;
	}

	@Value("abc")
	public void setType(String type) {
		this.type = type;
	}

	@Value("20")
	public void setThickness(float thickness) {
		this.thickness = thickness;
	}

	@Value("500")
	public void setPrice(double price) {
		this.price = price;
	}

}
