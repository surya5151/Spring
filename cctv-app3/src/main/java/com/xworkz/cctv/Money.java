package com.xworkz.cctv;

public class Money {

	private String type;
	private double size;
	private boolean isCoinORNote;
	private String color;

	public Money() {
		System.out.println(this.getClass().getSimpleName() + " Bean created");
	}

	@Override
	public String toString() {
		return "Money [type=" + type + ", size=" + size + ", isCoinORNote=" + isCoinORNote + ", color=" + color + "]";
	}

	public Money(String type, double size, boolean isCoinORNote, String color) {
		super();
		this.type = type;
		this.size = size;
		this.isCoinORNote = isCoinORNote;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isCoinORNote() {
		return isCoinORNote;
	}

	public void setCoinORNote(boolean isCoinORNote) {
		this.isCoinORNote = isCoinORNote;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
