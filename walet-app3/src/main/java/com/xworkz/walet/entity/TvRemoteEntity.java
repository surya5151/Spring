package com.xworkz.walet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tv_remote")
public class TvRemoteEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TVREMOTE_ID")
	private int tvRemote;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "NO_OF_CELLS")
	private int noOfCells;
	@Column(name = "IS_POWER_BUTTON_WORKING")
	private boolean isPowerButtonWorking;
	
	public TvRemoteEntity() {
		System.out.println("invoked no-org cons");
	}

	@Override
	public String toString() {
		return "TvRemoteEntity [name=" + name + ", color=" + color + ", price=" + price + ", noOfCells=" + noOfCells
				+ ", isPowerButtonWorking=" + isPowerButtonWorking + "]";
	}

	public TvRemoteEntity(String name, String color, double price, int noOfCells, boolean isPowerButtonWorking) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.noOfCells = noOfCells;
		this.isPowerButtonWorking = isPowerButtonWorking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}

	public boolean isPowerButtonWorking() {
		return isPowerButtonWorking;
	}

	public void setPowerButtonWorking(boolean isPowerButtonWorking) {
		this.isPowerButtonWorking = isPowerButtonWorking;
	}

	
	
}
