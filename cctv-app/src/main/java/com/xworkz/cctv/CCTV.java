package com.xworkz.cctv;

public class CCTV {

	private String brand;
	private int camerasize;
	private double price;
	private String color;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCamerasize() {
		return camerasize;
	}

	public void setCamerasize(int camerasize) {
		this.camerasize = camerasize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public CCTV() {
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public CCTV(String brand, int camerasize, double price, String color) {

		this.brand = brand;
		this.camerasize = camerasize;
		this.price = price;
		this.color = color;
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public CCTV(String brand, int camerasize) {
		super();
		this.brand = brand;
		this.camerasize = camerasize;
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public void record() {
		System.out.println("invoked record");

	}

	public void autoDelete() {
		System.out.println("invoked autoDelet");

	}

}
