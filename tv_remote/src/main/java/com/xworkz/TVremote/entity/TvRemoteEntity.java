package com.xworkz.TVremote.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tv_remote ")
public class TvRemoteEntity implements java.io.Serializable {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "TVREMOTE_ID")
	private int tvRemoteID;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "IS_POWER_BUTTON_WORKING")
	private boolean isPowerButtonWorking;

	@Column(name = "NAME")
	private String name;

	@Column(name = "NO_OF_CELLS")
	private int noOfCells;

	@Column(name = "PRICE")
	private double price;

	public TvRemoteEntity() {
		System.out.println("invoked no-org cons from TvRemoteEntity()");
	}

	@Override
	public String toString() {
		return "TvRemoteEntity [tvRemote=" + tvRemoteID + ", color=" + color + ", isPowerButtonWorking="
				+ isPowerButtonWorking + ", name=" + name + ", noOfCells=" + noOfCells + ", price=" + price + "]";
	}

	public TvRemoteEntity(int tvRemote, String color, boolean isPowerButtonWorking, String name, int noOfCells,
			double price) {
		super();
		this.tvRemoteID = tvRemote;
		this.color = color;
		this.isPowerButtonWorking = isPowerButtonWorking;
		this.name = name;
		this.noOfCells = noOfCells;
		this.price = price;
	}

	public int getTvRemote() {
		return tvRemoteID;
	}

	public void setTvRemoteID(int tvRemote) {
		this.tvRemoteID = tvRemote;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPowerButtonWorking() {
		return isPowerButtonWorking;
	}

	public void setPowerButtonWorking(boolean isPowerButtonWorking) {
		this.isPowerButtonWorking = isPowerButtonWorking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
