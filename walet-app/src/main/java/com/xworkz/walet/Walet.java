package com.xworkz.walet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Walet {

	@Value("Brown")
	private String color;
	@Value("PUMA")
	private BRAND brand;
	@Autowired
	private Material material;
	@Value("200.00")
	private double price;
	@Autowired
	private Money money;
	@Autowired
	private ATMCard atmCard;
	@Autowired
	private Photo photo;

	public Walet() {

		System.out.println(this.getClass().getSimpleName() + " Bean created");
	}

	@Override
	public String toString() {
		return "Walet [color=" + color + ", brand=" + brand + ", material=" + material + ", price=" + price + ", money="
				+ money + ", atmCard=" + atmCard + ", photo=" + photo + "]";
	}

	public Walet(@Value("kdh") String color, BRAND brand, Material material, double price, Money money, ATMCard atmCard,
			Photo photo) {
		super();
		this.color = color;
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.money = money;
		this.atmCard = atmCard;
		this.photo = photo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBrand(BRAND brand) {
		this.brand = brand;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public void setAtmCard(ATMCard atmCard) {
		this.atmCard = atmCard;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

}
