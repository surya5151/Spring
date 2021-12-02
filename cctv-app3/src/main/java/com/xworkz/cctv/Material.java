package com.xworkz.cctv;

public class Material {
	
	private double size;
	private String type;
	private float thickness;
	private double price;
	
	public Material() {	
		
		System.out.println(this.getClass().getSimpleName() + " Bean created");
		
	}
	

	@Override
	public String toString() {
		return "Material [size=" + size + ", type=" + type + ", thickness=" + thickness + ", price=" + price + "]";
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getThickness() {
		return thickness;
	}


	public void setThickness(float thickness) {
		this.thickness = thickness;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	

	
}
