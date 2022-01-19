package com.xworkz.paper.service;

import java.util.List;

import com.xworkz.paper.dto.PaperDTO;

public interface paperService {
	
	//HashMap<String, String> map = new HashMap<String, String>();

	
	boolean validatePaperDTO(PaperDTO paperDTO);
	
	boolean savePaperDTO(PaperDTO paperDTO);
	
	boolean validateNewsPaperName(String newsPaperName);
	
	PaperDTO getPaperDTO(String newsPaperName);
	
	
	boolean validateLanguage(String language);
	PaperDTO getPaperDTO1(String language);
	
	List<Object> getAllNewsPaper();
	
	boolean deleteNewsPaper(String newsPaperName);
	
	boolean updateNewsPaper(PaperDTO paperDTO);
 
	
		
	

}
