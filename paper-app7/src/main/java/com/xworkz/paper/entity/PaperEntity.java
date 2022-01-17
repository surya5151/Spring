package com.xworkz.paper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "paper_table")
@NamedQueries({
		@NamedQuery(name = "PaperEntity.getnewsPaperObject", query = "from PaperEntity where newsPaperName=:name"),
		@NamedQuery(name = "PaperEntity.getLanguageObject", query = "from PaperEntity where language=:name"),
		@NamedQuery(name = "PaperEntity.getAllNewsPaper", query = "from PaperEntity"),
		@NamedQuery(name = "deleteNewsPaper", query = "from PaperEntity where newsPaperName=:name")

})

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class PaperEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "PAPER_ID")
	private int paperID;

	@Column(name = "NEWSPAPER_NAME")
	private String newsPaperName;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "NO_OF_PAGES")
	private short noOFPages;

}
