package com.xworkz.paper.service;

import java.util.HashMap;

import com.xworkz.paper.dto.PaperDTO;

public interface paperService {
	
	//HashMap<String, String> map = new HashMap<String, String>();

	
	boolean validatePaperDTO(PaperDTO paperDTO);
	
	boolean savePaperDTO(PaperDTO paperDTO);
	
	boolean validateNewsPaperName(String newsPaperName);
	
	PaperDTO getPaperDTO(String newsPaperName);
	
	
	boolean validateLanguage(String language);
	PaperDTO getPaperDTO1(String language);
	
	
		
	

}
