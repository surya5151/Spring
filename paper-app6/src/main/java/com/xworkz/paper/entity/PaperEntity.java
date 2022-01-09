package com.xworkz.paper.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="paper_table")
@NamedQuery(name="PaperEntity.getnewsPaperObject", query="from PaperEntity where newsPaperName=:name")
@NamedQuery(name="PaperEntity.getLanguageObject", query = "from PaperEntity where language=:name")
public class PaperEntity implements java.io.Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="PAPER_ID")
	private int paperID;
	
	@Column(name="NEWSPAPER_NAME")
	private String newsPaperName;

	@Column(name="PRICE")
	private double price;

	@Column(name="LANGUAGE")
	private String language;

	@Column(name="NO_OF_PAGES")
	private short noOFPages;
	
	
	
	public PaperEntity() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@Override
	public String toString() {
		return "PaperEntity [paperID=" + paperID + ", newsPaperName=" + newsPaperName + ", price=" + price
				+ ", language=" + language + ", noOFPages=" + noOFPages + "]";
	}

	public PaperEntity(int paperID, String newsPaperName, double price, String language, short noOFPages) {
		super();
		this.paperID = paperID;
		this.newsPaperName = newsPaperName;
		this.price = price;
		this.language = language;
		this.noOFPages = noOFPages;
	}

	public int getPaperID() {
		return paperID;
	}

	public void setPaperID(int paperID) {
		this.paperID = paperID;
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
