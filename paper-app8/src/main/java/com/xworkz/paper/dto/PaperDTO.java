package com.xworkz.paper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PaperDTO {
	
	private int paperID; 
	
	private String newsPaperName;
	
	private double price;
	
	private String language;
	
	private short noOFPages;

	
}
