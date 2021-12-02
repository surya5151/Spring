package com.xworkz.cctv;

public class Photo {

	private String size;
	private double price;

	public Photo() {
		System.out.println(this.getClass().getSimpleName() + " Bean created ");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Photo(String size, double price) {
		super();
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Photo [size=" + size + ", price=" + price + "]";
	}

}
