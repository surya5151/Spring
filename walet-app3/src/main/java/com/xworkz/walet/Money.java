package com.xworkz.walet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Money {

	@Value("${m1}")
	private String type;
	@Value("${m2}")
	private double size;
	@Value("${m3}")
	private boolean isCoinORNote;
	@Value("${m4}")
	private String color;

	public Money() {
		System.out.println(this.getClass().getSimpleName() + "Bean created");
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

	public void setType(String type) {
		this.type = type;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void setCoinORNote(boolean isCoinORNote) {
		this.isCoinORNote = isCoinORNote;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
