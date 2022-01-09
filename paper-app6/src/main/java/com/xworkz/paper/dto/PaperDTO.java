package com.xworkz.paper.dto;


public class PaperDTO {
	
	private String newsPaperName;
	
	private double price;
	
	private String language;
	
	private short noOFPages;

	public PaperDTO() {
		System.out.println("invoked PaperDTO()");
	}
	
	
	@Override
	public String toString() {
		return "PaperDTO [newsPaperName=" + newsPaperName + ", price=" + price + ", language=" + language
				+ ", noOFPages=" + noOFPages + "]"; 
	}

	public PaperDTO(String newsPaperName, double price, String language, short noOFPages) {
		super();
		this.newsPaperName = newsPaperName;
		this.price = price;
		this.language = language;
		this.noOFPages = noOFPages;
	}
	
	

	public String getNewsPaperName() {
		return newsPaperName;
	}

	public void setNewsPaperName(String newsPaperName) {
		this.newsPaperName = newsPaperName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public short getNoOFPages() {
		return noOFPages;
	}

	public void setNoOFPages(short noOFPages) {
		this.noOFPages = noOFPages;
	}

	
}
